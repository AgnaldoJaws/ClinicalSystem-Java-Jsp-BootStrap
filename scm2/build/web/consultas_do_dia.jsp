<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    </head>
    <body>
        <h1><center>Consultas do dia</center></h1>



        <div class="container">

            <table class="table table-striped table-bordered table-hover table-condensed">
                <thead>
                    <tr>
                        <th>Nome Paciente</th>
                        <th>Especialista</th>
                        <th>Data consulta</th>
                        <th>Hora da Consulta</th>
                        <th>Status</th>
                        <th>Abrir Consulta</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="b" items="${listaPA}">
                        <tr>
                            
                            <td>${b.cod_paciente}</td> 
                            <td>${b.cod_especialista}</td> 

                            <td>${b.data_abertura}</td> 

                            <td>${b.data_consulta}</td> 
                            <td></td>
                            <td> <a href="Servlet_insere?id=${b.id_pre_Atendimento}">Abrir Consulta</a> </td>

                        </tr>

                    </c:forEach>
                </tbody>


            </table>
        </div>











        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 

    </body>
</html>
