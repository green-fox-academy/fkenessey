package com.greenfoxacademy.matchmaking.services;


import com.greenfoxacademy.matchmaking.factory.SendGridFactory;
import com.sendgrid.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendGridTest {

  @Autowired
  SendGridFactory sendGridFactory;

  public void callSendGrid(String senderEmail,
                           String subject,
                           String receiverEmail,
                           String emailContent) {

    Mail mail = sendGridFactory.createNewSendGridMail(senderEmail, subject, receiverEmail, emailContent);
    SendGrid sendGridCall = new SendGrid(System.getenv("SENDGRID_API_KEY"));
    Request sendGridRequest = new Request();
    try {
      sendGridRequest.setMethod(Method.POST);
      sendGridRequest.setEndpoint("mail/send");
      sendGridRequest.setBody(mail.build());
      Response response = sendGridCall.api(sendGridRequest);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
       ex.printStackTrace();
    }
  }
}
