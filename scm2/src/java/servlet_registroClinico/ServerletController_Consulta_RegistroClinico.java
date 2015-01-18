/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_registroClinico;

import classes.consultaDados;
import classes.registroClinico;
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
public class ServerletController_Consulta_RegistroClinico extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        consultaDados objConsultadados = new consultaDados();
        registroClinico objRegistroClinico = new registroClinico();
        
        objRegistroClinico.setCod_RestriClinico(Integer.parseInt(request.getParameter("id")));
        
        objConsultadados.consultaRegistroClinico(objRegistroClinico);
        
        request.getSession().setAttribute("id", String.valueOf(objRegistroClinico.getCod_RestriClinico())); 
         request.getSession().setAttribute("cod_pre_atendimento", String.valueOf(objRegistroClinico.getCod_pre_atendimento()));
        request.getSession().setAttribute("consulta", String.valueOf(objRegistroClinico.getConsulta()));
        request.getSession().setAttribute("diagnostico", String.valueOf(objRegistroClinico.getDiagnostico())); 
        
         request.getSession().setAttribute("receita", String.valueOf(objRegistroClinico.getReceita())); 
         request.getSession().setAttribute("guia_exame", String.valueOf(objRegistroClinico.getGuia_exame()));
        
        
        response.sendRedirect("altera_RegistroClinico.jsp");
        
    }

   

}
