/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.beans.Commentaire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author meryam
 */
public class CommentaireDAO {
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
      
      
         public static int Ajouter(Commentaire c){
        
        int status=0;
        
        try{
            try (Connection cnx = CommentaireDAO.getConnection()) {
                PreparedStatement ps;
                ps = cnx.prepareStatement("insert into commentaire(CIN,NOM,PRENOM,MESSAGE,MAIL,PHONE) values(?,?,?,?,?,?)");
                ps.setString(1, c.getCin());
                ps.setString(2, c.getNom());
                ps.setString(3, c.getPrenom());
                ps.setString(4, c.getMessage());
                ps.setString(5, c.getMail());
                ps.setString(6, c.getPhone());
              
                
                status=ps.executeUpdate();
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    }
         
         
  public static ArrayList<Commentaire> afficherCommentaire(){
    ArrayList<Commentaire> commentaires= new ArrayList<>();
    
           try{
            Connection cnx=ClientDAO.getConnection();
            Statement st=cnx.createStatement();
            String req="select * from COMMENTAIRE ";
            try (ResultSet rs = st.executeQuery(req)) {
                while(rs.next())
                {
                   Commentaire com=new Commentaire();
                     com.setId(rs.getInt("ID"));
                   com.setCin(rs.getString("CIN"));
                    com.setNom(rs.getString("NOM"));
                    com.setPrenom(rs.getString("PRENOM"));
                  com.setPhone(rs.getString("PHONE"));
                    com.setMessage(rs.getString("MESSAGE"));
                    com.setMail(rs.getString("MAIL"));
                    
                   
                    
                    commentaires.add(com);   
                }
            }
        }catch(SQLException e){
            System.out.print(e);
        }
        return  commentaires;
    
   }
}
