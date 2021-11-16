<%-- 
    Document   : AfficherHotels
    Created on : 7 févr. 2021, 23:28:07
    Author     : meryam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.app.dao.ClientDAO"%>
<%@page import="com.app.beans.Hotel"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/affichageStyle.css" rel="stylesheet" type="text/css"/>
        
        <title>JSP Page</title>
        <style>
                 body{
                margin:0;
                padding:0;
                 background-image: url(images/picture.jpg);
                 background-color: #cccccc; /* Used if the image is unavailable */
               height: 500px; /* You must set a specified height */
        background-position: center; /* Center the image */
      background-repeat: no-repeat; /* Do not repeat the image */
       background-size: cover;
                font-family: Verdana,Geneva,Tahoma,sans-serif;
            }
          
            table{
                position:absolute;
                left:50%;
                top:30%;
                transform:translate(-50%,-50%);
                border-collapse: collapse;
                width:900px;
               height:70px;
                border:1px solid #bdc3c7;
                box-shadow: 2px 2px 12px rgba(0,0,0,0.2),-1px -1px 8px rgba(0,0,0,0.2);
                
                    
            }
            tr{
               transition:all .2s ease-in;
               cursor:pointer;
            }
            th,td{
               padding: 12px;
               text-align: left;
               border-bottom: 1px solid #ddd;
            }
            #header{
                background-color:  #8B4513;
                color:#fff;
                
            }
            h1{
               font-weight: 600;
               text-align: center;
               background-color: #8B4513;
               color:#fff;
              
            }
          
            tr:hover{
                background-color: #FFFAFA;
                transform: scale(1.02);
                box-shadow: 2px 2px 12px rgba(0,0,0,0.2),-1px -1px 8px rgba(0,0,0,0.2);
            }
        </style>
            
    </head>
    <body>
    
        <h1>L'ensemble des hotels</h1>
                
        <table >
                        <tr id="header">
                            <th>Etoile</th><th>Nom</th><th>Téléphone</th><th>Location</th><th>Services</th><th>Ville</th>
                        </tr>
                        <% 
                        ClientDAO clt =new ClientDAO();
                     
                        ArrayList<Hotel> hotels= clt.afficherHotel();
                     
                        for(Hotel h:hotels){
                        %>
                       
                   <tr>
                    <td><% out.print(h.getEtoile()); %></td>
                    <td><% out.print(h.getNom_hotel()); %></td>
                    <td><% out.print(h.getTelephone_hotel()); %></td>
                    <td><% out.print(h.getLocation()); %></td>
                    <td><% out.print(h.getServices()); %></td>
                    <td><% out.print(h.getVille()); %></td>
                    
           
                   </tr>
                   <% }%> 
        </table>
  

    </body>
</html>
