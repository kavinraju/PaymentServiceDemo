package com.example.paymentservicedemo.services;

import com.example.paymentservicedemo.paymentgateways.IPaymentGateway;
import com.example.paymentservicedemo.paymentgateways.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String getPaymentLink(Long amount, String orderId, String phoneNumber, String name, String email) {
        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
        return paymentGateway.getPaymentLink(amount, orderId, phoneNumber, name, email);
    }
}
