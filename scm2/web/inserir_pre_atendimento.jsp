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
        <form action="ServletController_Inseri_pre_atendimento" method="post" name="testeForm">
            
            <form action="ServletController_Inserir_Paciente" method="POST" name="testeForm">
            Médico: <select id="combo" name="cod_especialista">
            <c:forEach var="especialista" items="${listaEspecialista}">
                
                <option value='${especialista.id_especialista}'/>${especialista.nome}</option>
                
            </c:forEach> </select> <br>        
            
            
            
            
           Codigo Paciente: <input type="text" name="cod_paciente" value="<%=request.getSession().getAttribute("id")%>"/><br>
            Data Abertura : <input type="text" name="data_abertura" value=""><br>
           Data Consulta: <input type="text" name="data_consulta" value=""><br>
           Hora Consulta: <input type="text" name="hora_consulta" value=""><br>
           Valor Pagamento: <input type="text" name="valor_pagamento" value=""><br>
           Data Pagamento: <input type="text" name="data_pagamento" value=""><br> 
           Status : <input type="text" name="status_pre_atendimento" value=""><br> 
           Outras informações: <input type="text" name="outras_informacoes" value=""><br>
          
            
            
            <input type="submit" name="testar" value="Incluir">
    </body>
</html>
