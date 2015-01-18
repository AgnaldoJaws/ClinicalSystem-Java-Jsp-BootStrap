/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_triagem;

import classes.consultaDados;
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
public class ServerletController_Consulta_Triagem extends HttpServlet {

    
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        consultaDados objconsultaDados = new consultaDados();
        triagem objTriagem = new triagem();
        
       objTriagem.setId(request.getParameter("id"));
       
       objconsultaDados.consultaTriagem(objTriagem);
       
        request.getSession().setAttribute("id", String.valueOf(objTriagem.getId()));
        request.getSession().setAttribute("cod_pre_atendimento", String.valueOf(objTriagem.getCod_pre_atendimento()));
        request.getSession().setAttribute("atividade_muscular", String.valueOf(objTriagem.getAtividade_muscular()));
        request.getSession().setAttribute("repiracao", String.valueOf(objTriagem.getRepiracao()));
        request.getSession().setAttribute("circulacao", String.valueOf(objTriagem.getCirculacao()));
        request.getSession().setAttribute("consciencia", String.valueOf(objTriagem.getConsciencia()));
        request.getSession().setAttribute("temperatura", String.valueOf(objTriagem.getTemperatura()));
        request.getSession().setAttribute("pressao_arterial", String.valueOf(objTriagem.getPressao_arterial()));
        request.getSession().setAttribute("peso", String.valueOf(objTriagem.getPeso()));
        request.getSession().setAttribute("tamanho", String.valueOf(objTriagem.getTamanho()));
        request.getSession().setAttribute("idade", String.valueOf(objTriagem.getIdade()));
        
        response.sendRedirect("altera_Triagem.jsp");
    }

    
    

}
