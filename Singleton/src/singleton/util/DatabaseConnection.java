package singleton.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angepf
 */
public class DatabaseConnection {

    private static Connection conn = null;
    
    private DatabaseConnection() {
        String url = "jdbc:postgresql://localhost:5432/bd_singleton";
        String user = "us_singleton";
        String pass = "pw_singleton";
        
        try {
             conn = DriverManager.getConnection(url, user, pass);
             System.out.println("Conexión creada.");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Connection getConnection() {
        new DatabaseConnection();
        return conn;
    }
    
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("\nConexión cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*private static Connection conn = null;
    
    static {
        String url = "jdbc:postgresql://localhost:5432/bd_singleton";
        String user = "us_singleton";
        String pass = "pw_singleton";
        
        try {
             conn = DriverManager.getConnection(url, user, pass);
             System.out.println("Conexión creada.");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Connection getConnection() {
        return conn;
    }
    
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("\nConexión cerrada");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
}