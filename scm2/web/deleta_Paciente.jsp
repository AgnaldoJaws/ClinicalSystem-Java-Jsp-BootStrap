<%-- 
    Document   : deleta_Paciente
    Created on : 17/10/2014, 15:03:06
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
                 <form action="DeletaPacServlet" method="post" name="testeForm">
            
          Informe Código Paciente:  <input type="text" name="id" value=""><br>
           
        
            <input type="submit" name="testar"  value="Deleta Paciente">
 
        </form>
       
    </body>
</html>
