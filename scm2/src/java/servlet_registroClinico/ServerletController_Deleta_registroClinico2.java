/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_registroClinico;
import classes.deletaDados;
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
public class ServerletController_Deleta_registroClinico2 extends HttpServlet {

    
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        deletaDados objDeletadados = new deletaDados();
        registroClinico objRegistroClinico = new registroClinico();
        
        objRegistroClinico.setCod_RestriClinico(Integer.parseInt(request.getParameter("id")));
        
        objDeletadados.deletaRegistroClinico(objRegistroClinico);
        
        out.print("Registro Clinico deletado");
    }

    

}
