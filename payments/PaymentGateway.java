package com.platzi.javatests.player.payments;

public interface PaymentGateway {

   PaymentResponse requestPayment (PaymentRequest request);

}
