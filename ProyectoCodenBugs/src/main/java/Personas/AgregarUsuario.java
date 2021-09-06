package Personas;

import static Priori.Conexiones.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgregarUsuario {

    private static final String Codigo1 = "SELECT Nombre,Password,Codigo FROM usuario_trabajador";
    private static final String Codigo2 = "SELECT Nombre,Password,Codigo FROM usuario_trabajador WHERE Codigo = '2'";
    private static final String Codigo3 = "SELECT Nombre,Password,Codigo FROM usuario_trabajador WHERE Codigo = '3'";
    private static final String SQL_INSERT = "INSERT INTO usuario_trabajador(Nombre,Password,Codigo) VALUES (?,?,?)";

    public List<Usuario> buscador(String Select) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(Select);
            rs = stmt.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("Nombre");
                String password = rs.getString("Password");
                int Codigo = rs.getInt("Codigo");
                usuario = new Usuario(nombre, password, Codigo);
                usuarios.add(usuario);

            }
            closeResult(rs);
            closePrepa(stmt);
            close(conn);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return usuarios;
    }

    public int insertar(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getNombreU());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getCodigo());
            stmt.executeUpdate();

            closePrepa(stmt);
            close(conn);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return registros;

    }

    public static String getCodigo1() {
        return Codigo1;
    }

    public static String getCodigo2() {
        return Codigo2;
    }

    public static String getCodigo3() {
        return Codigo3;
    }

    public static String getSQL_INSERT() {
        return SQL_INSERT;
    }

}
