<%-- 
    Document   : altera_Paciente
    Created on : 17/10/2014, 14:19:12
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
        <form action="Servlet_Autera_paciente2" method="post" name="testeForm">
            
             id:<input type="text" name="id" 
            value="<%=request.getSession().getAttribute("id")%>"><br>
             
             Codigo Convenio:<input type="text" name="cod_convenio" 
            value="<%=request.getSession().getAttribute("cod_convenio")%>"><br>
            
                       
           Nome: <input type="text" name="nome" 
            value="<%=request.getSession().getAttribute("nome")%>"><br>
            
             Cpf:<input type="text" name="cpf" 
            value="<%=request.getSession().getAttribute("cpf")%>"><br>
            
            Rg: <input type="text" name="rg" 
            value="<%=request.getSession().getAttribute("rg")%>"><br>
            
            Data Nascimento: <input type="text" name="dataNascimento" 
            value="<%=request.getSession().getAttribute("dataNascimento")%>"><br>
            
            Endereco:<input type="text" name="endereco" 
            value="<%=request.getSession().getAttribute("endereco")%>"><br>
            
           Cep: <input type="text" name="cep" 
            value="<%=request.getSession().getAttribute("cep")%>"><br>
            
           Bairro <input type="text" name="bairro" 
            value="<%=request.getSession().getAttribute("bairro")%>"><br>
            
            Cidade:<input type="text" name="cidade" 
            value="<%=request.getSession().getAttribute("cidade")%>"><br>
            
            Estado: <input type="text" name="estado" 
            value="<%=request.getSession().getAttribute("estado")%>"><br>
            
           Logradouro: <input type="text" name="logradouro" 
            value="<%=request.getSession().getAttribute("logradouro")%>"><br>
            
             Complemento:<input type="text" name="complento" 
            value="<%=request.getSession().getAttribute("complento")%>"><br>
            
            Celular: <input type="text" name="celular" 
            value="<%=request.getSession().getAttribute("celular")%>"><br>
            
            
            Email: <input type="text" name="email" 
            value="<%=request.getSession().getAttribute("email")%>"><br>
            
            Profissão <input type="text" name="profissao" 
            value="<%=request.getSession().getAttribute("profissao")%>"><br>
            
            Paciente Desde <input type="text" name="paciente_desde" 
            value="<%=request.getSession().getAttribute("paciente_desde")%>"><br>
            
           Última Consulta <input type="text" name="ultima_consulta" 
            value="<%=request.getSession().getAttribute("ultima_consulta")%>"><br>
            
            
            <input type="submit" name="testar" value="Alterar">
            
        </form>
    </body>
</html>
