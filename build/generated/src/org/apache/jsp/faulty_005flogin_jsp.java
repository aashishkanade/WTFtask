package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faulty_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Welcome to crib!</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\t  \r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t@media (max-width: 480px) { \r\n");
      out.write("\r\n");
      out.write("\t\t\t.win {\r\n");
      out.write("\t\t\t\tpadding:2em;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\thtml {height:100%;}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#break \r\n");
      out.write("\t\t\t{display:none;}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tbackground-repeat:no-repeat;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.win {\r\n");
      out.write("\t\t\tbackground-color:white;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tborder-radius:20px;\r\n");
      out.write("\t\t\tborder:2px solid;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */\r\n");
      out.write("\t\t  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */\r\n");
      out.write("\t\t  background-repeat:no-repeat;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\thtml {height:100%;padding-top:5%;padding-bottom:10%;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t::-webkit-scrollbar { \r\n");
      out.write("                    display: none; \r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"win\" id=\"log\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/logo.jpg\" style=\"height:20%;\"/><br><br>\r\n");
      out.write("                                                <form role=\"form\" class=\"form-inline\" method=\"get\" action=\"Login\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Username\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn btn-primary\">Login</button><br><br>\r\n");
      out.write("                                                  <font color = \"red\">Username or Password is not correct</font><br><br>\r\n");
      out.write("\t\t\t\t\t\t <a  class=\"formNotice\" href=\"#\" role=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\tNeed an account? Sign up!\r\n");
      out.write("\t\t\t\t\t\t </a>\r\n");
      out.write("                                                  \r\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"win\" id=\"reg\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/logo.jpg\" style=\"height:20%;\"/><br><br>\r\n");
      out.write("\t\t\t\t\t\t<form role=\"form\" class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"fname\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"First Name\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"lname\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Last Name\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Email address\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Username\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"cpassword\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Confirm Password\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn btn-primary\">Sign up</button><br><br>\r\n");
      out.write("\t\t\t\t\t\t  <a  class=\"formNotice\" href=\"#\" role=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\tHave an account? Login!\r\n");
      out.write("\t\t\t\t\t\t  </a>\r\n");
      out.write("\t\t\t\t\t\t  <div id=\"break\">\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t$('#reg').hide();\r\n");
      out.write("\t\t\t\t\t$('.formNotice').click(function() {\r\n");
      out.write("\t\t\t\t\t\t$(\"#log\").toggle();\r\n");
      out.write("\t\t\t\t\t\t$(\"#reg\").toggle();\r\n");
      out.write("\t\t\t\t\t});\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
