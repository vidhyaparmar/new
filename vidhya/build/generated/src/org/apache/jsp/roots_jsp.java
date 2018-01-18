package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roots_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html><SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("\n");
      out.write("function quad(form) {\n");
      out.write("a=eval(form.a.value);\n");
      out.write("b=eval(form.b.value);\n");
      out.write("c=eval(form.c.value);\n");
      out.write("x1=-b/2/a+Math.pow(Math.pow(b,2)-4*a*c,0.5)/2/a;\n");
      out.write("x2=-b/2/a-Math.pow(Math.pow(b,2)-4*a*c,0.5)/2/a;\n");
      out.write("form.x1.value = x1;\n");
      out.write("form.x2.value = x2;\n");
      out.write("if (form.x1.value == \"NaN\") form.x1.value=\"Imag.!\";\n");
      out.write("if (form.x2.value == \"NaN\") form.x2.value=\"Imag.!\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("</SCRIPT>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("    <style>body{\n");
      out.write("            font-family: \"times new roman\" ;\n");
      out.write("            font-size: 20px;\n");
      out.write("            background-image:url(\"book13.jpg\");\n");
      out.write("             \n");
      out.write("          //  opacity: 50;\n");
      out.write("        \n");
      out.write("} \n");
      out.write("#tab\n");
      out.write("    {\n");
      out.write("    border: 4px solid black;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    width: 25%;\n");
      out.write("    padding:25px;\n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("         \n");
      out.write("<center>\n");
      out.write("<form name=form>\n");
      out.write("<table border=2  id=\"tab\" cellpadding=2 style=\"backgroundcolor:lightpink\">\n");
      out.write("<tr>\n");
      out.write("<td colspan=2 align=center><b>Quadratic Equation:<br>Ax<sup>2</sup> + Bx + C = 0</b></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<center><table border=2 width=20% cellpadding=1>\n");
      out.write("        <tr><td>1</td>\n");
      out.write("<td align=center><b>A </b></td>\n");
      out.write("<td align=center><input type=text size=6 name=\"a\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td></td></tr>\n");
      out.write("<tr><td></td></tr>\n");
      out.write("<tr><td>2</td>\n");
      out.write("<td align=center><b>B </b></td>\n");
      out.write("<td align=center><input type=text size=6 name=\"b\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr><td></td></tr>\n");
      out.write("<tr><td></td></tr>\n");
      out.write("<tr><td>3</td>\n");
      out.write("<td align=center><b>C  </b></td>\n");
      out.write("<td align=center><input type=text size=6 name=\"c\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td></td></tr>\n");
      out.write("<tr><td></td></tr>\n");
      out.write("</table>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<center><table border=1 width=100% cellpadding=2>\n");
      out.write("<tr>\n");
      out.write("<td colspan=2 align=center>\n");
      out.write("<input type=button value=\"Solve\" onClick=\"quad(this.form)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=center><b>X1 = </b></td>\n");
      out.write("<td align=center><input type=text size=6 name=\"x1\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=center><b>X2 = </b></td>\n");
      out.write("<td align=center><input type=text size=6 name=\"x2\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
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
