package com.upgrad.hirewheels.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private int location_id;
    private String location_name;
    private String address;
    private int city_id;
    private int pincode;


    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                ", address='" + address + '\'' +
                ", city_id=" + city_id +
                ", pincode=" + pincode +
                '}';
    }
}

