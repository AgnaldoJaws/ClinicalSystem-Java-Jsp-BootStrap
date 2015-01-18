<%-- 
    Document   : altera_RegistroClinico
    Created on : 21/10/2014, 14:06:39
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
         <form action="ServletController_aletera_registroClinico" method="post" name="testeForm">
            
            id: <input type="text" name="id" 
                       value="<%=request.getSession().getAttribute("id")%>"><br>
            
            cod_pre_atendimento:<input type="text" name="cod_pre_atendimento" 
            value="<%=request.getSession().getAttribute("cod_pre_atendimento")%>"><br>
            
            Consulta:<input type="text" name="consulta" 
            value="<%=request.getSession().getAttribute("consulta")%>"><br>
            
            Diagnostico:<input type="text" name="diagnostico" 
            value="<%=request.getSession().getAttribute("diagnostico")%>"><br>
            
            Receita:<input type="text" name="receita" 
            value="<%=request.getSession().getAttribute("receita")%>"><br>
            
             Guia de Exame:<input type="text" name="guia_exame" 
            value="<%=request.getSession().getAttribute("guia_exame")%>"><br>
            
            
            
            
            
            <input type="submit" name="testar" value="Alterar">
            
        </form>
    </body>
</html>
