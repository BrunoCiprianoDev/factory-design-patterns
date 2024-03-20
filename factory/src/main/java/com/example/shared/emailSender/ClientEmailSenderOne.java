package com.example.shared.emailSender;

import com.example.domain.util.adpaters.IEmailSender;

public class ClientEmailSenderOne implements IEmailSender {

  @Override
  public String send(String from, String to, String subject, String body) {
    return "....ClienteEmailSenderONE....";
  }

}
