<%-- 
    Document   : insere_Convenio
    Created on : 17/10/2014, 18:38:13
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
    <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        
        
        
        
        <div class="container">
         <form action="ServletController_Inserir_Convenio" method="post" name="testeForm">
            
              <div class="form-group">
          <label for="usr">Nome Empresa:</label>
          <input type="text" class="form-control" name="nome_empresa" id="usr">
      <label for="usr">Cnpj:</label>
          <input type="text" class="form-control" name="cnpj" id="usr">
      <label for="usr">Endereco:</label>
          <input type="text" class="form-control" name="endereco"  id="usr">
      <label for="usr">Cidade:</label>
          <input type="text" class="form-control" name="cidade" id="usr">
        </div>
          
          
            <button type="submit" class="btn btn-default">Enviar</button>         
            
            
        </form>
            
         </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </body>
</html>
