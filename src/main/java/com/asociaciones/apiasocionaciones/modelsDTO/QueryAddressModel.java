package com.asociaciones.apiasocionaciones.modelsDTO;

public class QueryAddressModel {

    private String country;

    private String city;

    private String address;

    private String district;

    public QueryAddressModel() {
    }

    public QueryAddressModel(String country, String city, String address, String district) {
        this.country = country;
        this.city = city;
        this.address = address;
        this.district = district;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
