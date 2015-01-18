<%-- 
    Document   : altera_Triagem
    Created on : 20/10/2014, 11:34:19
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
        <form action="ServletController_aletera_triagem1" method="post" name="testeForm">
            
            id: <input type="text" name="id" 
                       value="<%=request.getSession().getAttribute("id")%>"><br>
            
            cod_pre_atendimento:<input type="text" name="cod_pre_atendimento" 
            value="<%=request.getSession().getAttribute("cod_pre_atendimento")%>"><br>
            
            Atividade Muscular:<input type="text" name="atividade_muscular" 
            value="<%=request.getSession().getAttribute("atividade_muscular")%>"><br>
            
            Respiração:<input type="text" name="repiracao" 
            value="<%=request.getSession().getAttribute("repiracao")%>"><br>
            
            Circulação:<input type="text" name="circulacao" 
            value="<%=request.getSession().getAttribute("circulacao")%>"><br>
            
            Conciência:<input type="text" name="consciencia" 
            value="<%=request.getSession().getAttribute("consciencia")%>"><br>
            
           
            
            Pressão  Arterial:<input type="text" name="pressao_arterial" 
            value="<%=request.getSession().getAttribute("pressao_arterial")%>"><br>
            
            Peso:<input type="text" name="peso" 
            value="<%=request.getSession().getAttribute("peso")%>"><br>
            
            Tamanho:<input type="text" name="tamanho" 
            value="<%=request.getSession().getAttribute("tamanho")%>"><br>
            
            Idade:<input type="text" name="idade" 
            value="<%=request.getSession().getAttribute("idade")%>"><br>
            
            
            
            
            <input type="submit" name="testar" value="Alterar">
            
        </form>
    </body>
</html>
