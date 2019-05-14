package com.exp.soapmail.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import uz.ws.bankmail.RecvMail;
import uz.ws.bankmail.RecvMailResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Endpoint
public class recvendpoint {

    public static String reData(){
        Date dt = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy"+" "+"HH:mm:ss");
        String str = sd.format(dt);
        return str;
    }

    @PayloadRoot(namespace = "http://BankMail.ws.uz/", localPart = "recvMail")
    @ResponsePayload
    public RecvMailResponse processRecvMail(@RequestPayload RecvMail recvMail){
        RecvMailResponse response = new RecvMailResponse();
        RecvMailResponse.RecvMailResult result = new RecvMailResponse.RecvMailResult();
        RecvMailResponse.RecvMailResult.BMail innerBMail = new RecvMailResponse.RecvMailResult.BMail();
        RecvMailResponse.RecvMailResult.BTrace innerBTrace = new RecvMailResponse.RecvMailResult.BTrace();

        innerBMail.setSender("701");
        innerBMail.setReceiver("101");
        innerBMail.setMailType("1010101");
        result.setBMail(innerBMail);
/*
        System.out.println("recmail object: " + recvMail);
        System.out.println("getbmail object: " + recvMail.getBMail());
        System.out.println("getsender object: " + recvMail.getBMail().getSender());
*/

/*
        RecvMail.BMail rBMail = new RecvMail.BMail();
        System.out.println("recvmail object: " + recvMail);
        System.out.println("getbmail object: " + recvMail.getBMail());
        System.out.println("getsender object: " + recvMail.getBMail().getSender());
*/

        innerBTrace.setSenderId("sid0101");
        innerBTrace.setSenderTs(reData());
        innerBTrace.setBankmailId("bid0102");
        innerBTrace.setBankmailTs(reData());
        innerBTrace.setReceiverId("rid0103");
        innerBTrace.setReceiverTs(reData());
        result.setBTrace(innerBTrace);


        response.setRecvMailResult(result);

        return response;
    }

}
