<%-- 
    Document   : form
    Created on : Jul 8, 2019, 4:15:45 PM
    Author     : gl3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <style>
            body{
                margin: 0;
                padding: 0;

            }
            h1{display: flex;
               align-items: center;
               justify-content: center;
               color: white;
               
            }
            
            .content{
                width: 220px;
                border: 15px solid green;
                background: white;
                padding: 10px;
            </style>
            <meta http-equiv="Content-Type" content="width=device-width, initial-scale=1,text/html; charset=UTF-8">
            <title>Input form</title>
        </head>
        <body bgcolor="#00501c">
            <div style="background-color: black">
            <h1>New Post</h1>
            </div>
            <div style="display: flex;
                align-items: center;
                justify-content: center;
                height: 60vh;">
                <form action="/WebApps/newpost" method="post" enctype="multipart/form-data" style="background-color: chartreuse" class="content" >
                        <label>Title:</label>
                        <input type="text" name="title">
                        <br><br>
                        <label>Content:</label>
                        <input type="text" name="content">
                        <br><br>
                        <label>Image:</label>
                        <input type="file" name="fname">
                        <br><br>
                        <button type="submit">post</button>
                    </form>
                </div>
            </body>
        </html>
