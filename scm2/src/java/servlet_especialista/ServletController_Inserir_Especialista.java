/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_especialista;

import classes.especialista;
import classes.insereDados;
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
public class ServletController_Inserir_Especialista extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
       insereDados objinsereDados = new insereDados();
       especialista objEspecialista = new especialista();
       
       
       objEspecialista.setCod_especialidade(Integer.parseInt(request.getParameter("cod_especialidade")));
       objEspecialista.setCrm(request.getParameter("crm"));
        objEspecialista.setNome(request.getParameter("nome"));
        objEspecialista.setEndereco(request.getParameter("endereco"));
        objEspecialista.setBairro(request.getParameter("bairro"));
        objEspecialista.setCidade(request.getParameter("cidade"));
        objEspecialista.setLogradouro(request.getParameter("logradouro"));
        objEspecialista.setEstado(request.getParameter("estado"));
        objEspecialista.setComplemento(request.getParameter("complemento"));
        objEspecialista.setTelefone(request.getParameter("telefone"));
        objEspecialista.setCpf(request.getParameter("cpf"));
        objEspecialista.setRg(request.getParameter("rg"));
        objEspecialista.setConsenho_profissional(request.getParameter("consenho_profissional"));
        objEspecialista.setOutras_informacoes(request.getParameter("outras_informacoes"));
        
       
       objinsereDados.insereEspecialista(objEspecialista);
       out.print("Especialista cadastrado");
    }


}
