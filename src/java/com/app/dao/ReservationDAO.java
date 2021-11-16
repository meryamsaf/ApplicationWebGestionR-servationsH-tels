/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.beans.Reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author meryam
 */
public class ReservationDAO {
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
         
         
         public static ArrayList<Reservation> afficherReservation( String cin){
    
    ArrayList<Reservation> reservation= new ArrayList<>();
    
     
        try{
            Connection cnx=ReservationDAO.getConnection();
            Statement st=cnx.createStatement();
            String req="select* from RESERVATIONN  where ID_CLIENT like'"+cin+"' ";
            try (ResultSet rs = st.executeQuery(req)) {
                while(rs.next())
                {
                    Reservation res=new Reservation();
                    res.setId(rs.getInt("ID"));
                  res.setId_client(rs.getString("ID_CLIENT"));
                   res.setTypeCham(rs.getString("TYPECHAMBRE"));
                    res.setNomhotel(rs.getString("NOMHOTEL"));
                    res.setNbre_personne(rs.getInt("NBRPERSONNE"));
                    res.setNbrJour(rs.getInt("NBRJOUR"));
                
                   res.setDate_reser_debut(rs.getDate("DATE1"));
             
                    reservation.add(res);   
                }
            }
        }catch(SQLException e){
            System.out.print(e);
        }
        return  reservation;
               
   
}
             public static ArrayList<Reservation> GetAllReservation(){
    
    ArrayList<Reservation> reservation= new ArrayList<>();
    
     
        try{
            Connection cnx=ReservationDAO.getConnection();
            Statement st=cnx.createStatement();
            String req="select * from RESERVATIONN  ";
            try (ResultSet rs = st.executeQuery(req)) {
                if(rs.next())
                {
                    Reservation res=new Reservation();
                    res.setId(rs.getInt("ID"));
                  res.setId_client(rs.getString("ID_CLIENT"));
                   res.setTypeCham(rs.getString("TYPECHAMBRE"));
                    res.setNomhotel(rs.getString("NOMHOTEL"));
                    res.setNbre_personne(rs.getInt("NBRPERSONNE"));
                    res.setNbrJour(rs.getInt("NBRJOUR"));
                
                   res.setDate_reser_debut(rs.getDate("DATE1"));
             
                    reservation.add(res);   
                }
            }
        }catch(SQLException e){
            System.out.print(e);
        }
        return  reservation;
               
   
}
           public static String getNameByCin(String cin) throws SQLException{
      
            String name="";
            Connection cnx= ClientDAO.getConnection();
            Statement st=cnx.createStatement();
          try (ResultSet rs = st.executeQuery("select NOM,PRENOM ,CIN from CLIENT CIN like '"+cin+"'")) {
              if(rs.next())
              {
                  name=rs.getString("nom")+" "+rs.getString("prenom");
              }
          }
        catch(SQLException e){
            
        }
        return name;
      } 
              public static int inserer(Reservation r)
    {
        int status=0;
             
             
              
       
        try{
            try (Connection cnx = ReservationDAO.getConnection()) {
                PreparedStatement ps;
                ps = cnx.prepareStatement("insert into RESERVATIONN(ID_CLIENT, TYPECHAMBRE, NOMHOTEL,NBRPERSONNE,NBRJOUR,DATE1) values(?,?,?,?,?,?)");
             
               ps.setString(1, r.getId_client());
                ps.setString(2, r.getTypeCham());
                 ps.setString(3,r.getNomhotel());
                  ps.setInt(4,r.getNbre_personne());
               ps.setInt(5,r.getNbrJour());
                java.util.Date bDate =  r.getDate_reser_debut();
               SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
             String bdate = dateFormat.format(bDate);
                ps.setDate(6,java.sql.Date.valueOf(bdate));
               
                status=ps.executeUpdate();
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    }
               public static Reservation select(int id_res)
    {
        Reservation r= new Reservation();
        
        try{
            Connection cnx=ReservationDAO.getConnection();
            Statement st=cnx.createStatement();
        
            ResultSet rs=st.executeQuery("select * from reservationn where id="+id_res+" ");
            
            if(rs.next())
            {
                r.setId(rs.getInt("id"));
                r.setId_client(rs.getString("id_client"));
                r.setNomhotel(rs.getString("nomhotel"));
                r.setTypeCham(rs.getString("typechambre"));
                r.setNbre_personne(rs.getInt("nbrpersonne"));
                r.setNbrJour(rs.getInt("nbrjour"));
                r.setDate_reser_debut(rs.getDate("date1"));
            }
           
            rs.close();
        }catch(SQLException e){
            System.out.print(e);
        }
        return r;
    }
 
      public static int modifier(Reservation r)
    {
        
        
        try{
            Connection cnx=ReservationDAO.getConnection();
            PreparedStatement ps;
            
            ps= cnx.prepareStatement("update RESERVATIONN set DATE1=? ,TYPECHAMBRE=?, NOMHOTEL=? ,NBRPERSONNE=?, NBRJOUR=?, ID_CLIENT=? where ID=? ");
               java.util.Date bDate =  r.getDate_reser_debut();
               SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
               String bdate = dateFormat.format(bDate);
                ps.setDate(1,java.sql.Date.valueOf(bdate));
                
                ps.setString(2, r.getTypeCham());
                 ps.setString(3,r.getNomhotel());
                  ps.setInt(4,r.getNbre_personne());
               ps.setInt(5,r.getNbrJour());
               ps.setString(6,r.getId_client());
                 ps.setInt(7,r.getId());
                ps.executeUpdate();
            ps.close();
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return 1;
    }
          public static int deleteReservation(int id){
        int status=0;

        try{
            try (Connection cnx = ReservationDAO.getConnection()) {
                PreparedStatement ps;
              
                String req="delete from RESERVATIONN where ID="+id;
                ps = cnx.prepareStatement(req);
                status=ps.executeUpdate();
                
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    }
              
      public static ArrayList<Reservation> selectBycinhotelier(String id_hotelier){
    ArrayList<Reservation> reservation= new ArrayList<>();
    
        try{
            Connection cnx=ReservationDAO.getConnection();
            Statement st=cnx.createStatement();
           
         String req="select r.id, r.id_client,r.typechambre,r.nomhotel,r.nbrpersonne,r.nbrjour,r.date1,h.nom_hotel,h.cin_hotelier from reservationn as r join hotel as h on r.nomhotel=h.nom_hotel where h.cin_hotelier like '"+id_hotelier+"'";
         
             try (ResultSet rs = st.executeQuery(req) ){
                 while(rs.next())
                     
                 {
                     Reservation r=new Reservation();
                     r.setId(rs.getInt("id"));
                     r.setId_client(rs.getString("id_client"));
                     r.setNomhotel(rs.getString("nomhotel"));
                     r.setTypeCham(rs.getString("typechambre"));
                     r.setNbre_personne(rs.getInt("nbrpersonne"));
                     r.setNbrJour(rs.getInt("nbrjour"));
                     r.setDate_reser_debut(rs.getDate("date1"));
                     reservation.add(r);
                 }}
        }catch(SQLException e){
            System.out.print(e);
        }
      
        return reservation; 
   
    }

}

