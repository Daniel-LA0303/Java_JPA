package com.asociaciones.apiasocionaciones.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "city")
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    @Column(name = "city")
    private String city;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public CityEntity() {
    }

    public CityEntity(Long cityId, String city, Long countryId, Timestamp lastUpdate) {
        this.cityId = cityId;
        this.city = city;
        this.countryId = countryId;
        this.lastUpdate = lastUpdate;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
