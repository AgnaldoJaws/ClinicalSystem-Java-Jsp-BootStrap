<%-- 
    Document   : altera_Convenio
    Created on : 17/10/2014, 19:34:45
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
        <form action="ServletController_Altera_Convenio" method="post" name="testeForm">
            
             <input type="hidden" name="id" 
            value="<%=request.getSession().getAttribute("id")%>"><br>
            
            Nome Empresa: <input type="text" name="nome_empresa" 
            value="<%=request.getSession().getAttribute("nome_empresa")%>"><br>
            
            Cnpj: <input type="text" name="cnpj" 
            value="<%=request.getSession().getAttribute("cnpj")%>"><br>
            
           Endereco:  <input type="text" name="endereco" 
            value="<%=request.getSession().getAttribute("endereco")%>"><br>
            
           Cidade: <input type="text" name="cidade" 
            value="<%=request.getSession().getAttribute("cidade")%>"><br>
           
            
            
            <input type="submit" name="testar" value="Alterar">
            
        </form>
    </body>
</html>
