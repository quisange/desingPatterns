package singleton.dao;

import java.sql.SQLException;

import singleton.model.Sequence;

/**
 *
 * @author angepf
 */
public interface SequenceDao {
  
    public Sequence save(Sequence sequence) throws SQLException; 
    
    public Long getSequence (String table) throws SQLException;
    
    public Sequence update(Sequence sequence) throws SQLException;
}
