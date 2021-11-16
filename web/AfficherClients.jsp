<%@page import="java.util.ArrayList"%>
<%@page import="com.app.beans.Client"%>
<%@page import="com.app.dao.ClientDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
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
        
        
       <table >
           <center><h1>Clients</h1> </center>
                  <tr id="header">
                    <th> CIN</th>
                    <th> NOM</th>
                   <th> PRENOM</th>
                    <th> TELEPHONE</th>
                    <th>ADRESSE</th>
                    <th>MAIL</th>
                    <th> Action</th>
                  </tr>
                
                    
                   <% ClientDAO clt=new ClientDAO();
                   ArrayList<Client> clients=new ArrayList();
                   clients= clt.afficher();
                   
                   for(Client c:clients){
                   
                   
                   %>
                   
                   <tr>
                    <td><% out.print(c.getCin()); %></td>
                    <td><% out.print(c.getNom()); %></td>
                    <td><% out.print(c.getPrenom()); %></td>
                    <td><% out.print(c.getTelephone()); %></td>
                    <td><% out.print(c.getAdress()); %></td>
                    <td><% out.print(c.getMail()); %></td>
                    <td><button ><a href="deleteClient?cin=<% out.print(c.getCin()); %>">supprimer</a></button>
                   </tr><% }%>
</table>
                  
    </body>

</html>
