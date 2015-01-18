<%-- 
    Document   : insere_Triagem
    Created on : 20/10/2014, 00:41:21
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
        <form action="ServletController_Inserir_triagem" method="post" name="testeForm">
            
           cod_pre_atendimento : <input type="text" name="cod_pre_atendimento" value=""><br>
          Atividade muscular : <input type="text" name="atividade_muscular" value=""><br>
          Repiracao : <input type="text" name="repiracao" value=""><br>
          Circulacao : <input type="text" name="circulacao" value=""><br>
          
          Consciencia : <input type="text" name="consciencia" value=""><br>
          Temperatura : <input type="text" name="temperatura" value=""><br>
          Pessão Arterial : <input type="text" name="pressao_arterial" value=""><br>
          Pesso : <input type="text" name="peso" value=""><br>
          Tamanho : <input type="text" name="tamanho" value=""><br>
          Idade: <input type="text" name="idade" value=""><br>
          
          
           
                      
                        
            <input type="submit" name="testar" value="incluir">
            
        </form>
    </body>
</html>
