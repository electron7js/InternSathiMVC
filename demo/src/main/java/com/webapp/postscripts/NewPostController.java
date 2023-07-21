/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.postscripts;

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
 * @author gl3
 */
public class NewPostController extends HttpServlet {
 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(false);
         if(session.getAttribute("user")!=null){
      RequestDispatcher rd=request.getRequestDispatcher("PostSites/new-post.jsp");
      rd.forward(request, response);}
          else{
         response.sendRedirect("login");}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(false);
        String title=request.getParameter("title");
        String content=request.getParameter("content");
        String author=(String)session.getAttribute("user");
      
       PrintWriter out=response.getWriter();
       
       out.print(title);
        //PostCRUD.newPost(title, content, author,"asd");
      
        //  MultipartRequest m = new MultipartRequest(request, "Z:/LMS");  
      //-  response.sendRedirect("posts");
      
         
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
