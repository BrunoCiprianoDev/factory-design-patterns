package com.example.main.factory;

import com.example.domain.services.TokenSenderService;
import com.example.domain.util.adpaters.IEmailSender;

public class TokenSenderServiceFactory {

  public static String ERROR_MESSAGE_INVALID_REF = "Referencia para emailSender invalida";

  public static TokenSenderService getTokenSenderService(String emailSender) {
    Class<?> classe = null;
    Object object = null;
    try {
      classe = Class.forName("com.example.shared.emailSender." + emailSender);
      System.out.println(classe);
      object = classe.getDeclaredConstructor().newInstance();
    } catch (Exception exception) {
      throw new IllegalArgumentException(ERROR_MESSAGE_INVALID_REF, exception);
    }
    return new TokenSenderService((IEmailSender) object);
  }

}
