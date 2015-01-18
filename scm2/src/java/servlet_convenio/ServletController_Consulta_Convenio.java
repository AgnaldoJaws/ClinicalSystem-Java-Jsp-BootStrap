/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_convenio;

import classes.consultaDados;
import classes.convenio;
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
public class ServletController_Consulta_Convenio extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        consultaDados objConsultaDados = new consultaDados();
        convenio objConvenio = new convenio();
        objConvenio.setId(Integer.parseInt(request.getParameter("id")));
        objConsultaDados.consultaConvenio(objConvenio);
        
        request.getSession().setAttribute("id", String.valueOf(objConvenio.getId()));
        request.getSession().setAttribute("nome_empresa", String.valueOf(objConvenio.getNome_empre()));
        request.getSession().setAttribute("cnpj", String.valueOf(objConvenio.getCnpj()));
        request.getSession().setAttribute("endereco", String.valueOf(objConvenio.getEndereco()));
        request.getSession().setAttribute("cidade", String.valueOf(objConvenio.getCidade()));
        
        response.sendRedirect("altera_Convenio.jsp");
       
       
    }

    

}
