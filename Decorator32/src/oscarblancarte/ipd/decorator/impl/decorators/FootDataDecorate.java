package oscarblancarte.ipd.decorator.impl.decorators;

import oscarblancarte.ipd.decorator.impl.message.IMessage;
public class FootDataDecorate extends MessageDecorator {

    public FootDataDecorate(IMessage message) {
        super(message);
    }

    @Override
    public IMessage processMessage() {
        message.processMessage();
        message =  envelopMessage();
        return message;
    }

    private IMessage envelopMessage() {
        message.setContent("<soapenv:Envelope xmlns:soapenv="
                + "\n\"http://schemas.xmlsoap.org/soap/envelope/\" "
                + "\nxmlns:ser=\"http://service.dishweb.cl.com/\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + message.getContent()
                + "\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>");
        return message;
    }

}