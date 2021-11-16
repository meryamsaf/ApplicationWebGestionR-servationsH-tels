/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.servlets;

import com.app.beans.Reservation;
import com.app.dao.ReservationDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meryam
 */
@WebServlet(name = "AjouterReservation", urlPatterns = {"/AjouterReservation"})
public class AjouterReservation extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
     response.setContentType("text/html;charset=UTF-8");
      
               PrintWriter out = response.getWriter();
       
               Reservation r=new Reservation();
               ReservationDAO resDAO=new ReservationDAO();
               
              String date = request.getParameter("date");
       Date newDate =new SimpleDateFormat("yyyy-mm-dd").parse(date);
			
	r.setDate_reser_debut(newDate);
		
        r.setId_client(request.getParameter("cin"));
           r.setTypeCham(request.getParameter("chambre"));
        r.setNomhotel(request.getParameter("hotel"));
        
      r.setNbre_personne(Integer.parseInt(request.getParameter("nbre")));
       
           r.setNbrJour(Integer.parseInt(request.getParameter("nbrJ")));
           
        
       ReservationDAO.inserer(r);
        request.getRequestDispatcher("AjouterReservation.jsp").include(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AjouterReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AjouterReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
