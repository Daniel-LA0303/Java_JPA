package com.asociaciones.apiasocionaciones.services;

import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import com.asociaciones.apiasocionaciones.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;


    @Override
    public List<PaymentEntity> getAllPayment() {
        return paymentRepository.findAll();
    }
}
