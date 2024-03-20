package com.example.shared.emailSender;

import com.example.domain.util.adpaters.IEmailSender;

public class ClientEmailSenderTwo implements IEmailSender {

  @Override
  public String send(String from, String to, String subject, String body) {
    return "....ClienteEmailSenderTWO....";
  }

}
