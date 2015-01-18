<%-- 
    Document   : consulta_Especialidade
    Created on : 19/10/2014, 10:17:38
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
        <form action="ServletController_Consulta_Especialista" method="post" name="testeForm">
            
        <input type="text" name="cod_especialista" value=""><br>
           
        <input type="submit" name="testar" value="Consultar Especialista">
                      
        </form>
    </body>
</html>
