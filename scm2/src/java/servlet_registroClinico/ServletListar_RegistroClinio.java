/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_registroClinico;
import classes.registroClinico;
import classes.pre_atendimento;
import classes.ListarDadosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.util.Collections.list;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author agnaldo-pc
 */
public class ServletListar_RegistroClinio extends HttpServlet {

   
   
    
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      pre_atendimento objPreAtendimento = new pre_atendimento();
      ListarDadosDAO objListaPreAtendimento = new ListarDadosDAO();
      
      objListaPreAtendimento.listarPA();
      
      List<pre_atendimento> listaPreA= objListaPreAtendimento.listaPA;
      
      
      request.setAttribute("listaPA",listaPreA );
      
      
      RequestDispatcher rd = request.getRequestDispatcher("consultas_do_dia.jsp");
        
        rd.forward(request, response);
       
    }

    

}
