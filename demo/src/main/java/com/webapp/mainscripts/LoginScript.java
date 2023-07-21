/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.mainscripts;

import static com.webapp.conf.AllCRUD.loginMethod;
import com.webapp.model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bijesh
 */
public class LoginScript extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           HttpSession session = request.getSession();
           session.invalidate();
        RequestDispatcher rd = request.getRequestDispatcher("MainSites/loginform.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserModel user = new UserModel(username, password);

        if (username.equalsIgnoreCase("admin") && password.equals("admin")) {

         
            session.setAttribute("user", username);
            session.setAttribute("password", password);
            response.sendRedirect("home");
        } else if (loginMethod(user)) {
           
            session.setAttribute("user", username);
            session.setAttribute("password", password);
            response.sendRedirect("posts");
        } else {
            response.sendRedirect("index");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
