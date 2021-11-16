/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.beans.Hotel;
import com.app.beans.Hotelier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author meryam
 */
public class HotelierDao {
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
       public static int Ajouter(Hotelier hot){
        
        int status=0;
        
        try{
            try (Connection cnx = HotelierDao.getConnection()) {
                PreparedStatement ps;
                ps = cnx.prepareStatement("insert into Hotelier (CIN_HOTELIER, NOM, PRENOM, TELEPHONE,MAIL,PASSWORD) values(?,?,?,?,?,?)");
                ps.setString(1, hot.getCin());
                ps.setString(2, hot.getNom());
                ps.setString(3, hot.getPrenom());
                ps.setString(4,hot.getTelephone());
                ps.setString(5, hot.getMail());
             
                ps.setString(6, hot.getPassword());
          
                
                
                status=ps.executeUpdate();
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    } 
       public static int AjouterHotel(Hotel hot){
        
        int status=0;
        
        try{
            try (Connection cnx = HotelierDao.getConnection()) {
                PreparedStatement ps;
                ps = cnx.prepareStatement("insert into Hotel ( NOM_HOTEL, LOCATION,SERVICES,ETOILE,VILLE,TELEPHONE_HOT,CIN_HOTELIER) values(?,?,?,?,?,?,?)");
                 
                ps.setString(1, hot.getNom_hotel());
                ps.setString(2, hot.getLocation());
                ps.setString(3, hot.getServices());
                ps.setInt(4,hot.getEtoile());
                ps.setString(5, hot.getVille());
                   ps.setString(6, hot.getTelephone_hotel());
                 ps.setString(7, hot.getCinHotelier());
                 
             
          
                
                
                status=ps.executeUpdate();
            }
            
        }catch(SQLException e){
            System.out.print(e);
        }
        return status;
    } 
}
