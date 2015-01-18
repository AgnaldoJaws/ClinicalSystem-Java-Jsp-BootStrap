<%-- 
    Document   : insert_registroClinico
    Created on : 21/10/2014, 15:12:08
    Author     : agn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
        
    </head>
    <body>
        <form action="Servlet_insere_registro_clinico" method="post" name="testeForm">
            
            <input type="hidden" name="cod_pre_atendimento" value="<%=request.getSession().getAttribute("id")%>"><br>
           <div class="form-group">
                       <label>Consulta:</label>
                         <textarea class="form-control" rows="5" name="consulta" ></textarea>
            </div>
           
           <div class="form-group">
               <label> Diagnostico:</label>
                         <textarea class="form-control" rows="5" name="diagnostico" ></textarea>
            </div>
           
           <div class="form-group">
                       <label> Receita:</label>
                         <textarea class="form-control" rows="5"  name="receita" ></textarea>
            </div>
           
           <div class="form-group">
                       <label>Guia de exame</label>
                         <textarea class="form-control" rows="5" name="guia_exame" ></textarea>
            </div>
            
          
          
            <button type="submit" class="btn btn-default">Enviar</button>  
            
            
            
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>      
    </body>
</html>
