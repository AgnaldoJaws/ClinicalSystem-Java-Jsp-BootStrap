/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_convenio;

import classes.alteraDados;
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
public class ServletController_Altera_Convenio extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
      
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
    alteraDados objAlteraDados = new alteraDados();
    convenio objConvenio = new convenio();
    
    objConvenio.setId(Integer.parseInt(request.getParameter("id")));
     objConvenio.setNome_empre(request.getParameter("nome_empresa"));
     objConvenio.setCnpj(request.getParameter("cnpj"));
     objConvenio.setEndereco(request.getParameter("endereco"));
     objConvenio.setCidade(request.getParameter("cidade"));
     
     objAlteraDados.alteraConvenio(objConvenio);
     
      out.print("Registro alterado com sucesso");

}
}