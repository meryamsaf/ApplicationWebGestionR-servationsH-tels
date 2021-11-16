<%-- 
    Document   : AjouterReservation
    Created on : 10 févr. 2021, 10:46:29
    Author     : meryam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
   
           <link href="css/formStyle.css" rel="stylesheet" type="text/css"/>
           
        <title>JSP Page</title>
         <style>
                  *{
                margin:0;
                padding:0;
            }
            body{
                background-image: url(images/picture.jpg);
                background-position: center;
                background-size: cover;
                font-family:sans-serif;
                margin-top:40px;
            }
          </style>
    </head>
    <body>
  <div class="formulaire"> <h2>Faire une reservation </h2></div> 
        <div class="main"> 
            <form action="AjouterReservation" method="post">
                
              <h3 class="name"> Date</h3>
             <input class="inp" type="date" name="date"> 
             
             <h3 class="name">nombe de jour</h3>
             <input class="inp" type="text" name="nbrJ">
             
             <h3 class="name">votre cin</h3>
             <input class="inp" type="text" name="cin">
             
              <h3 class="name">nom hotel</h3>
             <input class="inp" type="text" name="hotel">
              
              <h3 class="name"> type chambre</h3>
              <input class="inp" type="text" name="chambre"> 
              
              <h3 class="name">nombre de personnes</h3>
              <input class="inp" type="text" name="nbre"> 
              
                
              
            
             
              
              
               <button type="submit">chercher</button>
            </form>
       
        </div>
</html>
