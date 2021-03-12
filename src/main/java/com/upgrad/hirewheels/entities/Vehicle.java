package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    private int vehicle_id;
    private String vehicle_model;
    private String vehicle_number;
    private String vehicle_subcategory_id;
    private String color;
    private String  location_id;
    private int fuel_type_id;
    private Boolean    availability_status;
    private String vehicle_image_url;

    public Vehicle() {
    }

    public Vehicle(int vehicle_id, String vehicle_model, String vehicle_number, String vehicle_subcategory_id, String color, String location_id, int fuel_type_id, Boolean availability_status, String vehicle_image_url) {
        this.vehicle_id = vehicle_id;
        this.vehicle_model = vehicle_model;
        this.vehicle_number = vehicle_number;
        this.vehicle_subcategory_id = vehicle_subcategory_id;
        this.color = color;
        this.location_id = location_id;
        this.fuel_type_id = fuel_type_id;
        this.availability_status = availability_status;
        this.vehicle_image_url = vehicle_image_url;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getVehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }

    public void setVehicle_subcategory_id(String vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public int getFuel_type_id() {
        return fuel_type_id;
    }

    public void setFuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public Boolean getAvailability_status() {
        return availability_status;
    }

    public void setAvailability_status(Boolean availability_status) {
        this.availability_status = availability_status;
    }

    public String getVehicle_image_url() {
        return vehicle_image_url;
    }

    public void setVehicle_image_url(String vehicle_image_url) {
        this.vehicle_image_url = vehicle_image_url;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_model='" + vehicle_model + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", vehicle_subcategory_id='" + vehicle_subcategory_id + '\'' +
                ", color='" + color + '\'' +
                ", location_id='" + location_id + '\'' +
                ", fuel_type_id=" + fuel_type_id +
                ", availability_status=" + availability_status +
                ", vehicle_image_url='" + vehicle_image_url + '\'' +
                '}';
    }
}

