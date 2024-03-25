package com.asociaciones.apiasocionaciones.controllers;

import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import com.asociaciones.apiasocionaciones.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-payment")
public class PaymentController {

    @Autowired
    @Qualifier("paymentService")
    private PaymentService paymentService;

    @GetMapping
    private List<PaymentEntity> getPayments(){
        return paymentService.getAllPayment();
    }
}
