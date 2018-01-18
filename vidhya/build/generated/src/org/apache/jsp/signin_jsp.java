package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import newpackage.clsmath;
import java.sql.ResultSet;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

clsmath obj1=new clsmath();

if(request.getQueryString()!=null)
{
if(Integer.parseInt(request.getParameter("PKID"))>0);
{
obj1.userid=Integer.parseInt(request.getParameter("PKID"));
obj1.singleselect();
}
}

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> SIGN UP </title>\n");
      out.write("        <script>\n");
      out.write("    \n");
      out.write("      function validate()\n");
      out.write("{\n");
      out.write("\n");
      out.write("\n");
      out.write("var cn= document.form1.txtphno.value.length ;\n");
      out.write("    \n");
      out.write("if(cn < 10)\n");
      out.write("{\n");
      out.write("     alert(\"Enter Valid Contact Info.\");\n");
      out.write("        return false;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("var c1=document.forms[\"form1\"][\"txtpass\"].value;\n");
      out.write("var c2=document.forms[\"form1\"][\"txtreen\"].value;\n");
      out.write("if(c1!==c2)\n");
      out.write("{\n");
      out.write("    alert(\"password does not match please enter correct password\");\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("               \n");
      out.write("    var x = document.forms[\"form1\"][\"txtemail\"].value;\n");
      out.write("    var a = x.indexOf(\"@\");\n");
      out.write("    var d = x.lastIndexOf(\".\");\n");
      out.write("  \n");
      out.write("   if ( a<1 || d<a+2 || d+2>=x.length)\n");
      out.write("   {\n");
      out.write("        alert(\"Not a valid e-mail address\");\n");
      out.write("        return false;\n");
      out.write("             \n");
      out.write("   }\n");
      out.write("            else\n");
      out.write("          {\n");
      out.write("                     }\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write(" </script>\n");
      out.write(" </head>\n");
      out.write(" <style>\n");
      out.write("     body{          \n");
      out.write("          background-image:url(\"Images/book1.jpg\");\n");
      out.write("          opacity:50%;\n");
      out.write("         }\n");
      out.write("    #tab\n");
      out.write("    {\n");
      out.write("    border: 3px solid white;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    width: 30%;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("     <body text=\"white\" >\n");
      out.write("    \n");
      out.write("     <center>\n");
      out.write("         <img src=\"Images/admin.jpg\" >\n");
      out.write("           <form name=\"form1\" action=\"saveuser.jsp\" method=\"post\" onsubmit=\"return validate();\" > \n");
      out.write("         <h1>CREATE ACCOUNT    </h1>\n");
      out.write("         \n");
      out.write("    <div id=\"tab\"> <table> \n");
      out.write("         \n");
      out.write("             <tr><td></td></tr>\n");
      out.write("              <tr><td></td></tr>\n");
      out.write("       \n");
      out.write("       <tr>\n");
      out.write("           <td> \n");
      out.write("               <h3>Student name:</h3>\n");
      out.write("           </td> \n");
      out.write("           <td>\n");
      out.write("               <input type=\"text\" name=\"txtname\" value=\"");
      out.print(obj1.username);
      out.write("\" /> \n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("       \n");
      out.write("       <tr><td></td></tr>\n");
      out.write("       <tr><td></td></tr>\n");
      out.write("       <tr>\n");
      out.write("           <td> \n");
      out.write("               <h3>Mobile Number:</h3>\n");
      out.write("           </td>\n");
      out.write("           <td>\n");
      out.write("               <input type=\"text\" name=\"txtphno\" value=\"");
      out.print(obj1.mobileno);
      out.write("\" />\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("        <tr><td></td></tr>\n");
      out.write("       <tr><td></td></tr>\n");
      out.write("       <tr> <td>\n");
      out.write("               <h3>Email Id:</h3>\n");
      out.write("         </td>\n");
      out.write("       <td>\n");
      out.write("           <input type=\"text\" name=\"txtemail\" value=\"");
      out.print(obj1.email);
      out.write("\"/>\n");
      out.write("       </td>\n");
      out.write("       </tr>\n");
      out.write("        <tr><td></td></tr>\n");
      out.write("       <tr><td></td></tr>\n");
      out.write("      <tr><td>\n");
      out.write("              <h3>Qualification:</h3></td>\n");
      out.write("          <td><input type=\"text\" name=\"txtadd\" value=\"");
      out.print(obj1.address);
      out.write("\"/></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr><td></td></tr>\n");
      out.write("       <tr><td></td></tr>\n");
      out.write("      <tr><td>\n");
      out.write("              <h3>Password: </h3></td>\n");
      out.write("          <td><input type=\"password\" name=\"txtpass\" value=\"");
      out.print(obj1.password);
      out.write("\"/></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr><td></td></tr>\n");
      out.write("       <tr><td></td></tr>\n");
      out.write("      <tr><td>\n");
      out.write("              <h3>Re-Enter:</h3></td>\n");
      out.write("          <td><input type=\"password\" name=\"txtreen\" /></td>\n");
      out.write("      </tr>\n");
      out.write("     </table>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("         ");
if(request.getParameter("PKID")!=null)
{
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("   <input  type=\"submit\" value=\"signin\" name=\"action\"/>    \n");
      out.write("    <input type=\"submit\" value=\"delete\" name=\"action\"/>");
}
  else{
      out.write("\n");
      out.write("        <input type=\"submit\" style=\"width:70px\" style=\"height:50px\" value=\"save\" name=\"action\"/> \n");
      out.write("        ");
}
      out.write("\n");
      out.write("         <input type=\"submit\" value=\"show\" style=\"width:70px\" style=\"height:50px\" name=\"action\"/>\n");
      out.write("         <a href=\"LogIn.jsp\">Already Have Account</a>\n");
      out.write("   </form>\n");
      out.write("     </center>\n");
      out.write("    </body>\n");
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
