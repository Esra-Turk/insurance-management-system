package models.address;

import java.util.HashMap;

public class BusinessAddress implements IAddress {
    private String streetName;
    private int buildingNumber;
    private String district;
    private String city;
    private String country;

    public BusinessAddress(String streetName, int buildingNumber, String district, String city, String country) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.district = district;
        this.city = city;
        this.country = country;
    }

    @Override
    public String getAddress() {
        return String.format("%s.sk no:%d %s-%s/%s ",getStreetName(),getBuildingNumber(),getDistrict(),getCity(),getCountry());
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
