/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.58
 * Generated at: 2020-10-20 02:29:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Deletecustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Patient Delete</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"headerfooter.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--header-->\r\n");
      out.write(" \r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<a href=\"index.html\">\r\n");
      out.write("\t<img class=\"logo\"  src=\"images/carelogo.png\" alt=\"Serendib Hospitals\" height=\"80\"  width =\"80\">\r\n");
      out.write("\t</a>\r\n");
      out.write("\t<div class=\"navigation\">\r\n");
      out.write("\t\t<a href=\"#contact\">ACCOUNT</a>\r\n");
      out.write("\t\t<a href=\"#about\">ABOUT US</a>\r\n");
      out.write("\t\t<a href=\"#about\">CONTACT US</a>\r\n");
      out.write("\t\t<a href=\"#about\">LOGIN</a>\r\n");
      out.write("\t\t<a href=\"#about\">REGISTER</a>\r\n");
      out.write("\t\t<a href=\"index.html\">HOME</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2 class=\"title\"><a href='index.html'>CARE <br>&nbsp HOSPITALS </h2> </a>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<!-- end of header--> \r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>Patient Account Delete</h1>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"delete\" method=\"post\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Customer ID</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cusid\" value=\"");
      out.print( id );
      out.write("\" readonly></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Name</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"name\" value=\"");
      out.print( name );
      out.write("\" readonly></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Email</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"email\" value=\"");
      out.print( email );
      out.write("\" readonly></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Phone number</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"phone\" value=\"");
      out.print( phone );
      out.write("\" readonly></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>User name</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"uname\" value=\"");
      out.print( userName );
      out.write("\" readonly></td>\r\n");
      out.write("\t</tr>\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input type=\"submit\" name=\"submit\" value=\"Delete My Account\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class= \"follow\">Follow us on </div>\r\n");
      out.write("\t<div class=\"getthe\">Get the app </div>\r\n");
      out.write("\t<div class=\"copy\">Copyright &copy; Care Hospitals PLC <br> 253f, <br>Udaya Mawatha,<br> Malabe. </div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"socialbuttons\">\r\n");
      out.write("\t\t<a href=\"https://www.facebook.com\"><img src=\"images/fb.png\" alt=\"facebook\" class=\"fb\"></a>\r\n");
      out.write("\t\t<a href=\"https://www.instagram.com\"><img src=\"images/insta.webp\" alt=\"instagram\" class=\"insta\"></a>\r\n");
      out.write("\t\t<a href=\"https://www.twitter.com\"><img src=\"images/twitter.png\" alt=\"twitter\" class=\"twitter\"></a>\r\n");
      out.write("\t\t<a href=\"https://www.play.google.com\"><img src=\"images/android.png\" alt=\"play store\" class=\"android\"></a>\r\n");
      out.write("\t\t<a href=\"https://www.apple.com/ios/app-store/\"><img src=\"images/ios.png\" alt=\"app store\" class=\"ios\" ></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- end of footer -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}