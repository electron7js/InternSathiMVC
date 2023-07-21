/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.mainscripts;

import com.webapp.conf.AllCRUD;
import com.webapp.model.UserModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gl3
 */
public class AccountEditScript extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("MainSites/accountedit.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("confirm");
        UserModel user = new UserModel(username, password);
        user.setId(id);
        if (password.equals(cpassword)) {

            if (AllCRUD.updateUser(user)) {
                response.sendRedirect("home");
            } else {
                response.getWriter().print("Error");
            }
        } else {
            response.getWriter().print("Passwords do not match");
        }

    }

}
