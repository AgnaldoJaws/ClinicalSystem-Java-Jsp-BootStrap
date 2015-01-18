<%-- 
    Document   : consulta_Paciente
    Created on : 17/10/2014, 12:56:56
    Author     : agn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServletController_Consulta_Paciente" method="post" name="testeForm">
            
        <input type="text" name="id" value=""><br>
           
        <input type="submit" name="testar" value="Consultar Paciente">
                      
        </form>
    </body>
</html>
