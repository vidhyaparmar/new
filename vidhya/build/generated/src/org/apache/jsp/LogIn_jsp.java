package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Log In</title>\n");
      out.write("    </head>\n");
      out.write("     <style>\n");
      out.write("         body{\n");
      out.write("            \n");
      out.write("          //  opacity: 0.4;\n");
      out.write("            background-image:url(\"Images/book2.jpg\");\n");
      out.write("        \n");
      out.write("} \n");
      out.write("     #tab\n");
      out.write("    {\n");
      out.write("    border: 3px solid black;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    width: 25%;\n");
      out.write("    padding:25px;\n");
      out.write("    }\n");
      out.write("     </style>\n");
      out.write("       \n");
      out.write("     <body >\n");
      out.write("     <center>\n");
      out.write("         <img src=\"Images/admin.jpg\" >\n");
      out.write("           <form name=\"form1\" action=\"verifyuser.jsp\" method=\"post\"> \n");
      out.write("         <h1>LOGIN  ACCOUNT  </h1>\n");
      out.write("         \n");
      out.write("         <div border=\"7px\" colour=\"red\">\n");
      out.write("     <table id=\"tab\"> \n");
      out.write("         <tr>\n");
      out.write("           <td> \n");
      out.write("                 <h3> User Name:</h3>\n");
      out.write("           </td> \n");
      out.write("           <td>\n");
      out.write("               <input type=\"text\" name=\"txtname\" />\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td> \n");
      out.write("               <h3> Password </h3>\n");
      out.write("        </td> \n");
      out.write("           <td>\n");
      out.write("               <input type=\"password\" name=\"txtpass1\" /> \n");
      out.write("           </td>\n");
      out.write("          \n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("         </table>\n");
      out.write("         </div>\n");
      out.write("         </div>          \n");
      out.write("   \n");
      out.write("         <input type=\"submit\" value=\"login\" name=\"action\"  onclick=\"cok()\" /> \n");
      out.write("     \n");
      out.write("               <a href=\"signin.jsp\"> New User</a>\n");
      out.write("          \n");
      out.write("     \n");
      out.write("    \n");
      out.write("           </form>\n");
      out.write("     </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
