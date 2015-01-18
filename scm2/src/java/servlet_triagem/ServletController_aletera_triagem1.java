/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_triagem;

import classes.alteraDados;
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
public class ServletController_aletera_triagem1 extends HttpServlet {

   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter out = response.getWriter();
        
        alteraDados objAlteraDados= new alteraDados();
        triagem objTriagem = new triagem();
        
        objTriagem.setId (request.getParameter("id"));
        objTriagem.setCod_pre_atendimento(Integer.parseInt(request.getParameter("cod_pre_atendimento")));
        objTriagem.setAtividade_muscular(request.getParameter("atividade_muscular"));
        objTriagem.setRepiracao(request.getParameter("repiracao"));
        objTriagem.setCirculacao(request.getParameter("circulacao"));
        objTriagem.setConsciencia(request.getParameter("consciencia"));
        objTriagem.setTemperatura(request.getParameter("temperatura"));
        objTriagem.setPressao_arterial(request.getParameter("pressao_arterial"));
        objTriagem.setPeso(request.getParameter("peso"));
        objTriagem.setTamanho(request.getParameter("tamanho"));
        objTriagem.setIdade(request.getParameter("idade"));
        
        
        
        
        objAlteraDados.alteraTriagem(objTriagem);
        
        out.print("Registro alterado com sucesso");
    }

    
}
