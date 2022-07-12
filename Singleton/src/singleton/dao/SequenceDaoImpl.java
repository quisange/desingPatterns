package singleton.dao;

import singleton.model.Sequence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import singleton.util.DatabaseConnection;

/**
 *
 * @author angepf
 */
public class SequenceDaoImpl implements SequenceDao {

     static Connection conn = DatabaseConnection.getConnection();
     
    @Override
    public Sequence save(Sequence sequence) throws SQLException {
        String query = "INSERT INTO sequence (id, tableName, value) "
                + "VALUES (?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setLong(1, sequence.getId());
        ps.setString(2, sequence.getTableName());
        ps.setLong(3, sequence.getValue());
        
        return sequence;
    }

    @Override
    public Long getSequence(String tableName) throws SQLException {
        String query = "SELECT * FROM sequence WHERE tableName = ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, tableName);
        
        Long value = null;
        
        ResultSet rs = ps.executeQuery();
        boolean check = false;
  
        while (rs.next()) {
            check = true;
            value = rs.getLong("value");
        }
  
        if (check) {
            return value;
         } else return null;
    }
    
    @Override
    public Sequence update(Sequence sequence) throws SQLException {
        String query = "UPDATE sequence set value=? where tableName = ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setLong(1, sequence.getValue());
        ps.setString(2, sequence.getTableName());
        ps.executeUpdate();
        
        System.out.println("Secuencia disponible --> " + sequence.getValue());
        return sequence;
    }
}
