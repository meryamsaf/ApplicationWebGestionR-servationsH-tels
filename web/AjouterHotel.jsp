<%-- 
    Document   : AjouterHotel
    Created on : 9 févr. 2021, 12:20:42
    Author     : meryam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/formStyle.css" rel="stylesheet" type="text/css"/>
        
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
        <div class="formulaire"> <h2>Ajout d'un hotel</h2></div> 
        <div class="main"> 
            <form action="AjouterHotel" method="post">
                <h3 class="name">Nom</h3>
             <input class="inp" type="text" name="nom"> 
             
             <h3 class="name"> Location</h3>
             <input class="inp" type="text" name="location">
             
             <h3 class="name">Les services offerts</h3>
             <input class="inp" type="text" name="services">
             
              <h3 class="name">étoile de l'hotel</h3>
             <input class="inp" type="text" name="etoile">
              
              <h3 class="name"> ville</h3>
              <input class="inp" type="text" name="ville"> 
              
              <h3 class="name">Téléphone fixe</h3>
              <input class="inp" type="text" name="phone"> 
              
             <h3 class="name">CIN de l'hotelier</h3>
              <input class="inp" type="text" name="cinHote">
               <button type="submit">envoyer</button>
            </form>
       
        </div>
       
  
        
    </body>
</html>
