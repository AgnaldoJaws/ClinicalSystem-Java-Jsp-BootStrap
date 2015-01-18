/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Especialidade;

import classes.ListarDadosDAO;
import classes.especialidade;
import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author agn
 */
public class Servlet_list_Especialidade extends HttpServlet {

   
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        especialidade ee = new especialidade();
        ListarDadosDAO ll = new ListarDadosDAO();
        
        ll.listarEspecialidade();
        List <especialidade> listaEspecialidade = ll.listaEspecialidade;
        
        request.setAttribute("listaEspecialidade", listaEspecialidade);
        
        
        RequestDispatcher rd = request.getRequestDispatcher("resultado_Especialidade.jsp");
        rd.forward(request, response);
    }

    
}
