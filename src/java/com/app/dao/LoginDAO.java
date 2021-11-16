/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.beans.Admin;
import com.app.beans.Client;
import com.app.beans.Hotelier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author meryam
 */
public class LoginDAO {
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
        
        
          public  Client checkLoginClient(String cin, String password) throws SQLException,
            ClassNotFoundException {
            
             Client personne=null;
         try{ 
        Connection conn = LoginDAO.getConnection();
            String sql1 = "SELECT * FROM CLIENT WHERE CIN=? AND PASSWORD=? ";
            PreparedStatement statement = conn.prepareStatement(sql1);
            statement.setString(1, cin);
            statement.setString(2, password);
             ResultSet rs = statement.executeQuery();
             if(rs.next()){
                  personne=new Client();
                  personne.setCIN(cin);
                  personne.setNOM(rs.getString("NOM"));
                  personne.setPRENOM(rs.getString("PRENOM"));
                 personne.setTELEPHONE(rs.getString("TELEPHONE"));
                  personne.setADRESS(rs.getString("ADRESS"));
                  personne.setMAIL(rs.getString("MAIL"));
                  personne.setPASSWORD(password);
                  personne.setSTATU(rs.getInt("STATUT"));
             }     
            }catch(SQLException e){
            System.out.print(e);
        }
         return personne;
          } 
           public Hotelier checkLoginHotelier(String cin, String password) throws SQLException,
            ClassNotFoundException {
            
             Hotelier personne=null;
          
             try{
             Connection conn = LoginDAO.getConnection();
            String sql2 = "SELECT * FROM HOTELIER WHERE CIN_HOTELIER=? AND PASSWORD=? ";
            PreparedStatement statement1 = conn.prepareStatement(sql2);
            statement1.setString(1, cin);
            statement1.setString(2, password);
             ResultSet rs1 = statement1.executeQuery();
             if(rs1.next()){
                  personne=new Hotelier();
                  personne.setCIN(cin);
                  personne.setNOM(rs1.getString("NOM"));
                  personne.setPRENOM(rs1.getString("PRENOM"));
                  personne.setTELEPHONE(rs1.getString("TELEPHONE"));
                 
                  personne.setMAIL(rs1.getString("MAIL"));
                   personne.setPASSWORD(password);
                  personne.setSTATU(rs1.getInt("STATUT"));
             } 
                }catch(SQLException e){
            System.out.print(e);
        }
             return personne;
           }
           
            public Admin checkLoginAdmin(String cin, String password) throws SQLException,
            ClassNotFoundException {
            
             Admin personne=null;
      try{
          Connection conn = LoginDAO.getConnection();
            String sql3 = "SELECT * FROM ADMIN WHERE CIN=? AND PASSWORD=? ";
            PreparedStatement statement2 = conn.prepareStatement(sql3);
            statement2.setString(1, cin);
            statement2.setString(2, password);
             ResultSet rs2 = statement2.executeQuery();
             if(rs2.next()){
                  personne=new Admin();
                  personne.setCIN(cin);
                  personne.setNOM(rs2.getString("NOM"));
                  personne.setPRENOM(rs2.getString("PRENOM"));
                personne.setTELEPHONE(rs2.getString("TELEPHONE"));
                  personne.setADRESS(rs2.getString("ADRESS"));
                  personne.setMAIL(rs2.getString("MAIL"));
                  personne.setPASSWORD(rs2.getString("PASSWORD"));
                  personne.setSTATU(rs2.getInt("STATUT"));
                  
             }
          
               }catch(SQLException e){
            System.out.print(e);
        }
        
return personne;
 }
     
            
          
         
}