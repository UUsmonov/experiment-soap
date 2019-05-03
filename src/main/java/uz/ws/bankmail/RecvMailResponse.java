//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.28 at 07:46:46 PM UZT 
//


package uz.ws.bankmail;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recvMailResult">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bMail">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sender" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
 *                             &lt;element name="receiver" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
 *                             &lt;element name="mail_type" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bTrace" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sender_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
 *                             &lt;element name="sender_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
 *                             &lt;element name="bankmail_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
 *                             &lt;element name="bankmail_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
 *                             &lt;element name="receiver_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
 *                             &lt;element name="receiver_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recvMailResult"
})
@XmlRootElement(name = "recvMailResponse")
public class RecvMailResponse {

    @XmlElement(required = true)
    protected RecvMailResponse.RecvMailResult recvMailResult;

    /**
     * Gets the value of the recvMailResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecvMailResponse.RecvMailResult }
     *     
     */
    public RecvMailResponse.RecvMailResult getRecvMailResult() {
        return recvMailResult;
    }

    /**
     * Sets the value of the recvMailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecvMailResponse.RecvMailResult }
     *     
     */
    public void setRecvMailResult(RecvMailResponse.RecvMailResult value) {
        this.recvMailResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="bMail">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sender" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
     *                   &lt;element name="receiver" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
     *                   &lt;element name="mail_type" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bTrace" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sender_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
     *                   &lt;element name="sender_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
     *                   &lt;element name="bankmail_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
     *                   &lt;element name="bankmail_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
     *                   &lt;element name="receiver_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
     *                   &lt;element name="receiver_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bMail",
        "bTrace"
    })
    public static class RecvMailResult {

        @XmlElement(required = true)
        protected RecvMailResponse.RecvMailResult.BMail bMail;
        protected RecvMailResponse.RecvMailResult.BTrace bTrace;

        /**
         * Gets the value of the bMail property.
         * 
         * @return
         *     possible object is
         *     {@link RecvMailResponse.RecvMailResult.BMail }
         *     
         */
        public RecvMailResponse.RecvMailResult.BMail getBMail() {
            return bMail;
        }

        /**
         * Sets the value of the bMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecvMailResponse.RecvMailResult.BMail }
         *     
         */
        public void setBMail(RecvMailResponse.RecvMailResult.BMail value) {
            this.bMail = value;
        }

        /**
         * Gets the value of the bTrace property.
         * 
         * @return
         *     possible object is
         *     {@link RecvMailResponse.RecvMailResult.BTrace }
         *     
         */
        public RecvMailResponse.RecvMailResult.BTrace getBTrace() {
            return bTrace;
        }

        /**
         * Sets the value of the bTrace property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecvMailResponse.RecvMailResult.BTrace }
         *     
         */
        public void setBTrace(RecvMailResponse.RecvMailResult.BTrace value) {
            this.bTrace = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="sender" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
         *         &lt;element name="receiver" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
         *         &lt;element name="mail_type" type="{http://BankMail.ws.uz/}bMail" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sender",
            "receiver",
            "mailType"
        })
        public static class BMail {

            protected String sender;
            protected String receiver;
            @XmlElement(name = "mail_type")
            protected String mailType;

            /**
             * Gets the value of the sender property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSender() {
                return sender;
            }

            /**
             * Sets the value of the sender property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSender(String value) {
                this.sender = value;
            }

            /**
             * Gets the value of the receiver property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getReceiver() {
                return receiver;
            }

            /**
             * Sets the value of the receiver property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setReceiver(String value) {
                this.receiver = value;
            }

            /**
             * Gets the value of the mailType property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMailType() {
                return mailType;
            }

            /**
             * Sets the value of the mailType property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMailType(String value) {
                this.mailType = value;
            }
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="sender_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
         *         &lt;element name="sender_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
         *         &lt;element name="bankmail_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
         *         &lt;element name="bankmail_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
         *         &lt;element name="receiver_id" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
         *         &lt;element name="receiver_ts" type="{http://BankMail.ws.uz/}bTrace" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "senderId",
            "senderTs",
            "bankmailId",
            "bankmailTs",
            "receiverId",
            "receiverTs"
        })
        public static class BTrace {

            @XmlElement(name = "sender_id")
            protected String senderId;
            @XmlElement(name = "sender_ts")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar senderTs;
            @XmlElement(name = "bankmail_id")
            protected String bankmailId;
            @XmlElement(name = "bankmail_ts")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar bankmailTs;
            @XmlElement(name = "receiver_id")
            protected String receiverId;
            @XmlElement(name = "receiver_ts")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar receiverTs;

            /**
             * Gets the value of the senderId property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSenderId() {
                return senderId;
            }

            /**
             * Sets the value of the senderId property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSenderId(String value) {
                this.senderId = value;
            }

            /**
             * Gets the value of the senderTs property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getSenderTs() {
                return senderTs;
            }

            /**
             * Sets the value of the senderTs property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setSenderTs(XMLGregorianCalendar value) {
                this.senderTs = value;
            }

            /**
             * Gets the value of the bankmailId property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBankmailId() {
                return bankmailId;
            }

            /**
             * Sets the value of the bankmailId property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBankmailId(String value) {
                this.bankmailId = value;
            }

            /**
             * Gets the value of the bankmailTs property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getBankmailTs() {
                return bankmailTs;
            }

            /**
             * Sets the value of the bankmailTs property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setBankmailTs(XMLGregorianCalendar value) {
                this.bankmailTs = value;
            }

            /**
             * Gets the value of the receiverId property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getReceiverId() {
                return receiverId;
            }

            /**
             * Sets the value of the receiverId property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setReceiverId(String value) {
                this.receiverId = value;
            }

            /**
             * Gets the value of the receiverTs property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getReceiverTs() {
                return receiverTs;
            }

            /**
             * Sets the value of the receiverTs property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setReceiverTs(XMLGregorianCalendar value) {
                this.receiverTs = value;
            }

        }

    }

}