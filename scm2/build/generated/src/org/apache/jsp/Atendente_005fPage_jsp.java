package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Atendente_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Clinica M�dica</title>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"jquery.js\" ></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"script.js\" ></script>\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<ul class=\"nav\" >\n");
      out.write("    \n");
      out.write("    <li><a href=\"#\">Gerenciar convenio </a>\n");
      out.write("\t\n");
      out.write("\t    <ul>\n");
      out.write("\t\t    <li><a href=\"insere_Convenio.jsp\">Cadastrar </a></li>\n");
      out.write("\t\t    <li><a href=\"consulta_Convenio.jsp\">Pesquisar</a></li>\n");
      out.write("\t\t    \n");
      out.write("\t\t    <li><a href=\"deleta_conveno.jsp\">Excluir </a></li>\n");
      out.write("\t\t    \n");
      out.write("\t\t</ul>\n");
      out.write("\t\n");
      out.write("\t</li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <li><a href=\"#\">Gerenciar Paciente </a>\n");
      out.write("\t\n");
      out.write("\t    <ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\t    <li><a href=\"ServletConvenio_lista\">Cadastrar </a></li>\n");
      out.write("\t\t    <li><a href=\"consulta_Paciente.jsp\">Pesquisar</a></li>\n");
      out.write("\t\t    \n");
      out.write("\t\t    <li><a href=\"servlet_Listar_Paciente\">Listar </a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\n");
      out.write("\t</li>\n");
      out.write("    <li><a href=\"#\">Gerenciar Especialidade</a>\n");
      out.write("\t\n");
      out.write("\t    <ul>\n");
      out.write("\t\t    <li><a href=\"insere_Especialidade.jsp\">Cadastrar </a></li>\n");
      out.write("\t\t    <li><a href=\"consulta_Especialidade.jsp\">Pesquisar</a></li>\n");
      out.write("\t\t    <li><a href=\"altera_Especialidade.jsp\">Alterar </a></li>\n");
      out.write("\t\t    <li><a href=\"deleta_especialidade.jsp\">Excluir </a></li>\n");
      out.write("\t\t    \n");
      out.write("\t\t</ul>\n");
      out.write("\t\n");
      out.write("\t</li>\n");
      out.write("    <li><a href=\"#\">Gerenciar Especialista</a>\n");
      out.write("\t\n");
      out.write("\t<ul>\n");
      out.write("\t\t    <li><a href=\"Servlet_list_Especialidade\">Cadastrar </a></li>\n");
      out.write("\t\t    <li><a href=\"consulta_Especialista.jsp\">Pesquisar</a></li>\n");
      out.write("\t\t    <li><a href=\"altera_Especialista.jsp\">Alterar </a></li>\n");
      out.write("\t\t    <li><a href=\"deleta_Especialista.jsp\">Excluir </a></li>\n");
      out.write("\t\t    <li><a href=\"#\">Listar </a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"#\">Gerenciar Pre-Atendimento</a>\n");
      out.write("\t\n");
      out.write("\t<ul>\n");
      out.write("\t\t    \n");
      out.write("\t\t    <li><a href=\"consulta_pre_atendimento.jsp\">Pesquisar</a></li>\n");
      out.write("\t\t    <li><a href=\"altera_pre_atendimento.jsp\">Alterar </a></li>\n");
      out.write("\t\t    <li><a href=\"deleta_pre_atendimento.jsp\">Excluir </a></li>\n");
      out.write("\t\t    <li><a href=\"Servlet_Lista_preAtendimento\">Listar </a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
