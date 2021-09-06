/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Personas.*;
import Priori.Conexiones;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alanm
 */
@WebServlet("/CreacionUsuario")
public class CreacionUsuario extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("usuario");
        String password = request.getParameter("Password");
        int Codigo = Integer.parseInt(request.getParameter("Departamentos"));

        AgregarUsuario us = new AgregarUsuario();
        Usuario usuario = new Usuario(nombre, password, Codigo);
        us.insertar(usuario);
//        PrintWriter out = response.getWriter();
//        out.print("<html>");
//        out.print("<body>");
//        out.print("Bienvenido");
//        out.print("El parametro usuario es " + nombre);
//        out.print("<br/>");
//        out.print("Tu contraseña es " + password);
//        out.print("<br/>");
//        out.print("Codigo es " + Codigo);
//        out.print("</body>");
//        out.print("</html>");
        
        response.sendRedirect("/ProyectoCodenBugs/Principal.html");
    }

}
