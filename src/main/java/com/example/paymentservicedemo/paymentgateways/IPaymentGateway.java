package com.example.paymentservicedemo.paymentgateways;

public interface IPaymentGateway {
    String getPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email);
}
