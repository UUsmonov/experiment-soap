//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 05:00:37 PM UZT 
//


package uz.ws.bankmail;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uz.ws.bankmail package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uz.ws.bankmail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecvMail }
     * 
     */
    public RecvMail createRecvMail() {
        return new RecvMail();
    }

    /**
     * Create an instance of {@link RecvMailResponse }
     * 
     */
    public RecvMailResponse createRecvMailResponse() {
        return new RecvMailResponse();
    }

    /**
     * Create an instance of {@link RecvMailResponse.RecvMailResult }
     * 
     */
    public RecvMailResponse.RecvMailResult createRecvMailResponseRecvMailResult() {
        return new RecvMailResponse.RecvMailResult();
    }

    /**
     * Create an instance of {@link RecvMail.BMail }
     * 
     */
    public RecvMail.BMail createRecvMailBMail() {
        return new RecvMail.BMail();
    }

    /**
     * Create an instance of {@link RecvMail.BTrace }
     * 
     */
    public RecvMail.BTrace createRecvMailBTrace() {
        return new RecvMail.BTrace();
    }

    /**
     * Create an instance of {@link RecvMail.BBody }
     * 
     */
    public RecvMail.BBody createRecvMailBBody() {
        return new RecvMail.BBody();
    }

    /**
     * Create an instance of {@link uz.ws.bankmail.BMail }
     * 
     */
    public uz.ws.bankmail.BMail createBMail() {
        return new uz.ws.bankmail.BMail();
    }

    /**
     * Create an instance of {@link uz.ws.bankmail.BBody }
     * 
     */
    public uz.ws.bankmail.BBody createBBody() {
        return new uz.ws.bankmail.BBody();
    }

    /**
     * Create an instance of {@link uz.ws.bankmail.BTrace }
     * 
     */
    public uz.ws.bankmail.BTrace createBTrace() {
        return new uz.ws.bankmail.BTrace();
    }

    /**
     * Create an instance of {@link RecvMailResponse.RecvMailResult.BMail }
     * 
     */
    public RecvMailResponse.RecvMailResult.BMail createRecvMailResponseRecvMailResultBMail() {
        return new RecvMailResponse.RecvMailResult.BMail();
    }

    /**
     * Create an instance of {@link RecvMailResponse.RecvMailResult.BTrace }
     * 
     */
    public RecvMailResponse.RecvMailResult.BTrace createRecvMailResponseRecvMailResultBTrace() {
        return new RecvMailResponse.RecvMailResult.BTrace();
    }

}
