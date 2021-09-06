<%-- 
    Document   : Facturas
    Created on : 2021 Sep 5, 23:10:06
    Author     : alanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Factura</title>
        <link rel="import" href="Facturacion2.jsp">
    <h2>Factura</h2>

</head>
<body>
    <form action="VerificaciondeFactura" method="POST">
  
    <br><input type="text" name="Nit" id="nit" placeholder=Nit><br><br>
    <input type="button"  name="Buscarr" onclick="generarFactura()"   value="Continuar"/>
    </form>
    
</body>
</html>