package Personas;

import static Priori.Conexiones.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgregarCliente {

    private static final String SQL_INSERT = "INSERT INTO cliente(Nit,Nombre,Direccion,Municipio,Deparamento) VALUES (?,?,?,?,?)";

    public List<Cliente> buscador(String Select) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(Select);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String nit = rs.getString("Nit");
                String nombre = rs.getString("Nombre");
                String Direccion = rs.getString("Direccion");
                String Municipio = rs.getString("Municipio");
                String Depa = rs.getString("Deparamento");
                if (Municipio == null) {
                    cliente = new Cliente(nit, nombre, Direccion, Municipio, Depa);
                    clientes.add(cliente);
                } else if ("Ciudad".equals(Direccion)) {
                    cliente = new Cliente(nit, nombre);
                    clientes.add(cliente);
                } else if (true) {
                    
                }
                cliente = new Cliente(nit, nombre, Direccion, Municipio, Depa);
                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                closeResult(rs);
                closePrepa(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return clientes;
    }

    public int insertar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cliente.getNIT());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getDireccion());
            stmt.setString(4, cliente.getMunicipio());
            stmt.setString(5, cliente.getDepartamento());
            registros = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                closePrepa(stmt);
                close(conn);

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }
        return registros;

    }

}
