/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet_Paciente;
import classes.ListarDadosDAO;
import classes.paciente;
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
public class servlet_Listar_Paciente extends HttpServlet {

    
   
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        paciente objPaciente = new paciente();
        ListarDadosDAO objListarDados = new ListarDadosDAO();
        
        objListarDados.listarPaciente();
        
        List<paciente> PacienteList = objListarDados.listaPaciente;
        
        request.setAttribute("listaPaciente",PacienteList );
        
        RequestDispatcher rd = request.getRequestDispatcher("listarPaciente.jsp");
        
        rd.forward(request, response);
        
        
    }

   

}
