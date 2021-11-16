<%-- 
    Document   : modifierClient
    Created on : 8 févr. 2021, 22:04:17
    Author     : meryam
--%>

<%@page import="com.app.dao.ClientDAO"%>
<%@page import="com.app.beans.Client"%>
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
        <div class="container col-md-10 col-md-offset-1">
            <div class="panel panel-primary">
                <div class="panel-heading" >Modification d'un client</div>
                <div class='panel-body'></div>
                 <%
                String cin=request.getParameter("cin");
                Client r=ClientDAO.getNameByCin(cin);
            %>
                <form action='modifierClient.jsp' method='post'>
                    <div class='form-group'>
                        <label class='control-label'>Cin</label>
                        <input type='text' name='cin' class='form-control'/>
                        <span></span>
                    </div>
                     <div class='form-group'>
                        <label class='control-label'>Telephone</label>
                        <input type='text' name='telephone' class='form-control'/>
                        <span></span>
                    </div>
                     <div class='form-group'>
                        <label class='control-label'>Adress</label>
                        <input type='text' name='adress' class='form-control'/>
                        <span></span>
                    </div>
                      <div class='form-group'>
                        <label class='control-label'>Password</label>
                        <input type='text' name='password' class='form-control'/>
                        <span></span>
                    </div>
                    <div>
                        <button type='submit' class='btn-primary '>update</button>
                    </div>
                </form>
            </div>
            
        </div>
</html>
