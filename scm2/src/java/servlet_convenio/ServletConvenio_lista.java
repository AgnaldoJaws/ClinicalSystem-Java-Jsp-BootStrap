/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_convenio;

import classes.ListarDadosDAO;
import classes.convenio;
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
public class ServletConvenio_lista extends HttpServlet {

   

   
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         convenio objConvenio = new convenio();
        ListarDadosDAO cc = new ListarDadosDAO();
        
        cc.listar();
        
        List<convenio> lista = cc.listaConvenio;
        
        request.setAttribute("listaConvenio",lista);
        
        RequestDispatcher rd = request.getRequestDispatcher("insere_paciente.jsp");
        
        rd.forward(request, response);
        
       
    }

    
}
