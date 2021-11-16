<%-- 
    Document   : modifierReservation
    Created on : 20 févr. 2021, 21:02:47
    Author     : meryam
--%>


<%@page import="com.app.dao.ReservationDAO"%>
<%@page import="com.app.beans.Reservation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
          <%
                int id=Integer.parseInt(request.getParameter("id"));
                Reservation r=ReservationDAO.select(id);
            %>
        <div class="container col-md-10 col-md-offset-1">
            <div class="panel panel-primary">
                <div class="panel-heading" >Modifier une réservation</div>
                <div class='panel-body'></div>
                <form action='modifierReservation' method='post'>
                   
                      <div class='form-group'>
                        <label class='control-label'>id</label>
                        <input type='text' name='id' value="<%out.print(r.getId());%>" class='form-control'/>
                        <span></span>
                    </div>
                          <div class='form-group'>
                        <label class='control-label'>Cin </label>
                        <input type='text' name='cin' value="<%out.print(r.getId_client());%>" class='form-control'/>
                        <span></span>
                    </div>
                     <div class='form-group'>
                        <label class='control-label'>nom de l'hotel</label>
                        <input type='text' name='nomHot' class='form-control'/>
                        <span></span>
                    </div>
                     <div class='form-group'>
                        <label class='control-label'>type chambre</label>
                        <input type='text' name='typeCh' class='form-control'/>
                        <span></span>
                    </div>
                      <div class='form-group'>
                        <label class='control-label'>nombre de jours</label>
                        <input type='text' name='jour' class='form-control'/>
                        <span></span>
                    </div>
                     <div class='form-group'>
                        <label class='control-label'>nombre de personne</label>
                        <input type='text' name='personne' class='form-control'/>
                        <span></span>
                    </div>
                  
                         <div class='form-group'>
                        <label class='control-label'>Date</label>
                        <input type='date' name='date' class='form-control'/>
                        <span></span>
                    </div>
                    <div>
                        <button type='submit' class='btn-primary '>update</button>
                    </div>
                </form>
            </div>
            
        </div>
</html>
