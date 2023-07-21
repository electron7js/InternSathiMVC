

<%@page import="com.webapp.conf.AllCRUD"%>
<%@page import="com.webapp.model.DataModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
            div{color: black;

            }
            table{
                border-color: azure;
                background-color: white;
            }
        </style>
    </head>
    <body bgcolor="azure"><div>
            <h1>users</h1>
            <table border="3px"><tr>
                    <th>Post ID</th>
                    <th>Title</th>
                    <th>Content</th>
                    <th>Author</th>
                    <th>Image</th>
                    <th>Created on</th>
                    <th>Updated on/th>
                    <th>Actions</th>
                </tr>
              <%
          ArrayList<DataModel> posts = AllCRUD.getData();
            for (DataModel p : posts) {
        %>
                <tr>
                    <th><%= p.getId()%></th>
                    <th><%= p.getTitle() %></th>
                    <th><%= p.getContent() %></th>
                    <th><%= p.getAuthor() %></th>
                    <th><%= p.getImage() %></th>
                    <th><%= p.getCreated_on() %></th>
                    <th><form action="/WebApps/deletepost" method="post">
                            <input type="hidden" value="<%= p.getId()%>" name="id" >
                    <button type="submit">Delete</button>
                        </form>
                    <form action="editpost" >
                     <input type="hidden" value="<%= p.getId()%>" name="id" >
                    <button type="submit">Update</button>
                        </form></th>
                </tr>
                <%
                    }
                %>
            </table>
         
             <form action="ds">
                <button type="submit">log out</button>
            </form>
        </div>
    </body>
</html>
