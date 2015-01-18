/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_registroClinico;

import classes.alteraDados;
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
public class ServletController_aletera_registroClinico extends HttpServlet {

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        alteraDados objAlteraDados= new alteraDados();
        registroClinico objregistroClinico = new registroClinico();
        
        
        
        objregistroClinico.setCod_RestriClinico(Integer.parseInt(request.getParameter("id")));
        objregistroClinico.setCod_pre_atendimento(Integer.parseInt(request.getParameter("cod_pre_atendimento")));
        objregistroClinico.setConsulta(request.getParameter("consulta"));
        objregistroClinico.setDiagnostico(request.getParameter("diagnostico"));
        objregistroClinico.setReceita(request.getParameter("receita"));
        objregistroClinico.setGuia_exame(request.getParameter("guia_exame"));
        
        
        objAlteraDados.alteraRegistroClinico(objregistroClinico);
        
        out.print("Registro Clinico alterado com sucesso");
        
        
        
        
        
        
        
    }


}
