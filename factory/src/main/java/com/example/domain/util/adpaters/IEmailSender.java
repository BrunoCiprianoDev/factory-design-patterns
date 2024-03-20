package com.example.domain.util.adpaters;

public interface IEmailSender {

  public String send(String from, String to, String subject, String body);

}
