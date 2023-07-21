<%-- 
    Document   : registerform
    Created on : Jul 27, 2019, 10:13:45 AM
    Author     : Bijesh
--%>

<%@page import="com.webapp.model.UserModel"%>
<%@page import="com.webapp.conf.AllCRUD"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Edit Account</h1>
        <div >

            <form action="/WebApp/acedit" method="post">
                     <%
                             int id=Integer.parseInt(request.getParameter("id"));
                   ArrayList<UserModel> user=AllCRUD.getUser(id);
                    for (UserModel u:user) {
                %>
                <input type="hidden" name="id" value="<%=u.getId()%>">
            Username :
                <input type="text" placeholder="<%=u.getUsername()%>" name="username">
                <br>
                <br>
                
                Password  :
                <input type="password" placeholder="password" name="password">
                <br>
                <br> 
              
                Confirm    :
                <input type="password" placeholder="confirm password" name="confirm">
                <br> 
                <br>   
                <button type="submit">EDIT</button>
              
             <%
                    }
                %>
                  </form>
            </div>
    </body>
</html>
