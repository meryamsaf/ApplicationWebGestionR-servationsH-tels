<%-- 
    Document   : admin
    Created on : 8 févr. 2021, 20:24:11
    Author     : meryam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.app.beans.Reservation"%>
<%@page import="com.app.dao.ReservationDAO"%>
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
        <link href="css/affichageStyle.css" rel="stylesheet" type="text/css"/>
   
</head>
<body>
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
                left:60%;
                top:50%;
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
				<h4><%  String nom =(String) session.getAttribute("NOM");
                                  String prenom =(String) session.getAttribute("PRENOM");
                                
                                  out.print(prenom+" "+nom);
                                  
                                %></h4>
			</div>
			<ul>
				
				<li>
					<a href="AjouterReservation.jsp">
						<i class="fa fa-envelope-o" aria-hidden="true"></i>
						<span>Ajouter une reservation</span>
					</a>
				</li>
				
				<li>
					<a href="AfficherHotels.jsp">
						<i class="fa fa-power-off" aria-hidden="true"></i>
						<span>les hotels</span>
					</a>
				</li>
                                <li>
					<a href="AjouterComment.jsp">
						<i class="fa fa-power-off" aria-hidden="true"></i>
						<span>Get in touch</span>
					</a>
				</li>
			</ul>
		</nav>
        
                        <center> <h1>Mes réservations</h1></center>
                
        <table >
           
                        <tr id="header">
                            
                <th> ID</th>
                      <th> date</th>
                    <th> nombre de jours</th>
                   <th> personne</th>
                    <th> nom de l'hotel</th>
                    <th> type chambre</th>
                  
                    <th> Action</th>
                  </tr>
                       
                       <% 
                        
                          
                        ReservationDAO res =new ReservationDAO();
                      String cin =(String) session.getAttribute("CIN");
                      ArrayList<Reservation> reservations= res.afficherReservation(cin);
                     
                        for( Reservation r:reservations){
                        %>
                       
                   <tr>
           
                      <td><% out.print(r.getId()); %></td>
                    <td><% out.print(r.getDate_reser_debut()); %></td>
                    <td><% out.print(r.getNbrJour()); %></td>
                    <td><% out.print(r.getNbre_personne()); %></td>
                    <td><% out.print(r.getNomhotel()); %></td>
                    <td><% out.print(r.getTypeCham()); %></td>
                    
                    <td><a href="modifierReservation.jsp?id=<% out.print(r.getId()); %>"><button>update</button></a><a href="deleteReservation?id=<% out.print(r.getId()); %>"><button >delete</button></td>
                   </tr><% }%>
                   
        </table>
                    </div>  

           </body>
            </html>
