package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public final class task_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/bootstrapValidator.min.css\"/>\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.win {\r\n");
      out.write("\t\t\tbackground-color:white;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tborder-radius:20px;\r\n");
      out.write("\t\t\tborder:2px solid;\r\n");
      out.write("                        padding:0.5em;\r\n");
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
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-md-4\"></div>\r\n");
      out.write("    <div class=\"col-md-4\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- Alert message for incorrect login details-->\r\n");
      out.write("        ");
 if ((String)request.getAttribute("logon")=="fail")
        {
            out.println("<div class='alert alert-danger alert-dismissible' role='alert'>");
            out.println("<button type='button' class='close' data-dismiss='alert'><span aria-hidden='true'>&times;</span><span class='sr-only'>Close</span></button>");
            out.println("<strong>The entered username or password is incorrect</strong>");
            out.println("</div>");
        }
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--Login from starts here -->\r\n");
      out.write("        <div class=\"win\" id=\"log\">\r\n");
      out.write("            <img src=\"img/logo.jpg\" style=\"height:20%;\"/><br><br>\r\n");
      out.write("            <form role=\"form\" id=\"login_form\" class=\"form-inline\" method=\"get\" action=\"Login\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"lusername\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Username\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" name=\"lpassword\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"message\"></div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Login</button><br><br>\r\n");
      out.write("                <a class=\"formNotice\" href=\"#\" role=\"button\">Need an account? Sign up!</a>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Login form-->\r\n");
      out.write("\r\n");
      out.write("        <!--Registration from starts here -->\r\n");
      out.write("        <div class=\"win\" id=\"reg\">\r\n");
      out.write("            <img src=\"img/logo.jpg\" style=\"height:20%;\"/><br><br>\r\n");
      out.write("            <form role=\"form\" class=\"form-inline\" method=\"get\" action=\"Registration\" id=\"reg_form\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"fname\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"First Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"lname\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Last Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"email\" name=\"remail\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Email address\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"username\" name=\"rusername\" class=\"form-control\" id=\"exampleInputEmail2\" placeholder=\"Username\" novalidate>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" name=\"rpassword\" class=\"form-control\" id=\"exampleInputPassword2\" placeholder=\"Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" name=\"cpassword\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Confirm Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"message1\"></div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Sign up</button><br><br>\r\n");
      out.write("                <a  class=\"formNotice\" href=\"#\" role=\"button\">Have an account? Login!</a>\r\n");
      out.write("                <div id=\"break\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End registration form-->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Validator JS-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"dist/js/bootstrapValidator.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            //Forms hide/show toggle code\r\n");
      out.write("            $('#reg').hide();\r\n");
      out.write("            $('.formNotice').click(function() {\r\n");
      out.write("                    $(\"#log\").toggle();\r\n");
      out.write("                    $(\"#reg\").toggle();\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            //Bootstrap validator code for login form\r\n");
      out.write("            $('#login_form').bootstrapValidator({\r\n");
      out.write("                container:'#message',\r\n");
      out.write("                feedbackIcons: {\t\t\r\n");
      out.write("                valid: 'glyphicon glyphicon-ok',\r\n");
      out.write("                invalid: 'glyphicon glyphicon-remove',\r\n");
      out.write("                validating: 'glyphicon glyphicon-refresh'\r\n");
      out.write("                },\r\n");
      out.write("                fields: {\r\n");
      out.write("                    lusername: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                            notEmpty: {\r\n");
      out.write("                                message: 'Username is required'\r\n");
      out.write("                            },\r\n");
      out.write("                            regexp: {\r\n");
      out.write("                                regexp: /^[a-zA-Z0-9]+$/,\r\n");
      out.write("                                message: 'Alphabets only'\r\n");
      out.write("                            },\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                    lpassword: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                                notEmpty: {\r\n");
      out.write("                                    message: 'Password is required'\r\n");
      out.write("                                },\r\n");
      out.write("                                regexp: {\r\n");
      out.write("                                    regexp: /^[a-zA-Z0-9]+$/,\r\n");
      out.write("                                    message: 'Alphanumeric only'\r\n");
      out.write("                                },\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            //Bootstrap validator code for registration form\r\n");
      out.write("            $('#reg_form').bootstrapValidator({\r\n");
      out.write("                container:'#message1',\r\n");
      out.write("                feedbackIcons: {\t\t\r\n");
      out.write("                valid: 'glyphicon glyphicon-ok',\r\n");
      out.write("                invalid: 'glyphicon glyphicon-remove',\r\n");
      out.write("                validating: 'glyphicon glyphicon-refresh'\r\n");
      out.write("                },\r\n");
      out.write("                fields: {\r\n");
      out.write("                    fname: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                                notEmpty: {\r\n");
      out.write("                                    message: 'First name is required'\r\n");
      out.write("                                },\r\n");
      out.write("                                regexp: {\r\n");
      out.write("                                    regexp: /^[a-zA-Z]+$/,\r\n");
      out.write("                                    message: 'Alphabets only'\r\n");
      out.write("                                },\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                    lname: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                                notEmpty: {\r\n");
      out.write("                                    message: 'Last name is required'\r\n");
      out.write("                                },\r\n");
      out.write("                                regexp: {\r\n");
      out.write("                                    regexp: /^[a-zA-Z]+$/,\r\n");
      out.write("                                    message: 'Alphabets only'\r\n");
      out.write("                                },\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                    rusername: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                                notEmpty: {\r\n");
      out.write("                                    message: 'Username is required'\r\n");
      out.write("                                },\r\n");
      out.write("                                regexp: {\r\n");
      out.write("                                    regexp: /^[a-zA-Z0-9]+$/,\r\n");
      out.write("                                    message: 'Alphabets only'\r\n");
      out.write("                                },\r\n");
      out.write("                                remote: {\r\n");
      out.write("\r\n");
      out.write("                                    message: 'The username is not available',\r\n");
      out.write("                                    url: 'Check_Username',\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        type: 'username'\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                    remail: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("\r\n");
      out.write("                                    notEmpty: {\r\n");
      out.write("                                            message: 'Email is required'\r\n");
      out.write("                                    },\r\n");
      out.write("                                    regexp: {\r\n");
      out.write("                                            regexp: /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/,\r\n");
      out.write("                                            message: 'Email is invalid'\r\n");
      out.write("                                    },\r\n");
      out.write("                                    remote: {\r\n");
      out.write("                                    message: 'The email is already being used',\r\n");
      out.write("                                    url: 'Check_Email',\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        type: 'email'\r\n");
      out.write("                                    }\r\n");
      out.write("                            }\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                    rpassword: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                                notEmpty: {\r\n");
      out.write("                                    message: 'Password is required'\r\n");
      out.write("                                },\r\n");
      out.write("                                regexp: {\r\n");
      out.write("                                    regexp: /^[a-zA-Z0-9]+$/,\r\n");
      out.write("                                    message: 'Alphanumeric only'\r\n");
      out.write("                                },\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                    cpassword: {\r\n");
      out.write("                            validators: {\r\n");
      out.write("                                notEmpty: {\r\n");
      out.write("                                    message: 'Retype Password for confirmation'\r\n");
      out.write("                                },\r\n");
      out.write("                                regexp: {\r\n");
      out.write("                                    regexp: /^[a-zA-Z0-9]+$/,\r\n");
      out.write("                                    message: 'Alphanumeric only'\r\n");
      out.write("                                },\r\n");
      out.write("                                identical: {\r\n");
      out.write("                                    field: 'rpassword',\r\n");
      out.write("                                    message: 'Retype password for confirmation'\r\n");
      out.write("                                },\r\n");
      out.write("                            }\r\n");
      out.write("                    },\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
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
