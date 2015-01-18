/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Especialidade;

import classes.consultaDados;
import classes.especialidade;
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
public class ServletController_Consulta_Especialidade extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        consultaDados objConsultaDados = new consultaDados();
        especialidade objEspecialidade = new especialidade();
        
        objEspecialidade.setId_especialidade(Integer.parseInt(request.getParameter("id")));
        
        objConsultaDados.consultaEspecialidade(objEspecialidade);
        
         
        request.getSession().setAttribute("id", String.valueOf(objEspecialidade.getId_especialidade()));
        request.getSession().setAttribute("nome_especialidade", String.valueOf(objEspecialidade.getNome_especialidade()));
        response.sendRedirect("altera_Especialidade.jsp");
       
    }


}
