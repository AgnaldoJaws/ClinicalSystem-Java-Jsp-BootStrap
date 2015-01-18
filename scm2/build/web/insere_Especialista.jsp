
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> Cadastro Especialista </a>
            
        <form action="ServletController_Inserir_Especialista" method="POST">
            
            
          <form action="ServletController_Inserir_Paciente" method="POST" name="testeForm">
            Convenio: <select id="combo" name="cod_especialidade">
            <c:forEach var="especialidade" items="${listaEspecialidade}">
                
                <option value='${especialidade.cnpj}'/>${especialidade.nome_empre}</option>
                
            </c:forEach> </select> <br>
                
                
           nome : <input type="text" name="nome" value=""><br>
           cod: <input type="text" name="crm" value=""><br>
           Endereco : <input type="text" name="endereco" value=""><br>
           Bairro : <input type="text" name="bairro" value=""><br>
           Logradouro  : <input type="text" name="cidade" value=""><br>
           Logradouro  : <input type="text" name="logradouro" value=""><br>
           Estado : <input type="text" name="estado" value=""><br>
           Complemento: <input type="text" name="complemento" value=""><br>
           Telefone : <input type="text" name="telefone" value=""><br>
           Cpf: <input type="text" name="cpf" value=""><br>
           Rg : <input type="text" name="rg" value=""><br>
           
           Consenho_profissional : <input type="text" name="consenho_profissional" value=""><br>
           Outras informações  <input type="text" name="outras_informacoes" value=""><br>
       
                
                        
                

           <input type="submit" value =" Enviar">
                      
          </form>                 
            
        



