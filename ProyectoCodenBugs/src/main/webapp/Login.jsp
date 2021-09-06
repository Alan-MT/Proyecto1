<%-- 
    Document   : Login
    Created on : 2021 Aug 28, 11:06:53
    Author     : alanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import='Priori.*'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="PaquetesCSS/StyleLogin.css">
    </head>
    <body>

        <div class="login-box">
            <img src="img/logo.png" class="avatar" alt="Avatar Image">
            <h1>Login</h1>
            <form action="VerificacionUsuario" method="POST">
                <!-- USERNAME INPUT -->
                <label for="username">Username</label>
                <input type="text" name="usuario" placeholder="Usuario" required="">
                <!-- PASSWORD INPUT -->
                <label for="password">Password</label>
                <input type="password" name="contrasena" placeholder="Enter Password" required="">
                <input type="submit" value="Ingresar">
            </form>
        </div>
    </body>
</html>
