package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mathsolu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title> HOME </title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    \n");
      out.write("background-image:url(\"Images/book2.jpg\");\n");
      out.write("font-size:95%;\n");
      out.write("font-family:Arial,lucida sans unicode;\n");
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
      out.write("{width:70%;\n");
      out.write("\n");
      out.write("float:right;\n");
      out.write("border-radius:5px;\n");
      out.write("height:160px;\n");
      out.write("font-family:times new roman;\n");
      out.write("font-size:50px;\n");
      out.write("background-color:white;\n");
      out.write("margin-top:2%;\n");
      out.write("padding-top:45px;\n");
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
      out.write("//height:230px;\n");
      out.write("margin:2% 0;\n");
      out.write("border-radius:5px;\n");
      out.write("box-shadow:3px 3px 3px #333;\n");
      out.write("}\n");
      out.write(".mainheader1 img\n");
      out.write("{height: 29%;\n");
      out.write("width:100%;\n");
      out.write("margin:2% 0;\n");
      out.write("border-radius:5px;\n");
      out.write("box-shadow:3px 3px 3px #333;\n");
      out.write("}\n");
      out.write("/*.mainheader img:hover\n");
      out.write("{\n");
      out.write("-moz-transform:rotate(-25deg);\n");
      out.write("-webkit-transform:rotate(-25deg);\n");
      out.write("}*/\n");
      out.write(".mainheader nav\n");
      out.write("{\n");
      out.write("background-color:#666;\n");
      out.write("height:40px;\n");
      out.write("border-radius:5px;\n");
      out.write("-moz-border-radius:5px;\n");
      out.write("}\n");
      out.write(".mainheader nav ul \n");
      out.write("{\n");
      out.write("\n");
      out.write("margin:0 auto;\n");
      out.write("}\n");
      out.write(".mainheader nav ul li\n");
      out.write("{\n");
      out.write("display:inline;\n");
      out.write("}\n");
      out.write(".mainheader nav a:link,.mainheader nav a:visited\n");
      out.write("{\n");
      out.write("color:#FFF;\n");
      out.write("display:inline-block;\n");
      out.write("padding-top:  10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".mainheader nav ul li a\n");
      out.write("{\n");
      out.write("padding-top:10px;\n");
      out.write("margin-left:40px;\n");
      out.write("}\n");
      out.write(".mainheader nav a:hover,.mainheader nav a:active,\n");
      out.write(".mainheader nav .active a:link,.mainheader nav .active a:visited\n");
      out.write("{\n");
      out.write("background-color:#CF5C3F;\n");
      out.write("width:75px;\n");
      out.write("height:30px;\n");
      out.write("padding-left:30px;\n");
      out.write("border-radius:5px;\n");
      out.write("}\n");
      out.write("/*.mainheader nav ul li a\n");
      out.write("{\n");
      out.write("//border-radius:5px;\n");
      out.write("}\n");
      out.write(".maincontent\n");
      out.write("{\n");
      out.write("line-height:25px;\n");
      out.write("border-radius:5px;\n");
      out.write("\n");
      out.write("}*/\n");
      out.write("#link\n");
      out.write("{\n");
      out.write("height: 90%;\n");
      out.write("background-color:white;\n");
      out.write("border-radius:5px;\n");
      out.write("width:20%;\n");
      out.write("float:left;\n");
      out.write("margin-right:15px;\n");
      out.write("margin-top:5px;\n");
      out.write("}\n");
      out.write("#link img{\n");
      out.write("    width:120%;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    height:100%;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".content\n");
      out.write("{\n");
      out.write("width:50%;\n");
      out.write("float:left;\n");
      out.write("}\n");
      out.write(".topcontent\n");
      out.write("{\n");
      out.write("\n");
      out.write("border-radius:5px;\n");
      out.write("background-color:white;\n");
      out.write("margin:10px 0px;\n");
      out.write("height:250px;\n");
      out.write("padding:20px;\n");
      out.write("}\n");
      out.write(".bottomcontent\n");
      out.write("{\n");
      out.write("\n");
      out.write("border-radius:5px;\n");
      out.write("background-color:white;\n");
      out.write("margin:15px 0px;\n");
      out.write("height:250px;\n");
      out.write("padding:17px;\n");
      out.write("}\n");
      out.write(".post-info\n");
      out.write("{\n");
      out.write("font-style:italic;\n");
      out.write("color:#999;\n");
      out.write("font-size:83%;\n");
      out.write("}\n");
      out.write(".top-sidebar\n");
      out.write("{\n");
      out.write("float:left;\n");
      out.write("background-color:white;\n");
      out.write("border-radius:5px;\n");
      out.write("padding:20px;\n");
      out.write("margin-left: 5px ;\n");
      out.write("margin-top:10px;\n");
      out.write("margin-bottom:3px;\n");
      out.write("width:22%;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write(".middle-sidebar\n");
      out.write("{\n");
      out.write("float:left;\n");
      out.write("background-color:white;\n");
      out.write("border-radius:5px;\n");
      out.write("padding:25px;\n");
      out.write("margin-left: 5px ;\n");
      out.write("margin-top:10px;\n");
      out.write("margin-bottom:3px;\n");
      out.write("width:22%;\n");
      out.write("//height: 233px;\n");
      out.write("height:260px;\n");
      out.write("}\n");
      out.write(".mainfooter\n");
      out.write("{\n");
      out.write("width:100%;\n");
      out.write("float:left;\n");
      out.write("border-radius:5px;\n");
      out.write("background-color:#666;\n");
      out.write("padding:5px;\n");
      out.write("color:white;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#sub p\n");
      out.write("{\n");
      out.write("float:right;\n");
      out.write("margin-top:2px;\n");
      out.write("}\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("color:#CF5C3F;\n");
      out.write("background-color:white;\n");
      out.write("border-radius:5px;\n");
      out.write("height:50px;\n");
      out.write("}\n");
      out.write("h1:hover\n");
      out.write("{\n");
      out.write("color:gray;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body  background=\"Images/gray.png\" class=\"body\">\n");
      out.write(" <div class=\"mainheader\">\n");
      out.write(" <img src=\"Images/math.png\" height=\"30%\" width=\"30%\"> \n");
      out.write("<div id=\"head\">\n");
      out.write("<b>Mathematical Solution</b>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("<ul>\n");
      out.write("<li class=\"active\"><a href=\"#.jsp\" >Home</a></li>\n");
      out.write("<li><a href=\"#\">About</a></li>\n");
      out.write("<li><a href=\"#\">Portfolio</a></li>\n");
      out.write("<li><a href=\"#\">Contact</a></li>\n");
      out.write("<li><a href=\"LogIn.jsp\">Login</a>\n");
      out.write("<li><a href=\"signin.jsp\">Sign up</a>\n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("<font color=\"white\">\n");
      out.write("<h1 align=\"center\">Tutorials Point</h1>\n");
      out.write("</font>\n");
      out.write("<div id=\"link\">\n");
      out.write("    <marquee behavior=\"scroll\" scrollamount=\"5\" direction=\"up\">\n");
      out.write("        <img src=\"Images/images6.jpg\" height=\"100%\" >\n");
      out.write("       <img src=\"Images/book4.jpg\" height=\"100%\"> \n");
      out.write("       <img src=\"Images/book5.jpg\"height=\"100%\">\n");
      out.write("     </marquee>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"maincontent\">\n");
      out.write(" <div class=\"content\">\n");
      out.write("  <article class=\"topcontent\">\n");
      out.write("   <h2><a href=\"#\" title=\"firstquestion\">Goals</a></h2>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <p>Mathematical solution project goal is to make all systematic knowledge immediately computable and accessible to everyone.  </p>\n");
      out.write("  <p>We aim to collect and accurate all objective data and  implement every known model, method, and algorithm; and make it possible\n");
      out.write("    to compute whatever can be computed about anything. \n");
      out.write("  </p>\n");
      out.write(" \n");
      out.write("  </article>\n");
      out.write("  \n");
      out.write("  <article class=\"bottomcontent\">\n");
      out.write("   \n");
      out.write("  <p>\n");
      out.write(" Our goal is to accept completely free-form input from the user , and to \n");
      out.write("serve as a knowledge engine that generates powerful results and presents\n");
      out.write(" them with maximum clarity. \n");
      out.write("  </p>\n");
      out.write("  <p>Mathematical solution is an ambitious, long-term intellectual \n");
      out.write("      endeavor project that we intend will deliver increasing capabilities over the years and decades to come. \n");
      out.write("  \n");
      out.write("  </p>\n");
      out.write("  </article>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("<aside class=\"top-sidebar\">\n");
      out.write(" <article>\n");
      out.write("\n");
      out.write(" <p class=\"mainheader1\">\n");
      out.write("      <img src=\"Images/symbol.jpg\" height=\"48%\" width=\"137%\">\n");
      out.write("  \n");
      out.write(" </p>\n");
      out.write(" </article>\n");
      out.write("</aside>\n");
      out.write("<aside class=\"middle-sidebar\">\n");
      out.write(" <article><p>Mathematical solution is designed to answer the user search queries by returning a single result. Methodology introduces a fundamentally new way to get knowledge \n");
      out.write(" and answers??not by searching the web, but by doing dynamic computations based on a vast \n");
      out.write("collection of built-in data, algorithms, and methods.   \n");
      out.write(" </p>\n");
      out.write("</article>\n");
      out.write("</aside>\n");
      out.write("\n");
      out.write("<footer class=\"mainfooter\">\n");
      out.write("<p>\n");
      out.write("<div id=\"sub\">\n");
      out.write("<b>submitted To:<a href=\"#\"><i>Poonam Mangwani</i></a>\n");
      out.write("<p><b>submitted By:<a href=\"#\"><i> sapna ,vidhya,abhilasha</i></a></b><br></p>\n");
      out.write("</div>\n");
      out.write("</p>\n");
      out.write("</footer>\n");
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