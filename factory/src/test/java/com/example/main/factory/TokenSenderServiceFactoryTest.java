package com.example.main.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.domain.services.TokenSenderService;
import static com.example.main.factory.TokenSenderServiceFactory.ERROR_MESSAGE_INVALID_REF;

public class TokenSenderServiceFactoryTest {

  public static TokenSenderService tokenSenderServiceWithClientEmailOneTest;

  @BeforeAll
  public static void init() {
    tokenSenderServiceWithClientEmailOneTest = TokenSenderServiceFactory.getTokenSenderService("ClientEmailSenderOne");
  }

  @Test
  public void shouldCheckIsNotNull() {
    assertNotNull(tokenSenderServiceWithClientEmailOneTest);
  }

  @Test
  public void shouldCallSendMethodFromClientEmailSenderOnde() {
    assertEquals("....ClienteEmailSenderONE....",
        tokenSenderServiceWithClientEmailOneTest.sendEmail("from", "to", "subject", "TOKEN"));
  }

  @Test
  public void shouldReturnExceptionWhenEmailSenderStringIsNotValid() {
    IllegalArgumentException sut = assertThrows(IllegalArgumentException.class,
        () -> TokenSenderServiceFactory.getTokenSenderService(Mockito.anyString()));
    assertEquals(ERROR_MESSAGE_INVALID_REF, sut.getMessage());
  }

}
