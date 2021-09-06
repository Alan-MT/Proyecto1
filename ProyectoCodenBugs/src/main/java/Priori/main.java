/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Priori;

import Personas.AgregarUsuario;
import Personas.Usuario;
import java.util.List;

/**
 *
 * @author alanm
 */
public class main {
    private static final String login = "SELECT * FROM usuario_trabajador";
    public static void main(String[] args) {
        AgregarUsuario busc = new AgregarUsuario();
        List<Usuario> usuario = busc.buscador(login);
        boolean bandra = true;
        for (Usuario usuario1 : usuario) {
            if (usuario1.getNombreU().equals("Aalns") && usuario1.getPassword().equals("wick")) {
                System.err.println(usuario1.getNombreU());
                System.err.println(usuario1.getPassword());
                switch(usuario1.getCodigo()){
                    case 1:
                        System.out.println("Admin");
                         bandra = false;
                        break;
                       
                    case 2:
                         System.out.println("Fabrica");
                          bandra = false;
                        break;
                    case 3:
                         System.out.println("ventas");
                          bandra = false;
                        break;
                    default:
                         System.out.println("Sal de aqui perro");
                        break;
                }
                break;
            } 
    }
        if(bandra == true){
            System.err.println("Ese pendejo no existe");
        }
    
}
}
