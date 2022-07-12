package singleton.dao;

import singleton.model.Customer;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author angepf
 */
public interface CustomerDao {
  
    public Customer save(Customer customer) throws SQLException;
    
    public Customer getCustomer (long id) throws SQLException;
    
    public List<Customer> getCustomers () throws SQLException;
    
}