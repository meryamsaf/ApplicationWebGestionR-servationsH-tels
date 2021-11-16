<%-- 
    Document   : AjouterComment
    Created on : 25 févr. 2021, 11:36:14
    Author     : meryam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleComment.css" rel="stylesheet" type="text/css"/>
        
    </head>
    
    <body>
        
        <section class='get_in_touch'>
            <h1 class='title'>get in touch</h1>
            <div class='container'>
                <div class='contact-form row'>
                      <form action="AjouterComment" method="post">
                     <div class='form-field col-lg-6'>
                          
                        <input id='cin' class='input-text' type='text' name="cin">
                        <label class='label'>CIN</label>
                    </div>
                    <div class='form-field col-lg-6'>
                        <input id='name' class='input-text' type='text' name="nom">
                        <label  class='label'>Nom</label>
                    </div>
                     <div class='form-field col-lg-6'>
                        <input id='prenom' class='input-text' type='text' name="prenom">
                        <label  class='label'>Prénom</label>
                    </div>
                     <div class='form-field col-lg-6'>
                        <input id='email' class='input-text' type='text' name="mail">
                        <label  class='label'>E-mail</label>
                    </div>
                     <div class='form-field col-lg-6'>
                        <input id='phone' class='input-text' type='text' name="phone">
                        <label  class='label'>Téléphone</label>
                    </div>
                     <div class='form-field col-lg-6'>
                        <input id='message' class='input-text' type='text' name="message">
                        <label  class='label'>Message</label>
                    </div>
                     <div class='form-field col-lg-6'>
                        <input  class='submit-btn' type='submit' name='submit'>
                       
                    </div>
                      </form>
                </div>
                
                
            </div>
        </section>
    </body>
</html>
