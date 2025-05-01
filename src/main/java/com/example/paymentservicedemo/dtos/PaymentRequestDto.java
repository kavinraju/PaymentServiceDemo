package com.example.paymentservicedemo.dtos;

import lombok.Data;

@Data
public class PaymentRequestDto {
    Long amount;
    String orderId;
    String phoneNumber;
    String name;
    String email;
}
