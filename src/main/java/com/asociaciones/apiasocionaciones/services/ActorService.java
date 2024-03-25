package com.asociaciones.apiasocionaciones.services;

import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import com.asociaciones.apiasocionaciones.modelsDTO.ActorModel;
import com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel;
import com.asociaciones.apiasocionaciones.modelsDTO.QueryAddressModel;
import com.asociaciones.apiasocionaciones.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ActorService {

    List<ActorModel> findAllActors();

    List<FilmCountryModel> filmOrigin();

    List<FilmCountryModel> filmOriginById(Long id);

    List<QueryAddressModel> addressCompleteByPostalCode(String code);

    List<PaymentEntity> getAllPayment();
}
