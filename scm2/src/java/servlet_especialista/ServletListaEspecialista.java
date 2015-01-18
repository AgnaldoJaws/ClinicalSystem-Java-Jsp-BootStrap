/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_especialista;

import classes.especialista;
import classes.ListarDadosDAO;
import classes.paciente;
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
 * @author agnaldo-pc
 */
public class ServletListaEspecialista extends HttpServlet {

    
    
   
  
    
    

    
    
    
      @Override
    protected void doGet  (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         paciente objPaciente = new paciente();
        
        
        
        objPaciente.setId(Integer.parseInt(request.getParameter("id")));
        
        
        request.getSession().setAttribute("id", objPaciente.getId());
        
        
        
        
        
        
       
        especialista objEspecialista = new especialista();
        
        
        ListarDadosDAO objListaEspecialista = new ListarDadosDAO();
        
        
        objListaEspecialista.listarEspecialista();
        
        List<especialista> EspecialistaList = objListaEspecialista.listaEspecialista;
     
        request.setAttribute("listaEspecialista",EspecialistaList);
        
        RequestDispatcher rd = request.getRequestDispatcher("inserir_pre_atendimento.jsp");
        
        rd.forward(request, response);
        
        
        
       
    }

    
}
