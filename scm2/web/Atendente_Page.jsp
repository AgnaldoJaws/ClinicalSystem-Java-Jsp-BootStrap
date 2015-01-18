<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<html>
    <head>
        <title>Clinica M�dica</title>

        <script type="text/javascript" src="jquery.js" ></script>
        <script type="text/javascript" src="script.js" ></script>

        <link rel="stylesheet" type="text/css" href="style.cs" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    </head>
    <body>



        <div class="container">

            <ul class="nav nav-pills" role="tablist">

                <li class="dropdown active">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Pré Atendimento <span class="caret"></span></a>

                    <ul class="dropdown-menu" role="menu">
                        <li><a href="servlet_Listar_Paciente">Abrir</a></li>
                        <li><a href="consulta_pre_atendimento.jsp">Pesquisar</a></li>
                        <li><a href="altera_pre_atendimento.jsp">Alterar </a></li>
                        <li><a href="deleta_pre_atendimento.jsp">Excluir </a></li>
                        <li><a href="#">Listar </a></li>


                    </ul>
                </li>





                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Convenio <span class="caret"></span></a>

                    <ul class="dropdown-menu" role="menu">
                        <li><a href="insere_Convenio.jsp">Cadastrar </a></li>
                        <li><a href="consulta_Convenio.jsp">Pesquisar</a></li>

                        <li><a href="deleta_conveno.jsp">Excluir </a></li>


                    </ul>
                </li>




                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Paciente <span class="caret"></span></a>

                    <ul class="dropdown-menu" role="menu">
                        <li><a href="ServletConvenio_lista">Cadastrar </a></li>
                        <li><a href="consulta_Paciente.jsp">Pesquisar</a></li>

                        <li><a href="servlet_Listar_Paciente">Listar </a></li> 


                    </ul>
                </li>

                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Especialidade <span class="caret"></span></a>

                    <ul class="dropdown-menu" role="menu">
                       <li><a href="insere_Especialidade.jsp">Cadastrar </a></li>
                        <li><a href="consulta_Especialidade.jsp">Pesquisar</a></li>
                        <li><a href="altera_Especialidade.jsp">Alterar </a></li>
                        <li><a href="deleta_especialidade.jsp">Excluir </a></li>

                    </ul>
                </li>

                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> Especialista <span class="caret"></span></a>

                    <ul class="dropdown-menu" role="menu">
                         <li><a href="Servlet_list_Especialidade">Cadastrar </a></li>
                        <li><a href="consulta_Especialista.jsp">Pesquisar</a></li>
                        <li><a href="altera_Especialista.jsp">Alterar </a></li>
                        <li><a href="deleta_Especialista.jsp">Excluir </a></li>
                        <li><a href="#">Listar </a></li>


                    </ul>
                </li>

            </ul>
        </div>


       
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </body>
</html>