/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
import com.google.gson.Gson;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aashish
 */
@WebServlet(urlPatterns = {"/Check_Email"})
public class Check_Email extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    public boolean JUNIT(boolean flag)
    {
        String email="test@indiana.edu";
        email = email.toLowerCase();
        String connectionURL = "jdbc:derby://localhost:1527/WTFtask";
        Connection conn;
        try {
            conn = DriverManager.getConnection(connectionURL, "IS2560","IS2560");
            String query1 = "SELECT * FROM WTFuser where email = '"+email+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            boolean flag1 = rs.next();
            st.close();
            conn.close();
            if(flag1==false)
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        //Recieve values from form
        String email=request.getParameter("remail").replaceAll(" ","");
        email = email.toLowerCase();
        //Create JSON object to pass back to bootsrap validator
        Map<String, String> options = new LinkedHashMap<String, String>();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String connection,username,password;
        //BufferedReader br = new BufferedReader(new FileReader("/Users/visheshtalreja/Desktop/WTFtask/src/java/config.txt"));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aashish\\Documents\\NetBeansProjects\\WTFtask\\config.txt"));
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vinay\\Documents\\NetBeansProjects\\WTFtask\\WTFtask\\config.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                
            }
            String everything = sb.toString();
            String arg[] = everything.split(" ");
            connection = arg[2];
            username = arg[0];
            password = arg[1];
            
        } finally {
            br.close();
        }
        try (PrintWriter out = response.getWriter()){
        
        try{
            
            Connection conn = DriverManager.getConnection(connection, username,password);
            String query1 = "SELECT * FROM WTFuser where email = '"+email+"'";
            Statement st = conn.createStatement();  //Query the database for availability
            ResultSet rs = st.executeQuery(query1);     //Store the result in a ResultSet
            boolean is = rs.next();  //Check if ResultSet is empty or not
            if(!is) { //The email is unique
                options.put("valid", "true");
                String json = new Gson().toJson(options);
                response.getWriter().write(json);
            }
            else if(is){ //The email already exists
                options.put("valid", "false");
                String json = new Gson().toJson(options);
                response.getWriter().write(json);
            }
            //close resources
            st.close();
            rs.close();
            conn.close();
            
        }
        catch(SQLException ex)
        {
            out.print("Connection Failed!");
        }
        }
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
