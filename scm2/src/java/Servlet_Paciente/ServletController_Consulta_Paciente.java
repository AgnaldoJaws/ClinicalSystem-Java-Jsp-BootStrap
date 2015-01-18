/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet_Paciente;

import classes.consultaDados;
import classes.paciente;
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
public class ServletController_Consulta_Paciente extends HttpServlet {

   

    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        consultaDados objConsultaDados = new consultaDados();
        paciente objPaciente = new paciente();
        
        objPaciente.setId(Integer.parseInt(request.getParameter("id")));
        
        objConsultaDados.consultaPaciente(objPaciente);
        
        request.getSession().setAttribute("id",String.valueOf(objPaciente.getId()));
        request.getSession().setAttribute("cod_convenio",String.valueOf(objPaciente.getCod_convenio()));
        request.getSession().setAttribute("nome", String.valueOf (objPaciente.getNome()));
        request.getSession().setAttribute("cpf",String.valueOf(objPaciente.getCpf()));
        request.getSession().setAttribute("rg",String.valueOf(objPaciente.getRg()));
        request.getSession().setAttribute("dataNascimento", String.valueOf (objPaciente.getDataNascimento()));
        request.getSession().setAttribute("endereco",String.valueOf(objPaciente.getEndereco()));
        request.getSession().setAttribute("cep",String.valueOf(objPaciente.getCep()));
        request.getSession().setAttribute("bairro", String.valueOf (objPaciente.getBairro()));
        request.getSession().setAttribute("cidade",String.valueOf(objPaciente.getCidade()));
        request.getSession().setAttribute("estado",String.valueOf(objPaciente.getEstado()));
        request.getSession().setAttribute("logradouro", String.valueOf (objPaciente.getLogradouro()));
        request.getSession().setAttribute("complemento",String.valueOf(objPaciente.getComplemento()));
        request.getSession().setAttribute("celular",String.valueOf(objPaciente.getCelular()));
        request.getSession().setAttribute("email", String.valueOf (objPaciente.getEmail()));
        request.getSession().setAttribute("profissao", String.valueOf (objPaciente.getProfissao()));
        request.getSession().setAttribute("paciente_desde", String.valueOf (objPaciente.getPaciente_desde()));
        request.getSession().setAttribute("ultima_consulta ", String.valueOf (objPaciente.getUltima_consulta()));
        
        response.sendRedirect("altera_Paciente.jsp");
    }

    

}
