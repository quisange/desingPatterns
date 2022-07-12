package singleton.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author angepf
 */
public class DatabaseSetup {
    
    static Connection conn = DatabaseConnection.getConnection();
    
    public void createCustomerTable() {
      Statement stmt;
      
      try {
          stmt = conn.createStatement();
          String sql = "CREATE TABLE CUSTOMER " +
            "(id             BIGINT     PRIMARY KEY     NOT NULL," +
            " name           TEXT                       NOT NULL, " +
            " lastname       TEXT                       NOT NULL, " +
            " address        TEXT                       NOT NULL, " +
            " phone          TEXT                       NOT NULL, " +
            " observation    TEXT                       NOT NULL)";
         stmt.executeUpdate(sql);
         stmt.close();
      } catch ( SQLException e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      
      System.out.println("Table customer created successfully");
   }
    
    public void createSequenceTable() {
      Statement stmt;
      
      try {
          stmt = conn.createStatement();
          String sql = "CREATE TABLE SEQUENCE " +
            "(id            BIGINT     PRIMARY KEY     NOT NULL," +
            " tableName     TEXT                       NOT NULL, " +
            " value         BIGINT                     NOT NULL)";
         stmt.executeUpdate(sql);
         stmt.close();
      } catch ( SQLException e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table sequence created successfully");
   }
    
}
