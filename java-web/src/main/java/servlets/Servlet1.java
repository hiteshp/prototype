package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        out.println("Welcome to Maven Web Project from Servlet1!");

        }
}