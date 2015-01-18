/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet_Paciente;

import classes.alteraDados;
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
public class Servlet_Autera_paciente2 extends HttpServlet {

   
    

    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter out = response.getWriter();
        alteraDados objAlteraDados= new alteraDados();
        paciente objPaciente = new paciente();
        
        objPaciente.setId (Integer.parseInt(request.getParameter("id")));
        objPaciente.setCod_convenio((Integer.parseInt(request.getParameter("cod_convenio"))));
        objPaciente.setNome (request.getParameter("nome"));
        objPaciente.setCpf(request.getParameter("cpf"));
        objPaciente.setRg(request.getParameter("rg"));
        objPaciente.setDataNascimento(request.getParameter("dataNascimento"));
        objPaciente.setEndereco(request.getParameter("endereco"));
        objPaciente.setCep(request.getParameter("cep"));
        objPaciente.setBairro(request.getParameter("bairro"));
        objPaciente.setCidade(request.getParameter("cidade"));
        objPaciente.setEstado(request.getParameter("estado"));
        objPaciente.setLogradouro(request.getParameter("logradouro"));
        objPaciente.setComplemento(request.getParameter("complemento"));
        objPaciente.setCelular(request.getParameter("celular"));
        objPaciente.setEmail(request.getParameter("email"));
        objPaciente.setProfissao(request.getParameter("profissao"));
        objPaciente.setPaciente_desde(request.getParameter("paciente_desde "));
        objPaciente.setUltima_consulta(request.getParameter("ultima_consulta"));
        
        
        objAlteraDados.alteraPaciente(objPaciente);
         out.print("Registro alterado com sucesso");
    }

    

}
