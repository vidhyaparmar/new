package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mathsecond_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("   \n");
      out.write("body{\n");
      out.write("font-size:100%;\n");
      out.write("font-family:Arial,lucida sans unicode;\n");
      out.write("background-image:url(\"Images/book9.jpg\");\n");
      out.write("line-height:1.5;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("text-decoration:none;\n");
      out.write("}\n");
      out.write("a:link,a:visited \n");
      out.write("{\n");
      out.write("color:#CF5C3F;\n");
      out.write("}\n");
      out.write("a:hover,a:active\n");
      out.write("{\n");
      out.write("background-color:#CF5C3F;\n");
      out.write("color:white;\n");
      out.write("}\n");
      out.write("#head\n");
      out.write("{\n");
      out.write(" width:70%;\n");
      out.write("float:right;\n");
      out.write("border-radius:5px;\n");
      out.write("height:185px;\n");
      out.write("font-family:times new roman;\n");
      out.write("font-size:50px;\n");
      out.write("background:-webkit-linear-gradient(lightblue, white);\n");
      out.write("margin-top:2%;\n");
      out.write("padding-top:45px;\n");
      out.write("padding-left: 20px;\n");
      out.write("//alignment-adjust: central;\n");
      out.write("color:#CF5C3F;\n");
      out.write("}\n");
      out.write("#head marquee:hover\n");
      out.write("{\n");
      out.write("color:#666;\n");
      out.write("}\n");
      out.write(".body\n");
      out.write("{\n");
      out.write("margin: 0 auto;\n");
      out.write("width:70%;\n");
      out.write("}\n");
      out.write(".mainheader img\n");
      out.write("{\n");
      out.write("width:27%;\n");
      out.write("height:230px;\n");
      out.write("margin:2% 0;\n");
      out.write("border-radius:5px;\n");
      out.write("box-shadow:3px 3px 3px #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#link\n");
      out.write("{\n");
      out.write("\n");
      out.write("font-size: 25px ;\n");
      out.write("border-radius:5px;\n");
      out.write("width:80%;\n");
      out.write("float:left;\n");
      out.write("margin-right:15px;\n");
      out.write("margin-top:5px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("        <body  background=\"Images/gray.png\" class=\"body\">\n");
      out.write("         <div class=\"mainheader\">\n");
      out.write(" <img src=\"Images/math.png\" height=\"30%\" width=\"30%\"> \n");
      out.write("<div id=\"head\">\n");
      out.write("    <b> <marquee  behavior=\"alternate\" >Mathematical Solution </marquee></b>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form name=\"form1\" action=\"logoutbutton.jsp\" method=\"post\">\n");
      out.write("    <input type=\"submit\" value=\"logout\"  name=\"action1\"/>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        <div id=\"link\">\n");
      out.write("<ul>\n");
      out.write("\n");
      out.write("<b><li><a href=\"conversion.html\">Number System </a></li>\n");
      out.write("    <li><a href=\"gradesyst.jsp\">Result And Grading System</a></li>\n");
      out.write("    <li><a href=\"roots.jsp\">Root of Equation</a></li>\n");
      out.write("    <li><a href=\"tempcon.jsp\">Convert temperature Celsius into Fahrenheit</a></li>\n");
      out.write("    <li><a href=\"calculator.html\">Calculator</a></li>\n");
      out.write("    <li><a href=\"area.html\">Area of any Geometry shape</a></li>\n");
      out.write("   <li><a href=\"volume.jsp\">Volume of any Geometry shape</a></li>\n");
      out.write("    <li><a href=\"factorial.jsp\"> Find Factorial  </a></li>\n");
      out.write("    <li><a href=\"palindrom.jsp\">Palindrome Number</a></li>\n");
      out.write("    <li><a href=\"evenodd.jsp\"> Even or Odd </a></li>\n");
      out.write("\n");
      out.write("     <li><a href=\"maximum.html\">Maximum Number</a></li>\n");
      out.write("     <li><a href=\"minimum.html\">Minimum Number</a></li>\n");
      out.write("\n");
      out.write("<li><a href=\"armstrong.html\">Armstrong number</a></li>\n");
      out.write("<li><a href=\"revstr.html\">Reverse Number or String</a></li>\n");
      out.write("\n");
      out.write("<li><a href=\"prime.html\">Prime Number</a></li>\n");
      out.write("<li><a href=\"power.jsp\">Calculate power</a></li>\n");
      out.write("<li><a href=\"simpleinterest.jsp\">Simple Interest</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("<li><a href=\"sqrt.html\">Square Root</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
