package com.asociaciones.apiasocionaciones.modelsDTO;

public class FilmCountryModel {

    private String country;

    private String city;

    public FilmCountryModel() {
    }

    public FilmCountryModel(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
