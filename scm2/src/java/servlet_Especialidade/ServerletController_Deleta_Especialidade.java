/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Especialidade;

import classes.deletaDados;
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
public class ServerletController_Deleta_Especialidade extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        deletaDados objDeletaDados = new deletaDados();
        especialidade objespecialidade = new especialidade();
        
        objespecialidade.setId_especialidade(Integer.parseInt(request.getParameter("id")));
        
        objDeletaDados.deletaEspecialidade(objespecialidade);
        
        out.print("Especialidade Deletado");
    }

   
}
