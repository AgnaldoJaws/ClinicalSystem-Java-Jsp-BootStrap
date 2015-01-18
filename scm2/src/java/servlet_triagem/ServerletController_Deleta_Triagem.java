package servlet_triagem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import classes.deletaDados;
import classes.triagem;
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
public class ServerletController_Deleta_Triagem extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        deletaDados objDeletadados = new deletaDados();
        triagem objTriagem = new triagem();
        
        objTriagem.setId(request.getParameter("id"));
        
        objDeletadados.deletaTriagem(objTriagem);
        
        out.print("Triagem deletada");
        
    }

    
}
