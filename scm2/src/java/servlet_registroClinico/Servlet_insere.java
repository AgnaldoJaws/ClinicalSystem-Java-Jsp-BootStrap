/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_registroClinico;
import classes.pre_atendimento;
import classes.paciente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author agnaldo-pc
 */
public class Servlet_insere extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         pre_atendimento objPA = new pre_atendimento();;
        
        
        objPA.setId_pre_Atendimento(Integer.parseInt(request.getParameter("id")));
        
        
        request.getSession().setAttribute("id", objPA.getId_pre_Atendimento());
        
        RequestDispatcher rd = request.getRequestDispatcher("insert_registroClinico.jsp");
        
        rd.forward(request, response);
        
        
        
    }

    

}
