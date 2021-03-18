package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class VehicleSubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int vehicleSubcategoryId;
    private  String vehicleSubcategoryName;
    private  float  pricePerDay;
  //  @ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn()
   // private VehicleCategory  vehicleCategoryId;

    public VehicleSubCategory(int vehicleSubcategoryId, String vehicleSubcategoryName, float pricePerDay) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.vehicleSubcategoryName = vehicleSubcategoryName;
        this.pricePerDay = pricePerDay;
        //this.vehicleCategoryId = vehicleCategoryId;
    }



    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public VehicleSubCategory() {
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

   // public VehicleCategory getVehicleCategoryId() {
      //  return vehicleCategoryId;
    //}

  //  public void setVehicleCategoryId(VehicleCategory vehicleCategoryId) {
   //     this.vehicleCategoryId = vehicleCategoryId;
    //}

    @Override
    public String toString() {
        return "VehicleSubCategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }


}
