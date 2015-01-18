<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>Referência de Pacientes</center></h1>
        
         <div class="container">
                        
                          <table class="table table-striped table-bordered table-hover table-condensed">
                    
                              <thead>
                      <tr>
                        
                        <th>Nome</th>
                         <th>Convenio</th>
                         <th>Cpf</th>
                         <th>Rg</th>
                          <th>Data Nascimento</th>
                          <th>Endereco</th>
                           <th>Cep</th>
                           <th>Bairro</th>
                           <th>Cidade</th>
                          
                          <th>Estado</th>
                         
                         <th>Complemento</th>
                         <th>Celular</th>
                          <th>E-mail</th>                  
                        
                           <th>Ultima Consulta</th>
                           <th>Alterar</th>
                           <th>Deletar</th>
                           <th>Abrir Agendamento</th>
                        
                      </tr>
                    </thead>
                   
                    <tbody>
                <c:forEach var="paciente" items="${listaPaciente}">    
                      <tr>
                                              
                        <td>${paciente.nome} </td>
                         <td>${paciente.id}</td> 
                        <td>${paciente.cpf} </td>
                        <td>${paciente.rg} </td>
                        <td>${paciente.dataNascimento} </td>
                        <td>${paciente.endereco} </td>
                        <td>${paciente.cep} </td>
                        <td>${paciente.bairro} </td>
                        <td>${paciente.cidade} </td>
                        <td>${paciente.estado} </td>
                        
                        <td>${paciente.complemento} </td>
                        <td>${paciente.celular} </td>
                        <td>${paciente.email} </td>
                        
                        <td>${paciente.ultima_consulta} </td>
                        <td><a href="ServletController_Consulta_Paciente?id=${paciente.id}">Alterar</a></td>
                        <td><a href="DeletaPacServlet?id=${paciente.id}">Deletar</a></td>
                        <td><a href="ServletListaEspecialista?id=${paciente.id}">Abrir Agendamento</a></td>
                       
                       

                      </tr>
                      
</c:forEach> 
                    </tbody>
                    
                  </table>
                  
    </div>
                 
          

          
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </body>
</html>
