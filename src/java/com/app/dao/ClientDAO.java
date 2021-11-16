/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.beans.Client;
import com.app.beans.Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author meryam
 */
public class ClientDAO {
      public static Connection getConnection(){
        
        Connection cnx=null;
    
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cnx=DriverManager.getConnection("jdbc:derby://localhost:1527/HotelBookingDB","root","root");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return cnx;
    }
      public static String getNameByCin(String cin) throws SQLException{
      
            String name="";
            Connection cnx= ClientDAO.getConnection();
            Statement st=cnx.createStatement();
          try (ResultSet rs = st.executeQuery("select nom, prenom from client as c,personne as p where c.cin=p.cin and cin like '"+cin+"'")) {
              if(rs.next())
              {
                  name=rs.getString("nom")+" "+rs.getString("prenom");
              }
          }
        catch(SQLException e){
            
        }
        return name;
      } 
     
  
     
       public static int Ajouter(Client clt){
        
        int status=0;
        
        try{
            try (Connection cnx = ClientDAO.getConnection()) {
                PreparedStatement ps;
                ps = cnx.prepareStatement("insert into CLIENT (CIN, NOM, PRENOM, TELEPHONE, ADRESS,MAIL,PASSWORD) values(?,?,?,?,?,?,?)");
                ps.setString(1, clt.getCin());
                ps.setString(2, clt.getNom());
                ps.setString(3, clt.getPrenom());
                ps.setString(4, clt.getTelephone() );
                ps.setString(5, clt.getAdress());
                ps.setString(6, clt.getMail());
                ps.setString(7, clt.getPassword());
          
                
                
                status=ps.executeUpdate();
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    }  
           public static ArrayList<Client> afficher()
    {
        ArrayList<Client> clients= new ArrayList<>();
        
        
        try{
            Connection cnx=ClientDAO.getConnection();
            Statement st=cnx.createStatement();
            String req="select * from CLIENT ";
            try (ResultSet rs = st.executeQuery(req)) {
                while(rs.next())
                {
                    Client clt=new Client();
                    
                   clt.setCin(rs.getString("cin"));
                    clt.setNom(rs.getString("nom"));
                    clt.setPrenom(rs.getString("prenom"));
                    clt.setTelephone(rs.getString("telephone"));
                    clt.setAdress(rs.getString("adress"));
                    clt.setMail(rs.getString("mail"));
                    
                   
                    
                    clients.add(clt);   
                }
            }
        }catch(SQLException e){
            System.out.print(e);
        }
        return clients;
    }
              public static int modifier(String cin, String tel, String adr, String pwd)
    {
        
        
        try{
            Connection cnx=ClientDAO.getConnection();
            PreparedStatement ps;
            
            ps= cnx.prepareStatement("update CLIENT set TELEPHONE=? ,ADRESS=?, PASSWORD=?  where CIN like '"+cin+"'");
            ps.setString(1,tel);
            ps.setString(2,adr);
            ps.setString(3,pwd);
           
            
            ps.executeUpdate();
            ps.close();
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return 1;
    }
     
              
   public static ArrayList<Hotel> afficherHotel(){
    
    ArrayList<Hotel> hotels= new ArrayList<>();
    
           try{
            Connection cnx=ClientDAO.getConnection();
            Statement st=cnx.createStatement();
            String req="select ETOILE,NOM_HOTEL,LOCATION,SERVICES,VILLE,TELEPHONE_HOT from HOTEL  ";
            try (ResultSet rs = st.executeQuery(req)) {
                while(rs.next())
                {
                    Hotel hot=new Hotel();
                     hot.setEtoile(rs.getInt("ETOILE"));
                   hot.setNom_hotel(rs.getString("NOM_HOTEL"));
                    hot.setLocation(rs.getString("LOCATION"));
                    hot.setServices(rs.getString("SERVICES"));
                  
                    hot.setVille(rs.getString("VILLE"));
                    hot.setTelephone_hotel(rs.getString("TELEPHONE_HOT"));
                    
                   
                    
                    hotels.add(hot);   
                }
            }
        }catch(SQLException e){
            System.out.print(e);
        }
        return hotels;
    
   }
       public static int deleteClient(String cin){
        int status=0;

        try{
            try (Connection cnx = ReservationDAO.getConnection()) {
                PreparedStatement ps;
              
                String req="delete from CLIENT where CIN like '"+cin+"' ";
                ps = cnx.prepareStatement(req);
                status=ps.executeUpdate();
                
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    }
   public static Client select(String cin){
        Client c= new Client();
        
        try{
            Connection cnx=ReservationDAO.getConnection();
            Statement st=cnx.createStatement();
        
            ResultSet rs=st.executeQuery("select * from CLIENT where CIN like ='"+cin+"'  ");
            
            if(rs.next())
            {
                c.setCIN(rs.getString("CIN"));
                c.setNOM(rs.getString("NOM"));
                c.setPRENOM(rs.getString("PRENOM"));
                c.setTELEPHONE(rs.getString("TELEPHONE"));
                c.setADRESS(rs.getString("ADRESS"));
                c.setMAIL(rs.getString("MAIL"));
                c.setPASSWORD(rs.getNString("PASSWORD"));
            }
           
            rs.close();
        }catch(SQLException e){
            System.out.print(e);
        }
        return c;
    }
      
      
     
      
   
}

