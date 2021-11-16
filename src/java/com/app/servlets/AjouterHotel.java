/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.servlets;

import com.app.beans.Hotel;
import com.app.dao.HotelierDao;
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
@WebServlet(name = "AjouterHotel", urlPatterns = {"/AjouterHotel"})
public class AjouterHotel extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
                    Hotel hot=new Hotel();
        
        hot.setNom_hotel(request.getParameter("nom"));
        hot.setLocation(request.getParameter("location"));
        hot.setServices(request.getParameter("services"));
        hot.setEtoile(Integer.parseInt(request.getParameter("etoile")));
        hot.setVille(request.getParameter("ville"));
        hot.setTelephone_hotel(request.getParameter("phone"));
        hot.setCinHotelier(request.getParameter("cinHote"));
        
        
        HotelierDao.AjouterHotel(hot);
        request.getRequestDispatcher("AjouterHotel.jsp").include(request, response);
     
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
