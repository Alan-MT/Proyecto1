package Priori;


import java.sql.*;

public class Conexiones {

    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto1?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
                                       

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static void closeResult(ResultSet rs) throws SQLException{
        rs.close();
    }

    public static void closeState(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void closePrepa(PreparedStatement smt) throws SQLException{
        smt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
