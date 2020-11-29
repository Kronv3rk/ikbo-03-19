package ru;

import java.util.StringTokenizer;

class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String address, String separator) {
        StringTokenizer res = new StringTokenizer(address, separator);
        if (res.countTokens() != 7)
            throw new IllegalStateException("Неправильно введены исходные данные");
        this.country = res.nextToken().trim();
        this.region = res.nextToken().trim();
        this.city = res.nextToken().trim();
        this.street = res.nextToken().trim();
        this.house = res.nextToken().trim();
        this.building = res.nextToken().trim();
        this.apartment = res.nextToken().trim();
    }

    public Address(String address) {
        String[] res = address.split(",");
        if (res.length != 7)
            throw new IllegalStateException("Неправильно введены исходные данные");
        this.country = res[0].trim();
        this.region = res[1].trim();
        this.city = res[2].trim();
        this.street = res[3].trim();
        this.house = res[4].trim();
        this.building = res[5].trim();
        this.apartment = res[6].trim();
    }

    @Override
    public String toString() {
        return "Address {" +
                "country = '" + country + '\'' +
                ", region = '" + region + '\'' +
                ", city = '" + city + '\'' +
                ", street = '" + street + '\'' +
                ", house = '" + house + '\'' +
                ", building = '" + building + '\'' +
                ", apartment = '" + apartment + '\'' +
                '}';
    }
}
