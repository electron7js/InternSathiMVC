<%-- 
    Document   : LoginForm
    Created on : Jul 27, 2019, 9:44:01 AM
    Author     : Bijesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <div >
           
            <form action="/WebApp/login" method="post">
                Username :
                <input type="text" placeholder="username" name="username">
                <br>
                <br>
                <br>   
                Password  :
                <input type="password" placeholder="password" name="password">
                <br>
                <br>   
               <button type="submit">Login</button>
            </form>
        </div>
        <form action="/WebApp/register"><button type="submit">Create new account</button></form>
    </body>
</html>
