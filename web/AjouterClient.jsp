<%-- 
    Document   : AjouterClient
    Created on : 7 févr. 2021, 18:31:09
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

  <div class="formulaire"> <h2>Formulaire d'inscription</h2></div> 
        <div class="main"> 
            <form action="AjouterClient" method="post">
                <h3 class="name">Votre cin</h3>
             <input class="inp" type="text" name="cin"> 
             
             <h3 class="name"> Votre nom</h3>
             <input class="inp" type="text" name="nom">
             
             <h3 class="name">Votre prénom</h3>
             <input class="inp" type="text" name="prenom">
             
              <h3 class="name">Téléphone portable</h3>
             <input class="inp" type="text" name="telephone">
              
              <h3 class="name"> Votre e-mail</h3>
              <input class="inp" type="text" name="mail"> 
              
              <h3 class="name">Adresse</h3>
              <input class="inp" type="text" name="adress"> 
              
             <h3 class="name">Mot de passe</h3>
              <input class="inp"  minlength="2" type="password" required name="password">
               <button type="submit">envoyer</button>
            </form>
       
        </div>
     
</html>
