package Administracion;

import Personas.*;
import static Priori.Conexiones.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Facturacion {

    private static final String Crear = "INSERT INTO factura (NumeroFactura,Fecha,NombreMuebles,NitCliente) VALUES (?,?,?,?)";
    private static final String BCliente = "SELECT * FROM Cliente ";

    public int insertar(Factura factura) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(Crear);
            stmt.setInt(1, factura.getNumeroFactura());
            stmt.setString(2, factura.getFecha());
            stmt.setString(3, factura.getNombreMueble());
            stmt.setString(4, factura.getNitCliente());
            registros = stmt.executeUpdate();
            closePrepa(stmt);
            close(conn);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return registros;
    }

    public List<Factura> buscador() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Factura factu = null;
        List<Factura> facturas = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(BCliente);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Numero = rs.getInt("NumeroFactura");
                String fecha = rs.getString("Fecha");
                String NameMueble = rs.getString("NombreMueble");
                String NitCliente = rs.getString("NitCliente");
                factu = new Factura(Numero, fecha, NameMueble, NitCliente);
                facturas.add(factu);
              
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                closeResult(rs);
                closePrepa(stmt);
                close(conn);
            } catch (SQLException ex) {
                Logger.getLogger(Facturacion.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        return facturas;
    }

}
