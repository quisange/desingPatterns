package singleton.dao;

import singleton.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import singleton.model.Sequence;
import singleton.util.DatabaseConnection;

/**
 *
 * @author angepf
 */
public class CustomerDaoImpl implements CustomerDao {

     static Connection conn = DatabaseConnection.getConnection();
     
    @Override
    public Customer save(Customer customer) throws SQLException {
        String query = "INSERT INTO customer (id, name, lastname, address, phone, observation) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        SequenceDaoImpl sequenceDaoImpl = new SequenceDaoImpl();
        customer.setId(sequenceDaoImpl.getSequence("customer"));
        System.out.println("Secuencia usada      --> " + customer.getId());
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setLong(1, customer.getId());
        ps.setString(2, customer.getName());
        ps.setString(3, customer.getLastName());
        ps.setString(4, customer.getAddress());
        ps.setString(5, customer.getPhone());
        ps.setString(6, customer.getObservation());
        ps.executeUpdate();
        
        Sequence seqCustomer = new Sequence(2L, "customer", customer.getId() + 1);
        sequenceDaoImpl.update(seqCustomer);    
        
        System.out.println("\nCliente creado\n\t" + customer);
        return customer;
    }

    @Override
    public Customer getCustomer(long id) throws SQLException {
        String query = "SELECT * FROM CUSTOMER WHERE id = ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setLong(1, id);
        
        Customer customer = new Customer();
        
        ResultSet rs = ps.executeQuery();
        boolean check = false;
  
        while (rs.next()) {
            check = true;
            customer.setId(rs.getLong("id"));
            customer.setName(rs.getString("name"));
            customer.setLastName(rs.getString("lastname"));
            customer.setAddress(rs.getString("address"));
            customer.setPhone(rs.getString("phone"));
            customer.setObservation(rs.getString("observation"));
        }
  
        if (check) {
            System.out.println("\nCliente en base\n\t" + customer);
            return customer;
         } else return null;
    }

    @Override
    public List<Customer> getCustomers() throws SQLException {
        String query = "SELECT * FROM CUSTOMER";
        
        PreparedStatement ps = conn.prepareStatement(query);
        
        List<Customer> customers = new ArrayList<>();
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setId(rs.getLong("id"));
            customer.setName(rs.getString("name"));
            customer.setLastName(rs.getString("lastname"));
            customer.setAddress(rs.getString("address"));
            customer.setPhone(rs.getString("phone"));
            customer.setObservation(rs.getString("observation"));
            
            customers.add(customer);
        }
        
        return customers;
    }
    
    @Override
    public Customer update(Customer customer) throws SQLException {
        String query = "UPDATE customer set name=?, lastname=?, "
                + "address=?, phone=?, observation=? where id = ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, customer.getName());
        ps.setString(2, customer.getLastName());
        ps.setString(3, customer.getAddress());
        ps.setString(4, customer.getPhone());
        ps.setString(5, customer.getObservation());
        ps.setLong(6, customer.getId());
        ps.executeUpdate();
        
        System.out.println("\nCliente actualizado\n\t" + customer);
        return customer;
    }
}
