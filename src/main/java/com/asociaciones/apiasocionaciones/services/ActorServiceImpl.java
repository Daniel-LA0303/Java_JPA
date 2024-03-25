package com.asociaciones.apiasocionaciones.services;

import com.asociaciones.apiasocionaciones.entities.ActorEntity;
import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import com.asociaciones.apiasocionaciones.modelsDTO.ActorModel;
import com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel;
import com.asociaciones.apiasocionaciones.modelsDTO.QueryAddressModel;
import com.asociaciones.apiasocionaciones.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("actorService")
public class ActorServiceImpl implements ActorService{

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public List<ActorModel> findAllActors() {

        List<ActorEntity> actorEntities = actorRepository.findAll();

        return actorEntities.stream()
                .map(entity -> {
                    return new ActorModel(entity.getActorId(), entity.getFirstName(), entity.getLastName());
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<FilmCountryModel> filmOrigin() {
        return actorRepository.filmOrigin();
    }

    @Override
    public List<FilmCountryModel> filmOriginById(Long id) {
        return actorRepository.filmOriginById(id);
    }

    @Override
    public List<QueryAddressModel> addressCompleteByPostalCode(String code) {
        return actorRepository.addressCompleteByPostalCode(code);
    }

    @Override
    public List<PaymentEntity> getAllPayment() {
        return actorRepository.findAllPaymentsWithCustomers();
    }
}
