/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.servlets;

import com.app.beans.Commentaire;
import com.app.dao.CommentaireDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meryam
 */
@WebServlet(name = "AjouterComment", urlPatterns = {"/AjouterComment"})
public class AjouterComment extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         Commentaire c =new Commentaire();
        
        c.setCin(request.getParameter("cin"));
        c.setNom(request.getParameter("nom"));
        c.setPrenom(request.getParameter("prenom"));
        c.setPhone(request.getParameter("phone"));
        c.setMail(request.getParameter("mail"));
        c.setMessage(request.getParameter("message"));
   
        CommentaireDAO.Ajouter(c);
        request.getRequestDispatcher("AjouterComment.jsp").include(request, response);
    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
