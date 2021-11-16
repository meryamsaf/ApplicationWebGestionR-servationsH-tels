/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.servlets;

import com.app.beans.Admin;
import com.app.beans.Client;
import com.app.beans.Hotelier;
import com.app.dao.LoginDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author meryam
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
      
       String cin=request.getParameter("cin");
        String password=request.getParameter("password");
        LoginDAO login=new LoginDAO();
        Admin personne;
        Hotelier per;
        Client pers;
        personne = login.checkLoginAdmin(cin, password);
        per = login.checkLoginHotelier(cin, password);
        pers=login.checkLoginClient(cin, password);
      if(personne!=null  ){
          
        HttpSession session = request.getSession();
       session.setAttribute("NOM", personne.getNOM());
       session.setAttribute("PRENOM", personne.getPRENOM());
       session.setAttribute("CIN", personne.getCIN());
       session.setAttribute("checkLoginAdmin",personne);
       response.sendRedirect("sidebarAdmin.jsp");
     
      }
      else if(per!=null){
           HttpSession session = request.getSession();
            session.setAttribute("NOM", per.getNOM());
                session.setAttribute("PRENOM", per.getPRENOM());
                session.setAttribute("CIN", per.getCIN());
       session.setAttribute("checkLoginHotelier",personne);
          response.sendRedirect("sidebarHotelier.jsp");
      }
      else if(pers!=null){ 
              HttpSession session = request.getSession();
               session.setAttribute("NOM", pers.getNOM());
                session.setAttribute("PRENOM", pers.getPRENOM());
                session.setAttribute("CIN", pers.getCIN());
       session.setAttribute("checkLoginClient",personne);
         response.sendRedirect("sideBarClient.jsp");
          
      }
      else{
      System.out.println();
      }
   
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
