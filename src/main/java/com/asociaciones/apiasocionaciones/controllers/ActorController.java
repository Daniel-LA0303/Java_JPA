package com.asociaciones.apiasocionaciones.controllers;

import com.asociaciones.apiasocionaciones.entities.ActorEntity;
import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import com.asociaciones.apiasocionaciones.modelsDTO.ActorModel;
import com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel;
import com.asociaciones.apiasocionaciones.modelsDTO.QueryAddressModel;
import com.asociaciones.apiasocionaciones.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ActorController {

    @Autowired
    @Qualifier("actorService")
    private ActorService actorService;

    @GetMapping
    private List<ActorModel> actorGet (){
        return actorService.findAllActors();
    }

    @GetMapping("get-film")
    private List<FilmCountryModel> getFilmOrigin(){
        return  actorService.filmOrigin();
    }

    @GetMapping("get-film-id")
    private List<FilmCountryModel> getFilmOriginById(@RequestParam Long id){
        System.out.println("id" + id);
        return actorService.filmOriginById(id);
    }

    @GetMapping("get-by-postal")
    private List<QueryAddressModel> getAddressPostal(@RequestParam String code){
        return actorService.addressCompleteByPostalCode(code);
    }

    @GetMapping("get-payment")
    private List<PaymentEntity> getPayments(){
        return actorService.getAllPayment();
    }

}
