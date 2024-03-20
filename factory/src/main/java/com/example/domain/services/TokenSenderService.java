package com.example.domain.services;

import com.example.domain.util.adpaters.IEmailSender;

public class TokenSenderService {

  private IEmailSender emailSender;

  public TokenSenderService(IEmailSender emailSender) {
    this.emailSender = emailSender;
  }

  public String sendEmail(String from, String to, String subject, String body) {
    return this.emailSender.send(from, to, subject, body);
  }

}
