<%-- 
    Document   : altera_Especialista
    Created on : 19/10/2014, 10:24:27
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
         <form action="ServletController_Altera_Especialista" method="post" name="testeForm">
            
           Codigo Especialista:<input type="text" name="cod_especialista" 
            value="<%=request.getSession().getAttribute("cod_especialista")%>"><br>
             
             Codigo Especialidade:<input type="text" name="cod_especialidade" 
            value="<%=request.getSession().getAttribute("cod_especialidade")%>"><br>
             
             Crm:<input type="text" name="crm" 
            value="<%=request.getSession().getAttribute("crm")%>"><br>
             
              Nome:<input type="text" name="nome" 
            value="<%=request.getSession().getAttribute("nome")%>"><br>
             
             Endereco:<input type="text" name="endereco" 
            value="<%=request.getSession().getAttribute("endereco")%>"><br>
             
              Bairro:<input type="text" name="bairro" 
            value="<%=request.getSession().getAttribute("bairro")%>"><br>
             
             Cidade:<input type="text" name="cidade" 
            value="<%=request.getSession().getAttribute("cidade")%>"><br>
             
              Logradouro:<input type="text" name="logradouro" 
            value="<%=request.getSession().getAttribute("logradouro")%>"><br>
             
             Estado:<input type="text" name="estado" 
            value="<%=request.getSession().getAttribute("estado")%>"><br>
             
              Complemento:<input type="text" name="complemento" 
            value="<%=request.getSession().getAttribute("complemento")%>"><br>
             
             Telefone:<input type="text" name="telefone" 
            value="<%=request.getSession().getAttribute("telefone")%>"><br>
             
              Cpf:<input type="text" name="cpf" 
            value="<%=request.getSession().getAttribute("cpf")%>"><br>
             
             Rg:<input type="text" name="rg" 
            value="<%=request.getSession().getAttribute("rg")%>"><br>
             
              Consenho profissional:<input type="text" name="consenho_profissional" 
            value="<%=request.getSession().getAttribute("consenho_profissional")%>"><br>
             
             Outras informacoes:<input type="text" name="outras_informacoes" 
            value="<%=request.getSession().getAttribute("outras_informacoes")%>"><br>
            
            
            
            
            <input type="submit" name="testar" value="Alterar">
            
        </form>
    </body>
</html>
