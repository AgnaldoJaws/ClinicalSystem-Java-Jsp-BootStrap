<%-- 
    Document   : altera_Especialidade
    Created on : 18/10/2014, 23:11:10
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
        <form action="ServletController_Altera_Especialidade" method="post" name="testeForm">
            
            <input type="hidden" name="id" 
            value="<%=request.getSession().getAttribute("id")%>"><br>
             
             Nome Especialidade:<input type="text" name="nome_especialidade" 
            value="<%=request.getSession().getAttribute("nome_especialidade")%>"><br>
             
             
            
            
            <input type="submit" name="testar" value="Alterar">
        </form>
    </body>
</html>
