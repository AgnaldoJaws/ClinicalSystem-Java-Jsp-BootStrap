/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_convenio;

import classes.convenio;
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
public class ServletController_Inserir_Convenio extends HttpServlet {

   

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        insereDados objInsereDados = new insereDados();
        convenio objConvenio = new convenio();
        
        objConvenio.setNome_empre(request.getParameter("nome_empresa"));
        objConvenio.setCnpj(request.getParameter("cnpj"));
        objConvenio.setEndereco(request.getParameter("endereco"));
        objConvenio.setCidade(request.getParameter("cidade"));
        
        objInsereDados.insereConvenio(objConvenio);
        
       out.printf("Convenio cadastrado com sucesso");
    }

   

}
