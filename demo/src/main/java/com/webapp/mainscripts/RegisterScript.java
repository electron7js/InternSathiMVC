/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.mainscripts;

import static com.webapp.conf.AllCRUD.loginMethod;
import static com.webapp.conf.AllCRUD.registerMethod;
import com.webapp.model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bijesh
 */
public class RegisterScript extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd=request.getRequestDispatcher("MainSites/registerform.jsp");
        rd.forward(request, response);
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String confirm=request.getParameter("confirm");
       
       if(password.equals(confirm)){
        UserModel user=new UserModel(username,password);
         
   
        if(registerMethod(user)){
       response.sendRedirect("/WebApp/posts");
              }
       else{
         out.print("<script>alert(\"Account already exists\")</script>");}
       }
       else{
          out.print("<script>alert(\"Passwords do not match\")</script>");
              }

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
