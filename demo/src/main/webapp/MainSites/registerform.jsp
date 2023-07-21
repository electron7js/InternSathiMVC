<%-- 
    Document   : registerform
    Created on : Jul 27, 2019, 10:13:45 AM
    Author     : Bijesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Create an account</h1>
        <div >

            <form action="/WebApp/register" method="post">
                Username :
                <input type="text" placeholder="username" name="username">
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
                <button type="submit">Register</button>
                </form>
            </div>
    </body>
</html>
