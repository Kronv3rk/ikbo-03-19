package ru;

public final class Address{
    String cityName;
    String streetName;
    int zipCode;
    int buildingNumber;
    char buildingLetter;
    int apartamentNumber;
    public static Address EMPTY_ADDRESS = null;

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartamentNumber() {
        return apartamentNumber;
    }
}
