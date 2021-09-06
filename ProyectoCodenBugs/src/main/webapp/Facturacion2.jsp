<%-- 
    Document   : Facturacion2
    Created on : 2021 Sep 6, 00:23:05
    Author     : alanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Factura</h1>
        <table border="1">
            <tr><td>Nit</td><td>
                    ${NIT}</td> </tr>

            <tr><td>Cliente</td><td>
                    ${nombreC}</td> </tr>

            <tr><td>Ciudad</td><td>
                    ${Ciudad}}</td> </tr>

            <tr><td>Municipio</td><td>
                    ${Depa}</td> </tr>

            <tr><td>Departamento</td><td>
                    ${Muni}</td> </tr>
        </table>
    </body>
</html>
