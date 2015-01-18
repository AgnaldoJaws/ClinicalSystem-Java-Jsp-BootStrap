/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_especialista;

import classes.consultaDados;
import classes.especialista;
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
public class ServletController_Consulta_Especialista extends HttpServlet {

    
   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        consultaDados objConsultaDados = new consultaDados();
        especialista objEspecialista = new especialista();
        
        objEspecialista.setId(Integer.parseInt(request.getParameter("cod_especialista")));
        
        objConsultaDados.consultaEspecialista(objEspecialista);
        
       request.getSession().setAttribute("cod_especialista", String.valueOf(objEspecialista.getId()));
        request.getSession().setAttribute("cod_especialidade", String.valueOf(objEspecialista.getId()));
        request.getSession().setAttribute("crm", String.valueOf(objEspecialista.getCrm()));
        request.getSession().setAttribute("nome", String.valueOf(objEspecialista.getNome()));
        request.getSession().setAttribute("endereco", String.valueOf(objEspecialista.getEndereco()));
        request.getSession().setAttribute("bairro", String.valueOf(objEspecialista.getBairro()));
        request.getSession().setAttribute("cidade", String.valueOf(objEspecialista.getCidade()));
        request.getSession().setAttribute("logradouro", String.valueOf(objEspecialista.getLogradouro()));
        request.getSession().setAttribute("estado", String.valueOf(objEspecialista.getEstado()));
        request.getSession().setAttribute("complemento", String.valueOf(objEspecialista.getComplemento()));
        request.getSession().setAttribute("telefone", String.valueOf(objEspecialista.getTelefone()));
        request.getSession().setAttribute("cpf", String.valueOf(objEspecialista.getCpf()));
        request.getSession().setAttribute("rg", String.valueOf(objEspecialista.getRg()));
        request.getSession().setAttribute("consenho_profissional", String.valueOf(objEspecialista.getConsenho_profissional()));
        request.getSession().setAttribute("outras_informacoes", String.valueOf(objEspecialista.getOutras_informacoes()));
        response.sendRedirect("altera_Especialista.jsp");
        
    }

    

}
