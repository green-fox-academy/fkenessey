package com.greenfoxacademy.matchmaking.factory;

import com.sendgrid.*;
import org.springframework.stereotype.Service;

@Service
public class SendGridFactory {

  public Mail createNewSendGridMail(String senderEmail,
                                    String subject,
                                    String receiverEmail,
                                    String emailContent) {

    Email emailSender = new Email(senderEmail);
    Email emailAdressee = new Email(receiverEmail);
    Content content = new Content("text/plain", emailContent);
    return new Mail(emailSender, subject, emailAdressee, content);
  }
}
