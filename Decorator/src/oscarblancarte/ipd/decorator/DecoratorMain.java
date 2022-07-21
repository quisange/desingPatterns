package oscarblancarte.ipd.decorator;

import oscarblancarte.ipd.decorator.impl.decorators.SOAPEnvelopMessage;
import oscarblancarte.ipd.decorator.impl.message.IMessage;
import oscarblancarte.ipd.decorator.impl.decorators.EncryptMessage;
import oscarblancarte.ipd.decorator.impl.message.CustomerMessage;
import oscarblancarte.ipd.decorator.impl.decorators.XMLFormatterDecorate;
import oscarblancarte.ipd.decorator.impl.message.FootMessage;

/**
 *
 * @author Oscar Javier Blancarte Iturralde
 * @see http://www.oscarblancarteblog.com
 */
public class DecoratorMain {

    public static void main(String[] args) {
        /*
        CustomerMessage customerMessage = new CustomerMessage(
                "Oscar Blancarte", "oscarblancarte3@gmail.com", "554433445566");
        System.out.println("Original Message ==> " + customerMessage);
        
        IMessage message1 = new EncryptMessage("user", "HG58YZ3CR9123456", 
                new SOAPEnvelopMessage(
                    new XMLFormatterDecorate(customerMessage))).processMessage();
        System.out.println("message1 =====================================>\n" 
                + message1.getContent() + "\n\n");
        
        IMessage message2 = new SOAPEnvelopMessage(
                new EncryptMessage("user", "HG58YZ3CR9123456",
                    new XMLFormatterDecorate(customerMessage))).processMessage();
        System.out.println("message2 =====================================>\n" 
                + message2.getContent());
        */
        FootMessage footMessage = new FootMessage(
                "Empresa Desal S.A.", "Autopista km. 2-14", "4857395837", "desalcorp@corporacion.com.ec");
        System.out.println("Original Message ==> " + footMessage);
        
        IMessage message3 = new EncryptMessage("user", "HG58YZ3CR9123456", 
                new SOAPEnvelopMessage(
                    new XMLFormatterDecorate(footMessage))).processMessage();
        System.out.println("message3 =====================================>\n" 
                + message3.getContent() + "\n\n");
        
        IMessage message4 = new SOAPEnvelopMessage(
                new EncryptMessage("user", "HG58YZ3CR9123456",
                    new XMLFormatterDecorate(footMessage))).processMessage();
        System.out.println("message4 =====================================>\n" 
                + message4.getContent());
    }
    
}