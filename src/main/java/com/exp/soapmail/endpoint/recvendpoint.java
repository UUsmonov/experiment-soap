package com.exp.soapmail.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import uz.ws.bankmail.BMail;
import uz.ws.bankmail.BTrace;
import uz.ws.bankmail.RecvMail;
import uz.ws.bankmail.RecvMailResponse;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;

@Endpoint
public class recvendpoint {

    private static XMLGregorianCalendar reData() {
        Date dt = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String str = sd.format(dt);
        XMLGregorianCalendar xmlDate = null;
        try {
            xmlDate=DatatypeFactory.newInstance().newXMLGregorianCalendar(str);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return xmlDate;
    }

    @PayloadRoot(namespace = "http://BankMail.ws.uz/", localPart = "recvMail")
    @ResponsePayload
    public RecvMailResponse processRecvMail(@RequestPayload RecvMail recvMail){
        RecvMailResponse response = new RecvMailResponse();
/*
        RecvMailResponse.RecvMailResult result = response.getRecvMailResult();
        RecvMailResponse.RecvMailResult.BMail innerbMail = new RecvMailResponse.RecvMailResult.BMail();
        RecvMailResponse.RecvMailResult.BTrace innerBTrace = new RecvMailResponse.RecvMailResult.BTrace();
//        innerbMail.setSender("701");
//        innerbMail.setReceiver(recvMail.getBMail().getReceiver());
//        innerbMail.setMailType(recvMail.getBMail().getMailType());
//        result.setBMail(innerbMail.setSender(recvMail.getBMail().getSender()));

        innerbMail.setSender(recvMail.getBMail().getSender());
        innerbMail.setReceiver(recvMail.getBMail().getReceiver());
        innerbMail.setMailType(recvMail.getBMail().getMailType());
        result.setBMail(innerbMail);

        innerBTrace.setSenderId(recvMail.getBTrace().getSenderId());
        innerBTrace.setSenderTs(recvMail.getBTrace().getSenderTs());
        innerBTrace.setBankmailId(recvMail.getBTrace().getBankmailId());
        innerBTrace.setBankmailTs(recvMail.getBTrace().getBankmailTs());
        innerBTrace.setReceiverId(recvMail.getBTrace().getReceiverId());
        innerBTrace.setReceiverTs(recvMail.getBTrace().getReceiverTs());
        result.setBTrace(innerBTrace);

//        result.setBMail(innerbMail.setSender(recvMail.getBMail().getSender()));
        response.setRecvMailResult(result);
*/

/*
        BMail bMail = new BMail();
        bMail.setSender("701");
        bMail.setReceiver("101");
        bMail.setMailType("10101");

        BTrace innerBTrace = new BTrace();
        innerBTrace.setSenderId("send01");
        innerBTrace.setSenderTs(reData());
        innerBTrace.setBankmailId("bank01");
        innerBTrace.setBankmailTs(reData());
        innerBTrace.setReceiverId("recv01");
        innerBTrace.setReceiverTs(reData());
  */
    RecvMailResponse.RecvMailResult.BMail innerbMail = new RecvMailResponse.RecvMailResult.BMail();

        return response;
    }

}
