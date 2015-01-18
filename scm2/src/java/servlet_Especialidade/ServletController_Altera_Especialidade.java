/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Especialidade;

import classes.alteraDados;
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
public class ServletController_Altera_Especialidade extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter out = response.getWriter();
        alteraDados objAlteradados = new alteraDados();
        especialidade objEspecialidade = new especialidade();
        
        
        objEspecialidade.setId_especialidade(Integer.parseInt(request.getParameter("id")));
        objEspecialidade.setNome_especialidade(request.getParameter("nome_especialidade"));
        
        objAlteradados.alteraEspecialidade(objEspecialidade);
        
        out.print("Registro alterado com sucesso");
    }

}
