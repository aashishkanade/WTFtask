package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public final class user_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("    \n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Crib</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://bsdp-assets.blackcherry.us/1.3.0/datepicker.min.css\">\n");
      out.write("\t<!-- BootstrapValidator CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/bootstrapValidator.min.css\"/>\n");
      out.write("    \n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t\t.datepicker{z-index:1151 !important;}\n");
      out.write("\t\t\n");
      out.write("\t\t.btn-primary  {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tbackground-color:#336699;\n");
      out.write("\t\t\tborder-color:#336699;\n");
      out.write("\t\n");
      out.write("\t\t}\n");
      out.write("\t\t#break-inverse {display:none;}\n");
      out.write("\t\t\n");
      out.write("\t\t@media (max-width: 480px) { \n");
      out.write("\t\t\t#break-inverse {display:initial;}\n");
      out.write("\t\t\t#break { display:none;}\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\tbody {\n");
      out.write("\t\t  background: -webkit-gradient(#888888,white); /* Chrome,Safari4+ */\n");
      out.write("\t\t  background: -webkit-linear-gradient(#888888,white); /* Chrome10+,Safari5.1+ */\n");
      out.write("\t\t background-repeat: no-repeat;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\thtml {height:100%}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        ::-webkit-scrollbar { \n");
      out.write("                    display: none; \n");
      out.write("                }\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("    \n");
      out.write("\t\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <div class=\"col-md-2\"></div>\n");
      out.write("  <div class=\"col-md-8 col-xs-12\" style='padding: 0'>\n");
      out.write("\t<div style =\"height:100vh;background-color: white;padding: 2em\">\n");
      out.write("\t\n");
      out.write("\t\t<nav class=\"navbar navbar-default\" role=\"navigation\" style=\"border:hidden ;background-color:#7F7F7F;width: 100%;margin: -1\">\n");
      out.write("\t\t  <div class=\"container-fluid\">\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\" style=\"background-color:white;\"></span>\n");
      out.write("\t\t\t  </button>\n");
      out.write("\n");
      out.write("\t\t\t  <div class=\"navbar-brand\" style=\"padding-top:0px;\"><img  src=\"img/logo_nav.jpg\" style=\"height:140%;width50%;\"/></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\" >\n");
      out.write("\t\t\t\t\t\t<li id=\"group\"><a id=\"showaddtaskmodal\" href=\"#addtaskmodal\" class=\"btn-group-sm\" data-toggle=\"modal\"  style=\"color:white\">Add a Task</a></li>\n");
      out.write("\t\t\t\t\t\t<li id=\"friend\"><a id=\"showaddfriendmodal\" href=\"#addfriendmodal\" class=\"btn-group-sm\" data-toggle=\"modal\" style=\"color:white\">Add a Friend</a></li>\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"task_login.jsp\" class=\"btn-group-sm\" style=\"color:white\">Log Out</a></li>\n");
      out.write("\t\t\t\t\t</ul> \n");
      out.write("\t\t\t</div><!-- /.navbar-collapse -->\n");
      out.write("\t\t  </div><!-- /.container-fluid -->\n");
      out.write("\t\t</nav>\n");
      out.write("      <h1>Welcome ");
      out.print(request.getAttribute("Name"));
      out.write("</h1><br>\n");
      out.write("      \n");
      out.write("      <div class=\"col-md-2\"></div>\n");
      out.write("\t<div class=\"col-md-8\">\n");
      out.write("\t<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\" style=\"height:50vh\">\n");
      out.write("\t  <!-- Indicators -->\n");
      out.write("\t  <ul style=\"display:none\">\n");
      out.write("\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"></li>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t  </ul>\n");
      out.write("\n");
      out.write("\t  <!-- Wrapper for slides -->\n");
      out.write("\t  <div class=\"carousel-inner\" >\n");
      out.write("              ");

            //out.println("<button type = 'button 'class = 'btn btn-primary'>Add</button>");
            request.setAttribute("Name", request.getAttribute("Name"));
          //String user ="vinaraja"; 
          String user = (String)request.getAttribute("username");
          String sql,sql3;
          String connectionURL="jdbc:derby://localhost:1527/WTFtask";
            sql3 ="SELECT TASKID FROM WTFtaskallocation where USERNAME = '"+user+"'";
            
          
          try {
              Connection conn = DriverManager.getConnection(connectionURL, "IS2560","IS2560");
              Statement s = conn.createStatement();
              Statement s1 = conn.createStatement();
              Statement s2 = conn.createStatement();
              ResultSet rs2 = s2.executeQuery(sql3);
              int count = 0;
              
              while(rs2.next()){
                  sql = "SELECT * FROM WTFtasks where TASKID ="+rs2.getInt("TASKID");
                  ResultSet rs = s.executeQuery(sql);
              while (rs.next()) {
                  String sql2 ="SELECT FIRSTNAME,LASTNAME FROM WTFuser WHERE USERNAME='"+rs.getString("OWNER")+"'";                       
                  ResultSet rs1 = s1.executeQuery(sql2);
                        rs1.next();
                        if(count==0)
                        {    
                        out.println("<div class='item active' style = 'padding-top:13%'>");
                        }
                        else
                        {
                           out.println("<div class='item' style = 'padding-top:13%'>"); 
                        }
                        out.println("<div class='col-md-3'></div>");
                        out.println("<div class='col-sm-6 col-md-6' align = 'center'>");
                        out.println("<div class='thumbnail'>");
                        out.println("<div class='caption'>");
                        out.println("<h3>"+rs.getString("TASKNAME")+"</h3>");
                        out.println("<p>POINTS: "+rs.getString("TASKPOINTS")+"<br>OWNER: "+rs1.getString("FIRSTNAME")+" "+rs1.getString("LASTNAME")+"<br>DUE-DATE: "+rs.getString("DUEDATE")+"</p>");
                 
                        out.println("<p><a href='#' class='btn btn-primary' role='button'>Wrap Up</a></p>");
                        out.println("</div></div></div></div>");
                        count++;
                        
                        /*out.println("<TR>");
                        out.println("<TD>" + rs.getString("TASKNAME") + "</TD>");
                        out.println("<TD>" + rs.getString("TASKPOINTS") + "</TD>");
                        out.println("<TD>" + rs1.getString("FIRSTNAME")+" "+rs1.getString("LASTNAME") + "</TD>");
                        out.println("<TD>" + rs.getString("DUEDATE") + "</TD>");
                        out.println("</TR>");*/
                        rs1.close();
              }
              rs.close();
              }
              
              s.close();
              s1.close();
              s2.close();
              conn.close();
          }
          catch (SQLException e) {
          }
       catch (Exception e) {
       }
    
     
      out.write("\n");
      out.write("\t  </div>\n");
      out.write("\n");
      out.write("\t  <!-- Controls -->\n");
      out.write("\t  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("\t  </a>\n");
      out.write("\t  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("\t  </a>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("      \n");
      out.write("        </div> \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-2\"></div>\n");
      out.write("\n");
      out.write("\t<div id=\"addfriendmodal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\" style=\"border-radius:20px;\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button><br><br>\n");
      out.write("\t\t\t\t\t<h3 class=\"modal-title\" align=\"center\">Add a Friend</h4></br>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("                                        <form id =\"searchForm\" class=\"form-inline\" align=\"center\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10 col-xs-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"searchname\" id=\"searchname\" class=\"form-control input-md\" Placeholder=\"Search...\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                     \n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 col-xs-1\" style=\"padding-top:2px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"SearchButton\" type=\"button\">Add </button> \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t</div><br><br>\n");
      out.write("                                                 \n");
      out.write("                                                 <div id=\"searchUpdate\"></div>\n");
      out.write("\t\t\t\t\t\t<a align=\"center\" id=\"Invite\" href=\"#\" >Can't find your friend? Invite them!</a>  \n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<form id=\"inviteForm\" class=\"form-inline\" align=\"center\" method=\"get\" action = \"Add_Friend\" >\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"firstname\" Placeholder=\"First name\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"lastname\" Placeholder=\"Last name\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" Placeholder=\"Email address\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                            <input type=\"hidden\" class=\"form-control input-md\" name = \"user\" value=\"");
      out.print(request.getAttribute("Name"));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<button id=\"login\" href=\"#\" class=\"btn btn-primary\" align=\"center\">Invite</button>\n");
      out.write("\t\t\t\t\t\t</div><br>\n");
      out.write("\t\t\t\t\t</form>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"addtaskmodal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel1\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button><br><br>\n");
      out.write("\t\t\t\t\t\t<h3 class=\"modal-title\" align=\"center\">Add a task</h4></br>\n");
      out.write("\t\t\t\t\t\t<form id=\"addtaskForm\" class=\"form-inline\" align=\"center\" method=\"get\" action=\"Add_Task\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"taskname\" Placeholder=\"Task name\" />\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        </div><br>\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Points\" name=\"taskpoints\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        </div><br>\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\"  name=\"user\" value = \"");
      out.print(request.getAttribute("username"));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        </div><br>\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"form-control\"  name=\"Name\" value = \"");
      out.print(request.getAttribute("Name"));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        </div><br>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                                    <div class=\"col-lg-12 col-xs-12\">\n");
      out.write("                                                                        <div class=\"input-group date\" >\n");
      out.write("                                                                            <input type=\"text\" class=\"form-control\"  id=\"duedate\" name=\"duedate\" Placeholder=\"Due date\" />\n");
      out.write("                                                                            <span class=\"input-group-addon\">\n");
      out.write("                                                                                <span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("                                                                            </span>\n");
      out.write("                                                                        </div>  \n");
      out.write("                                                                    </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-9 col-xs-9\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" Placeholder=\"Add friends...\" id=\"addedfriend\" name=\"addedfriend\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button id=\"add\" type=\"button\" class=\"btn btn-success\" onclick=\"showFriend()\"> Add</button>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"break\">\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"break-inverse\">\n");
      out.write("\t\t\t\t\t\t\t\t<br><br>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"content\"></div><br>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                            <button class=\"btn btn-primary\">Add task</button><br><br>\n");
      out.write("\t\t\t\t\t\t\t</div><br>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                                                              \n");
      out.write("     \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"http://bsdp-assets.blackcherry.us/1.3.0/bootstrap-datepicker.min.js\"></script>\n");
      out.write("\t\t<!-- BootstrapValidator JS -->\n");
      out.write("    <script type=\"text/javascript\" src=\"dist/js/bootstrapValidator.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("\ti = 0;\n");
      out.write("\t\n");
      out.write("\t $(function () {\n");
      out.write("                $(\"#duedate\").datepicker();\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("\t$(\"#SearchButton\").click(function(){\n");
      out.write("           // alert(\"button\");\n");
      out.write("           $.get('Search',$(\"#searchname\"),function(ResponseText){  \n");
      out.write("              if(ResponseText===\"true\") \n");
      out.write("              {\n");
      out.write("                   $(\"#searchUpdate\").text(\"User Found\");\n");
      out.write("              }\n");
      out.write("              else\n");
      out.write("              {\n");
      out.write("                  $(\"#searchUpdate\").text(\"User not Found\");\n");
      out.write("              }\n");
      out.write("           });\n");
      out.write("        });\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("              \n");
      out.write("\t\n");
      out.write("\tfunction showFriend() {\n");
      out.write("\t\ti = i + 1;\n");
      out.write("\t\tvar name = document.getElementById(\"addedfriend\").value;\n");
      out.write("\t\tstring = \"<div id='here\"+i+\"' onClick='removeFriend(this)' ><input type='text' style='border:none' name='list'  value='\"+name+\"' />\"+\"&nbsp;<span class='glyphicon glyphicon-remove' style='color:blue;'></span><br></div>\";\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t$(\"#content\").append(string);\n");
      out.write("\t\t$(\"#addedfriend\").val('');\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction removeFriend(item) {\n");
      out.write("\t\t$(item).remove();\n");
      out.write("\t}\t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t$(\"#inviteForm\").hide();\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("        $(\"#showaddtaskmodal\").click(function(){\n");
      out.write("\t\t\n");
      out.write("                document.forms[\"addtaskForm\"].reset();\n");
      out.write("\t});\n");
      out.write("        \n");
      out.write("        $(\"#showaddfriendmodal\").click(function(){\n");
      out.write("\n");
      out.write("\t\t$(\"#searchForm\").show();\n");
      out.write("\t\t$(\"#inviteForm\").hide();\n");
      out.write("                document.forms[\"searchForm\"].reset();\n");
      out.write("                document.forms[\"inviteForm\"].reset();\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("        $(\"#Invite\").click(function(){\n");
      out.write("\t\t$(\"#searchForm\").hide();\n");
      out.write("\t\t$(\"#inviteForm\").show();\n");
      out.write("                document.forms[\"searchForm\"].reset();\n");
      out.write("                document.forms[\"inviteForm\"].reset();\n");
      out.write("\t});\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
}
