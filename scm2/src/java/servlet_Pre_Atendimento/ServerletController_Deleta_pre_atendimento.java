/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Pre_Atendimento;

import classes.deletaDados;
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
public class ServerletController_Deleta_pre_atendimento extends HttpServlet {

    
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        PrintWriter out = response.getWriter();
        
        deletaDados objdeletaDados = new deletaDados();
       pre_atendimento objPreAtendiemnto = new pre_atendimento();
        
        objPreAtendiemnto.setId_pre_Atendimento(Integer.parseInt(request.getParameter("id")));
        
        objdeletaDados.deletaPreAtendimento(objPreAtendiemnto);
        
        out.print(" Pre Atendimento Deletado");
        
    }

    

}
