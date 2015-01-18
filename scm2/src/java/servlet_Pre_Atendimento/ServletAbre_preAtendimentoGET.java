/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Pre_Atendimento;

import classes.paciente;
import classes.consultaDados;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author agnaldo-pc
 */
public class ServletAbre_preAtendimentoGET extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        paciente objPaciente = new paciente();
        
        
        
        objPaciente.setId(Integer.parseInt(request.getParameter("id")));
        
        
        request.getSession().setAttribute("id", objPaciente.getId());
        
        
        response.sendRedirect("inserir_pre_atendimento.jsp");
        
        
    }

    

    

}
