/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_Pre_Atendimento;
import classes.pre_atendimento;
import classes.ListarDadosDAO;
import classes.especialista;
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
public class Servlet_Lista_preAtendimento extends HttpServlet {

    

    

    
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        pre_atendimento objPreAtendimento = new pre_atendimento();
        ListarDadosDAO objLitDao = new ListarDadosDAO();
        
        objLitDao.listarPA();
        objLitDao.listarEspecialista();
        objLitDao.listarPaciente();
        
        List <pre_atendimento> listaPreAtendimento = objLitDao.listaPA;
         List <paciente> listaPaciente = objLitDao.listaPaciente;
         /* List <especialista> listaEspecialista = objLitDao.listaEspecialista;*/
        
       request.setAttribute("listaPA",listaPreAtendimento );
        request.setAttribute("listaPaciente",listaPaciente );
        /*request.setAttribute("listaEspecialista",listaEspecialista);*/
        
        RequestDispatcher rd = request.getRequestDispatcher("consultas_do_dia.jsp");
        
        rd.forward(request, response);
        
        
        
    }

    

}
