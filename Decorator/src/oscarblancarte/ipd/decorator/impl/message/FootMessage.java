package oscarblancarte.ipd.decorator.impl.message;

public class FootMessage implements IMessage {

    private String name;
    private String address;
    private String telephone;
    private String email;
    

    public FootMessage(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public IMessage processMessage() {
        return this;
    }

    @Override
    public String getContent() {
        return toString();
    }

    @Override
    public String toString() {
        return "FootMessage{" + "name=" + name + ", \naddress=" + address + ", telephone=" + telephone + ", \nemail=" + email + '}';
    }

    @Override
    public void setContent(String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}