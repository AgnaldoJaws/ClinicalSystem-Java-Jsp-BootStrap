/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Pre_Atendimento;

import classes.alteraDados;
import classes.pre_atendimento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author agn
 */
public class ServletController_Altera_pre_atendimento extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        alteraDados obauteraDados = new alteraDados();
        pre_atendimento obPreAtendimento = new pre_atendimento();
        
        obPreAtendimento.setId_pre_Atendimento(Integer.parseInt(request.getParameter("id")));
        obPreAtendimento.setCod_especialista(request.getParameter("cod_especialista"));        
       obPreAtendimento.setCod_paciente(request.getParameter("cod_paciente"));
       obPreAtendimento.setData_abertura(request.getParameter("data_abertura"));
        obPreAtendimento.setData_consulta(request.getParameter("data_consulta"));
        obPreAtendimento.setHora_consulta(request.getParameter("hora_consulta"));        
       obPreAtendimento.setValor_pagamento(request.getParameter("valor_pagamento"));
       obPreAtendimento.setData_pagamento(request.getParameter("data_pagamento"));
       obPreAtendimento.setStatus_pre_atendimento(request.getParameter("status_pre_atendimento"));
       obPreAtendimento.setOutras_informacoes(request.getParameter("outras_informacoes"));
        
       obauteraDados.alteraPreAtendimento(obPreAtendimento);
        out.printf("Pre Atendimento alterado");
    }


}
