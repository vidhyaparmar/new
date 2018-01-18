package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class simpleinterest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("#main\n");
      out.write("{\n");
      out.write("border:2px solid black;\n");
      out.write("height:30%;\n");
      out.write("padding:100px;\n");
      out.write("margin-left:400px;\n");
      out.write("margin-top:100px;\n");
      out.write("margin-right:400px;\n");
      out.write("border-radius:5px;\n");
      out.write("background-color:cyan;\n");
      out.write("}\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("color:white;\n");
      out.write("margin-top:100px;\n");
      out.write("}\n");
      out.write("  body{\n");
      out.write("            font-family: \"times new roman\" ;\n");
      out.write("            font-size: 20px;\n");
      out.write("            background-image:url(\"diamo.jpg\");\n");
      out.write("             \n");
      out.write("          //  opacity: 50;\n");
      out.write("        \n");
      out.write("} </style>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function calsi()\n");
      out.write("{\n");
      out.write("\n");
      out.write("var p=document.f.d1.value;\n");
      out.write("var r=document.f.d2.value;\n");
      out.write("var t=document.f.d3.value;\n");
      out.write("var s=parseInt(p)*parseInt(r)*parseInt(t)/100;\n");
      out.write("alert(\"simple interest is:\"+s);\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write(" </head>\n");
      out.write("<body bgcolor=\"blue\">\n");
      out.write("<h1 align=\"center\" >SIMPLE INTEREST</h1>\n");
      out.write("<div id=main>\n");
      out.write("<form name=\"f\">\n");
      out.write("<b>Principal amount:-</b><input type=\"text\"  size=\"10\" name=\"d1\" ><br><br>\n");
      out.write("<b>Rate of interest:-</b><input type=\"text\"  size=\"5\" name=\"d2\"><br><br>\n");
      out.write("<b>Time in year:-</b><input type=\"text\"  size=\"5\" name=\"d3\"><br><br>\n");
      out.write("<b>Simple Interest:-</b><button onclick=\"calsi()\"> click here</button>\n");
      out.write("<button type=\"reset\">Reset</button>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body></html>");
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
