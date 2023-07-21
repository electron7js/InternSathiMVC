<%-- 
    Document   : homepage
    Created on : Jul 11, 2019, 4:14:44 PM
    Author     : gl3
--%>

<%@page import="com.webapp.postScripts.*"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posts</title>
        <style>         
            .content{
                width: 60%;
                border: 15px solid green;
                background: azure;
                padding: 10px;
                margin: 0 auto;
            }
            header{
                color: white;
                line-height: 100px;
                padding-left: 100px;
            }
            header a{
                
            }
            footer{
                
                
            }
            
            hr{
              margin-top: 20px;
              margin-bottom: 40px;
              color: transparent;
            }
        </style>
    </head>
    <body bgcolor="#00501c">
        <header> <h1 style="
            align-items: center;
            color: white ;">Posts</h1></header>
       
        <%
          ArrayList<Posts> posts = PostCRUD.getAllPosts();
            for (Posts p : posts) {
        %>
        <div class="content" style="" > 
            <h1><%=p.getTitle()%>
            </h1>
            <img src="<%=p.getImage()%>">
            <p><%=p.getContent()%></p>
            <br><br>
            <p>Author: <%=p.getAuthor()%></p>
            
        </div>
            <hr>
        <%
            }
        %>
        <form action="/WebApps/newpost" >
            <button type="submit">New Post</button>
        </form>  
    
    <form action="/WebApps/ds">
        <button type="submit">log out</button>
    </form>
        <footer> GL3 </footer>
</body>
</html>
