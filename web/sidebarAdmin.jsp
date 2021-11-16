<%-- 
    Document   : admin
    Created on : 8 févr. 2021, 20:24:11
    Author     : meryam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.app.beans.Hotel"%>
<%@page import="com.app.dao.ClientDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Dashboard</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="css/stylee.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/respontiveStyle.css" rel="stylesheet" type="text/css"/>
        
	 <style>
        body{
                         margin:0;
                padding:0;
                 background-image: url(images/picture.jpg);;
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
                top:40%;
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
                width:999px;
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
    
    
      
	<input type="checkbox" id="checkbox">
	<header class="header">
		<h2 class="u-name">SIDE <b>BAR</b>
			<label for="checkbox">
				<i id="navbtn" class="fa fa-bars" aria-hidden="true"></i>
			</label>
		</h2>
		<i class="fa fa-user" aria-hidden="true"></i>
	</header>
	<div class="body">
		<nav class="side-bar">
			<div class="user-p">
				<img src="images/picv.jpg">
				<h4>Admin</h4>
			</div>
			<ul>
				<li>
					<a href="AfficherHotels.jsp">
						<i class="fa fa-desktop" aria-hidden="true"></i>
						<span> Afficher les Hotels</span>
					</a>
				</li>
				<li>
					<a href="AfficherClients.jsp">
						<i class="fa fa-envelope-o" aria-hidden="true"></i>
						<span>Afficher les clients</span>
					</a>
				</li>
				
				<li>
					<a href="AjouterHotel.jsp">
						<i class="fa fa-power-off" aria-hidden="true"></i>
						<span>Ajouter un Hotel</span>
					</a>
				</li>
                                <li>
					<a href="AfficherComments.jsp">
						<i class="fa fa-power-off" aria-hidden="true"></i>
						<span>les commentaires</span>
					</a>
				</li>
			</ul>
		</nav>
		     
       
                
                  <center> <h1>Les hotels enregistrés</h1></center>

	
     <table >
                        <tr id="header">
                            <th><strong>Etoile</strong></th><th><strong>Nom</strong></th><th><strong>Téléphone</strong></th><th><strong>Location</strong></th><th><strong>Services</strong></th><th><strong>Ville</strong></th>
                        </tr>
                        <% 
                        ClientDAO clt =new ClientDAO();
                     
                        ArrayList<Hotel> hotels= clt.afficherHotel();
                     
                        for(Hotel h:hotels){
                        %>
                       
                   <tr>
                    <td><strong><% out.print(h.getEtoile()); %></strong></td>
                    <td><strong><% out.print(h.getNom_hotel()); %></strong></td>
                    <td><strong><% out.print(h.getTelephone_hotel()); %></strong></td>
                    <td><strong><% out.print(h.getLocation()); %></strong></td>
                    <td><strong><% out.print(h.getServices()); %></strong></td>
                    <td><strong><% out.print(h.getVille()); %></strong></td>
                    
           
                   </tr>
                   <% }%> 
        </table>
         </div>
</body>
</html>
