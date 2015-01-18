/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_convenio;

import classes.convenio;
import classes.deletaDados;
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
public class ServerletController_Deleta_convenio extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        deletaDados objdeletaDados = new deletaDados();
        convenio objConvenio = new convenio();
        
        objConvenio.setId(Integer.parseInt(request.getParameter("id")));
        
        objdeletaDados.deletaConvenio(objConvenio);
        
        out.print("Convenio Deletado");
    }

    

}
