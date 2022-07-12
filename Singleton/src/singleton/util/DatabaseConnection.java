package singleton.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author angepf
 */
public class DatabaseConnection {

    private static Connection conn = null;
    
    static {
        String url = "jdbc:postgresql://localhost:5432/bd_singleton";
        String user = "us_singleton";
        String pass = "pw_singleton";
        
        try {
             conn = DriverManager.getConnection(url, user, pass);
             System.out.println("Successfully operation to the PostgreSQL database server.");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static Connection getConnection() {
        return conn;
    }
}