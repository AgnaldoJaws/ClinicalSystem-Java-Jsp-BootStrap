package Servlet_Paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import classes.deletaDados;
import classes.paciente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author agnaldo-pc
 */
public class DeletaPacServlet extends HttpServlet {

    
    

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
        deletaDados objDeletaDados = new deletaDados();
        paciente objPaciente = new paciente();
        
        objPaciente.setId(Integer.parseInt(request.getParameter("id")));
        
        objDeletaDados.deletaPaciente(objPaciente);
        
        out.print("Paciente Deletado");
    }

    

}
