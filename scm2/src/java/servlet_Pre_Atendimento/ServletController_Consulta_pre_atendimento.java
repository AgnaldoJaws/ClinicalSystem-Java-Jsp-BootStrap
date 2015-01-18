/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Pre_Atendimento;

import classes.consultaDados;
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
public class ServletController_Consulta_pre_atendimento extends HttpServlet {

   
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        consultaDados objConsultaDados = new consultaDados();
        pre_atendimento objPreatendimento = new pre_atendimento();
        
         
      
        
        objPreatendimento.setId_pre_Atendimento(Integer.parseInt(request.getParameter("id")));
        
        objConsultaDados.consultaPreAtendimento(objPreatendimento);
        
        
         request.getSession().setAttribute("id", String.valueOf(objPreatendimento.getId_pre_Atendimento()));
         request.getSession().setAttribute("cod_especialista", String.valueOf(objPreatendimento.getCod_especialista()));
         request.getSession().setAttribute("cod_paciente ", String.valueOf(objPreatendimento.getCod_paciente()));
         request.getSession().setAttribute("data_abertura", String.valueOf(objPreatendimento.getData_abertura()));
         request.getSession().setAttribute("data_consulta", String.valueOf(objPreatendimento.getData_consulta()));
         request.getSession().setAttribute("hora_consulta", String.valueOf(objPreatendimento.getHora_consulta()));
         request.getSession().setAttribute("valor_pagamento", String.valueOf(objPreatendimento.getValor_pagamento()));
         request.getSession().setAttribute("data_pagamento", String.valueOf(objPreatendimento.getData_pagamento()));
         request.getSession().setAttribute("outras_informacoes", String.valueOf(objPreatendimento.getOutras_informacoes()));
               
        response.sendRedirect("altera_pre_atendimento.jsp");
        
        
    }

    

}
