package singleton;

import java.sql.SQLException;
import singleton.dao.CustomerDaoImpl;
import singleton.dao.SequenceDao;
import singleton.dao.SequenceDaoImpl;
import singleton.model.Customer;
import singleton.model.Sequence;
import singleton.util.DatabaseSetup;

/**
 *
 * @author angepf
 */
public class Singleton {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        /*DatabaseSetup setup = new DatabaseSetup();
        setup.createCustomerTable();
        setup.createSequenceTable();*/
        
        /*Sequence seqSequence = new Sequence(1L, "sequence", 1L);
        Sequence seqCustomer = new Sequence(2L, "customer", 1L);
        
        SequenceDaoImpl sequenceDaoImpl = new SequenceDaoImpl();
        sequenceDaoImpl.save(seqSequence);
        sequenceDaoImpl.save(seqCustomer);*/
        
        Customer customer = new Customer(0L, "Luis", "Sanchez", "Azogues", "4039584", "");
        
        CustomerDaoImpl dao = new CustomerDaoImpl();
        dao.save(customer);
    }
    
}
