<%-- 
    Document   : altera_pre_atendimento
    Created on : 19/10/2014, 20:26:14
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
        <form action="ServletController_Altera_pre_atendimento" method="post" name="testeForm">
            
             id:<input type="text" name="id" 
            value="<%=request.getSession().getAttribute("id")%>"><br>
            
             Codigo especialista :<input type="text" name="cod_especialista" 
            value="<%=request.getSession().getAttribute("cod_especialista")%>"><br>
             
             Codigo Paciente :<input type="text" name="cod_paciente" 
            value="<%=request.getSession().getAttribute("cod_paciente")%>"><br>
             
             Data abertura :<input type="text" name="data_abertura" 
            value="<%=request.getSession().getAttribute("data_abertura")%>"><br>
             
             Data Consulta:<input type="text" name="data_consulta" 
            value="<%=request.getSession().getAttribute("data_consulta")%>"><br>
             
             Hora da Consulta:<input type="text" name="hora_consulta" 
            value="<%=request.getSession().getAttribute("hora_consulta")%>"><br>
             
             Valor Pagamento:<input type="text" name="valor_pagamento" 
            value="<%=request.getSession().getAttribute("valor_pagamento")%>"><br>
             
             Data Pagamento:<input type="text" name="data_pagamento" 
            value="<%=request.getSession().getAttribute("data_pagamento")%>"><br>
             
             Status pre Atendimento :<input type="text" name="status_pre_atendimento" 
            value="<%=request.getSession().getAttribute("status_pre_atendimento")%>"><br>
             
             outras_informacoes:<input type="text" name="outras_informacoes" 
            value="<%=request.getSession().getAttribute("outras_informacoes")%>"><br>
            
            
            <input type="submit" name="testar" value="Alterar">
            
        </form>
    </body>
</html>
