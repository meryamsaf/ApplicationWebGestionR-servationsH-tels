<%-- 
    Document   : AfficherComments
    Created on : 25 févr. 2021, 15:10:01
    Author     : meryam
--%>

<%@page import="com.app.beans.Commentaire"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.app.dao.CommentaireDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
   

        <h1>Les commentaires</h1>
                
        <table >
                        <tr id="header">
                            <th>Cin</th><th>Nom</th><th>Prénom</th><th>E-mail</th><th>Téléphone</th><th>Message</th>
                        </tr>
                        <% 
                       CommentaireDAO com =new CommentaireDAO ();
                     
                        ArrayList<Commentaire> Commentaires= com.afficherCommentaire();
                     
                        for(Commentaire c:Commentaires){
                        %>
                       
                   <tr>
                    <td><% out.print(c.getCin()); %></td>
                    <td><% out.print(c.getNom()); %></td>
                    <td><% out.print(c.getPrenom()); %></td>
                    <td><% out.print(c.getMail()); %></td>
                    <td><% out.print(c.getPhone()); %></td>
                    <td><% out.print(c.getMessage()); %></td>
                    
           
                   </tr>
                   <% }%> 
        </table>
  

    </body>
        
    
    
    
</html>
