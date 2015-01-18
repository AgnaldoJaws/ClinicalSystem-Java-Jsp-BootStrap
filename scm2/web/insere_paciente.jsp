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
        
            
          <h1>Cadastrar Paciente</h1>
          <form action="Servlet_paciente_insert" method="POST" name="testeForm">
            Convenio: <select id="combo" name="cod_convenio">
            <c:forEach var="convenio" items="${listaConvenio}">
                
                <option value='${convenio.id}'/>${convenio.nome_empre}</option>
                
            </c:forEach> </select> <br> <br>
                           
            
           Nome: : <input type="text" name="nome" value=""><br>
           Cpf: : <input type="text" name="cpf" value=""><br>
           Rg  : <input type="text" name="rg" value=""><br>
           Data Nascimento : <input type="text" name="dataNascimento" value=""><br>
           Endereco: <input type="text" name="endereco" value=""><br>
           Cep : <input type="text" name="cep" value=""><br>
           Bairro : <input type="text" name="bairro" value=""><br>
           Cidade : <input type="text" name="cidade" value=""><br>
           Estado : <input type="text" name="estado" value=""><br>
           Logradouro : <input type="text" name="logradouro" value=""><br>
           Complemento : <input type="text" name="complemento" value=""><br>
           Celular : <input type="text" name="celular" value=""><br>
           Email : <input type="text" name="email" value=""><br>
           Profissao : <input type="text" name="profissao" value=""><br>
           Paciente desde : <input type="text" name="paciente_desde" value=""><br>
           Última Consulta: <input type="text" name="ultima_consulta" value=""><br>
           
        <input type="submit" name="testar" value="Enviar">
             
        
            
        </form>
               
                
                
                 
                
           


                    

        
    </body>
</html>


