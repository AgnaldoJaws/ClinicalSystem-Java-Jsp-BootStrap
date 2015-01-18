/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Pre_Atendimento;

import classes.insereDados;
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
public class ServletController_Inseri_pre_atendimento extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        insereDados objInseredados = new insereDados();
        pre_atendimento objPreAtendimento = new pre_atendimento();
        
        
        
        objPreAtendimento.setCod_especialista(request.getParameter("cod_especialista"));
        objPreAtendimento.setCod_paciente(request.getParameter("cod_paciente"));
        objPreAtendimento.setData_abertura(request.getParameter("data_abertura"));
        objPreAtendimento.setData_consulta(request.getParameter("data_consulta"));
        objPreAtendimento.setHora_consulta(request.getParameter("hora_consulta"));
        objPreAtendimento.setValor_pagamento(request.getParameter("valor_pagamento"));
        objPreAtendimento.setData_pagamento(request.getParameter("data_pagamento"));
        objPreAtendimento.setStatus_pre_atendimento(request.getParameter("status_pre_atendimento"));
        objPreAtendimento.setOutras_informacoes(request.getParameter("outras_informacoes"));
        
        objInseredados.inserePre_atendimento(objPreAtendimento);
        
        
        out.printf("Pre Atendimento inserido");
        
    }

    

}
