<%-- 
    Document   : deletaRegistro_clinico
    Created on : 21/10/2014, 14:10:56
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
        <form action="ServerletController_Deleta_registroClinico2" method="post" name="testeForm">
            
          Informe Código do Registro clinico:  <input type="text" name="id" value=""><br>
           
        
            <input type="submit" name="testar"  value="Deleta Registro Clinico">
 
        </form>
    </body>
</html>
