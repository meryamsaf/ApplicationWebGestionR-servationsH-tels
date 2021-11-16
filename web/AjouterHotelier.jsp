<%-- 
    Document   : AjouterHotelier
    Created on : 9 févr. 2021, 11:43:35
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
        <div class="formulaire"> <h2>formulaire d'inscription</h2></div> 
        <div class="main"> 
            <form action="AjouterHotelier" method="post">
                <h3 class="name">Nom</h3>
             <input class="inp" type="text" name="nom"> 
             
             <h3 class="name">Prénom</h3>
             <input class="inp" type="text" name="prenom">
             
             <h3 class="name">Adresse</h3>
             <input class="inp" type="text" name="telephone">
             
              <h3 class="name">Téléphone</h3>
             <input class="inp" type="text" name="mail">
              
              <h3 class="name"> CIN</h3>
              <input class="inp" type="text" name="cin"> 
              
              <h3 class="name">Mot de passe</h3>
              <input class="inp" type="password" name="password"> 
              
             
               <button type="submit">envoyer</button>
            </form>
       
        </div>
       
  
        
    </body>
    
</html>
