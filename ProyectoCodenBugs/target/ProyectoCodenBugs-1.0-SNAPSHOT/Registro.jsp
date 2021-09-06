<%-- 
    Document   : Registro
    Created on : 2021 Aug 31, 09:09:58
    Author     : alanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="PaquetesCSS/registrol.css">

        <title>Formulario Registro</title>
    </head>
    <body>

        <form class="form-register" action="/ProyectoCodenBugs/CreacionUsuario" method="post" requerid="">
            <h4 style="text-align: center">Formulario Registro</h4>
            <input class="controls" type="text" name="usuario" placeholder="Ingrese su Usuario" requerid="">
            <input class="controls" type="password" name="Password" placeholder="Ingrese su Contraseña" maxlength="6" requerid="">
            <tr>
            <h3 style="text-align: center"">Departamentos</h3>
            <td><br><label>
                    <input type="radio" name="Departamentos" value="1" id="0">
                    Administracion</label>
                <br>
                <label>
                    <input type="radio" name="Departamentos" value="2" id="1">
                    Fabrica</label>
                <br>
                <label>
                    <input type="radio" name="Departamentos" value="3" id="2">
                    Ventas</label></td>
                
        </tr>     
        <input class="botons" type="submit" value="Registrar" required="">
    </form>
    <div>
</body>
</html>

