package com.asociaciones.apiasocionaciones.repositories;

import com.asociaciones.apiasocionaciones.entities.ActorEntity;
import com.asociaciones.apiasocionaciones.entities.PaymentEntity;
import com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel;
import com.asociaciones.apiasocionaciones.modelsDTO.QueryAddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends JpaRepository<ActorEntity, Long> {

    @Query("SELECT new com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel(c.country, ci.city) " +
            "FROM com.asociaciones.apiasocionaciones.entities.CountryEntity c, " +
            "com.asociaciones.apiasocionaciones.entities.CityEntity ci " +
            "WHERE c.countryId = ci.countryId")
    List<FilmCountryModel> filmOrigin();

    @Query("SELECT new com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel(c.country, ci.city) " +
            "FROM com.asociaciones.apiasocionaciones.entities.CountryEntity c, " +
            "com.asociaciones.apiasocionaciones.entities.CityEntity ci " +
            "WHERE c.countryId = ci.countryId AND c.countryId = :id")
    List<FilmCountryModel> filmOriginById(@Param("id") Long id);

    @Query("SELECT new com.asociaciones.apiasocionaciones.modelsDTO.FilmCountryModel(c.country, ci.city) " +
            "FROM com.asociaciones.apiasocionaciones.entities.CountryEntity c, " +
            "com.asociaciones.apiasocionaciones.entities.CityEntity ci " +
            "WHERE c.countryId = ci.countryId AND c.countryId = :id")
    List<FilmCountryModel> filmOriginByPostalCode(@Param("id") Long id);

    @Query("select new com.asociaciones.apiasocionaciones.modelsDTO.QueryAddressModel(c.country, ci.city, ad.address, ad.district) " +
            "FROM com.asociaciones.apiasocionaciones.entities.CountryEntity c, " +
            "com.asociaciones.apiasocionaciones.entities.CityEntity ci, " + // Agregar el símbolo + al final de la línea anterior
            "com.asociaciones.apiasocionaciones.entities.AddressEntity ad " +
            "WHERE c.countryId = ci.countryId AND ci.cityId = ad.cityId AND ad.postalCode = :code")
    List<QueryAddressModel> addressCompleteByPostalCode(@Param("code") String code);

    @Query("SELECT p FROM PaymentEntity p JOIN FETCH p.customerId")
    List<PaymentEntity> findAllPaymentsWithCustomers();


}
