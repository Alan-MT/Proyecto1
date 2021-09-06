/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Personas.AgregarUsuario;
import Personas.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alanm
 */
@WebServlet("/VerificacionUsuario")
public class VerificacionUsuario extends HttpServlet{
    private static final String login = "SELECT * FROM usuario_trabajador";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("usuario");
        String password = req.getParameter("contrasena");
        
        AgregarUsuario busc = new AgregarUsuario();
        List<Usuario> usuario = busc.buscador(login);
         boolean bandra = true;
        for (Usuario usuario1 : usuario) {
            if (usuario1.getNombreU().equals(nombre) && usuario1.getPassword().equals(password)) {
                switch (usuario1.getCodigo()) {
                    case 1:
//                       req.getRequestDispatcher("Administracion.jsp").forward(req, resp);
                        resp.sendRedirect("/ProyectoCodenBugs/Administracion.jsp");
                        bandra = false;
                        break;
                    case 2:
//                         req.getRequestDispatcher("Fabrica.jsp").forward(req, resp);
                         resp.sendRedirect("/ProyectoCodenBugs/Fabrica.jsp");
                         bandra = false;
                        break;
                    case 3:
//                        req.getRequestDispatcher("Ventas.jsp").forward(req, resp);
                        resp.sendRedirect("/ProyectoCodenBugs/Ventas.jsp");
                        bandra = false;
                        break;
                    default:
                        resp.sendRedirect("/ProyectoCodenBugs/Principal.html");
                        break;
                }
                    break;
            }
            
        }
        if(bandra == true){
            resp.sendRedirect("/ProyectoCodenBugs/Principal.html");
        }
        
    }
    

}
