package com.platzi.javatests.player.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

       PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

       boolean result = paymentProcessor.makePayment(1000);
       assertTrue(result);
    }
}