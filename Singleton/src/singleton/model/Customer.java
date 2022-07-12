package singleton.model;

/**
 *
 * @author angepf
 */
public class Customer {

    private Long id;
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String observation;

    public Customer() {
    }

    public Customer(Long id, String name, String lastName, String address, String phone, String observation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.observation = observation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name 
                + ", lastName=" + lastName + ", address=" + address 
                + ", phone=" + phone + ", observation=" + observation + '}';
    }
}