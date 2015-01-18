/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_registroClinico;

import classes.insereDados;
import classes.registroClinico;
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
public class Servlet_insere_registro_clinico extends HttpServlet {

    

    
   
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        insereDados objInsereDados = new insereDados();
        registroClinico objRegistroClinico = new registroClinico();
        
        objRegistroClinico.setCod_pre_atendimento(Integer.parseInt(request.getParameter("cod_pre_atendimento")));
        objRegistroClinico.setConsulta(request.getParameter("consulta"));
        objRegistroClinico.setDiagnostico(request.getParameter("diagnostico"));
        objRegistroClinico.setReceita(request.getParameter("receita"));
        objRegistroClinico.setGuia_exame(request.getParameter("guia_exame"));
        
        objInsereDados.insereRegistroClinico(objRegistroClinico);
        out.print("Registro Clinico inserido");
        
    }


}
