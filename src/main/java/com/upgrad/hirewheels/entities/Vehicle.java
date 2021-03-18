package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    @Column()
    private String vehicleModel;
    @Column()
    private String vehicleNumber;
  //  @ManyToOne(cascade = CascadeType.ALL)
  //  @JoinColumn()
    private int vehicleSubcategoryId;
    @Column()
    private String color;
    //@ManyToOne(cascade = CascadeType.ALL)
   // @JoinColumn()
    private int  locationId;
  //  @ManyToOne(cascade = CascadeType.ALL)
 //   @JoinColumn()
    private int fuelTypeId;
    @Column()
    private Boolean  availabilityStatus;
    @Column()
    private String vehicle_image_url;


    public Vehicle(int vehicleId, String vehicleModel, String vehicleNumber, int vehicleSubcategoryId, String color, int locationId, int fuelTypeId, Boolean availabilityStatus, String vehicle_image_url) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.color = color;
        this.locationId = locationId;
        this.fuelTypeId = fuelTypeId;
        this.availabilityStatus = availabilityStatus;
        this.vehicle_image_url = vehicle_image_url;
    }



    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public Boolean getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(Boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
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
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", color='" + color + '\'' +
                ", locationId=" + locationId +
                ", fuelTypeId=" + fuelTypeId +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicle_image_url='" + vehicle_image_url + '\'' +
                '}';
    }
}

