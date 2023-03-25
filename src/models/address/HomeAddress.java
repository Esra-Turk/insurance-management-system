package models.address;

public class HomeAddress implements IAddress {
    private String street;
    private int buildingNumber;
    private int doorNumber;
    private String district;
    private String city;
    private String country;

    public HomeAddress(String street, int buildingNumber, int doorNumber, String district, String city, String country) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.doorNumber = doorNumber;
        this.district = district;
        this.city = city;
        this.country = country;
    }

    @Override
    public String getAddress() {
        return String.format("%s.sk no:%d/%d %s-%s/%s ",getStreet(),getBuildingNumber(),getDoorNumber(),getDistrict(),getCity(),getCountry());
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
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
