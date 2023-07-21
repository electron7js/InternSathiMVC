<%-- 
    Document   : adminhome
    Created on : Jul 27, 2019, 10:40:52 AM
    Author     : Bijesh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.webapp.conf.AllCRUD"%>
<%@page import="com.webapp.model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
    </head>
    <body>
          <h1>users</h1>
            <table border="3px"><tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Created on</th>
                    <th>Actions</th>
                </tr>
                <%
                    ArrayList<UserModel> allUsers = AllCRUD.getAllUsers();
                    for (UserModel u:allUsers) {
                %>
                <tr>
                    <th><%= u.getId()%></th>
                    <th><%= u.getUsername()%></th>
                    <th><%= u.getCreated_on()%></th>
                    <th><form action="/WebApp/acdel" method="post">
                            <input type="hidden" value="<%= u.getId()%>" name="id" >
                    <button type="submit">Delete</button>
                        </form>
                    <form action="/WebApp/acedit">
                     <input type="hidden" value="<%= u.getId()%>" name="id" >
                    <button type="submit">Update</button>
                        </form></th>
                </tr>
                <%
                    }
                %>
            </table>
             <form action="/WebApp/adminpost">
                <button type="submit">Post Control</button>
            </form>
            <form action="register">
                <button type="submit">Create New Account</button>
             <form action="ds">
                <button type="submit">log out</button>
            </form>
                
        </div>
    </body>
</html>
