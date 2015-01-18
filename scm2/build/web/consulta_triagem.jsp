<%-- 
    Document   : consulta_triagem
    Created on : 20/10/2014, 11:17:53
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
        <form action="ServerletController_Consulta_Triagem" method="post" name="testeForm">
            
          Informe Código da Triagem:  <input type="text" name="id" value=""><br>
           
        
            <input type="submit" name="testar"  value="Consulatar triagem">
 
        </form>
    </body>
</html>
