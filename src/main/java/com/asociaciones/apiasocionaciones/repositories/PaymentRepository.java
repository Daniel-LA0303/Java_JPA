package com.asociaciones.apiasocionaciones.repositories;

import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
