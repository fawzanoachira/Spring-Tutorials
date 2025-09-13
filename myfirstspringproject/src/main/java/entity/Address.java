package entity;

import java.beans.ConstructorProperties;

public class Address {
    private String houseName;
    private String housePlace;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHousePlace() {
        return housePlace;
    }

    public void setHousePlace(String housePlace) {
        this.housePlace = housePlace;
    }

    public Address() {
    }

    @ConstructorProperties({ "houseName", "housePlace" })
    public Address(String houseName, String housePlace) {
        this.houseName = houseName;
        this.housePlace = housePlace;
    }

    @Override
    public String toString() {
        return "Address [houseName=" + houseName + ", housePlace=" + housePlace + "]";
    }

}
