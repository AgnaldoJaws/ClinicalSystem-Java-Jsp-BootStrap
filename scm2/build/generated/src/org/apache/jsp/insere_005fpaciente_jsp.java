package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insere_005fpaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("          <h1>Cadastrar Paciente</h1>\n");
      out.write("          <form action=\"ServletController_Inserir_Paciente\" method=\"POST\" name=\"testeForm\">\n");
      out.write("            Nome Médico: <select id=\"combo\" name=\"cod_especialista\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" </select> <br>\n");
      out.write("                           \n");
      out.write("            \n");
      out.write("           Nome: : <input type=\"text\" name=\"nome\" value=\"\"><br>\n");
      out.write("           Cpf: : <input type=\"text\" name=\"cpf\" value=\"\"><br>\n");
      out.write("           Rg  : <input type=\"text\" name=\"rg\" value=\"\"><br>\n");
      out.write("           Data Nascimento : <input type=\"text\" name=\"dataNascimento\" value=\"\"><br>\n");
      out.write("           Endereco: <input type=\"text\" name=\"endereco\" value=\"\"><br>\n");
      out.write("           Cep : <input type=\"text\" name=\"cep\" value=\"\"><br>\n");
      out.write("           Bairro : <input type=\"text\" name=\"bairro\" value=\"\"><br>\n");
      out.write("           Cidade : <input type=\"text\" name=\"cidade\" value=\"\"><br>\n");
      out.write("           Estado : <input type=\"text\" name=\"estado\" value=\"\"><br>\n");
      out.write("           Logradouro : <input type=\"text\" name=\"logradouro\" value=\"\"><br>\n");
      out.write("           Complemento : <input type=\"text\" name=\"complemento\" value=\"\"><br>\n");
      out.write("           Celular : <input type=\"text\" name=\"celular\" value=\"\"><br>\n");
      out.write("           Email : <input type=\"text\" name=\"email\" value=\"\"><br>\n");
      out.write("           Profissao : <input type=\"text\" name=\"profissao\" value=\"\"><br>\n");
      out.write("           Paciente desde : <input type=\"text\" name=\"paciente_desde\" value=\"\"><br>\n");
      out.write("           Última Consulta: <input type=\"text\" name=\"ultima_consulta\" value=\"\"><br>\n");
      out.write("           \n");
      out.write("        <input type=\"submit\" name=\"testar\" value=\"Enviar\">\n");
      out.write("             \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("especialista");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaEspecialista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                \n");
          out.write("                <option value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${especialista.nome_especialista}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'/>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${especialista.nome_especialista}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                \n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
