package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class VehicleServiceImpl {
@Autowired
    private VehicleDao vehicleDao;
@Autowired
    private Vehicle vehicle;
//@Autowired
  //private static VehicleServiceImpl instance;

   /* public Vehicle acceptUserTypeDetails(Vehicle vehicle) {
       return vehicleDao.save(vehicle);
    }*/

@Autowired
    public VehicleServiceImpl(VehicleDao vehicleDao, Vehicle vehicle) {
        this.vehicleDao = vehicleDao;
        this.vehicle = vehicle;
    }

    public VehicleServiceImpl() {
    }

    public void start()  {
         addVehicleDetails();



    }

    public Vehicle addVehicleDetails() {
       List< Vehicle> vehicle = Arrays.asList( new Vehicle(5,"Batmobile","JH05AN5799",2,"Blue",1,1,true,"https://imgd.aeplcdn.com/600x337/cw/ec/33136/BMW-M5-Exterior-172905.jpg?wm=0s=85"),

         new Vehicle(5, "Batmobile", "JH05AN5799", 2, "Blue", 1, 1, true, "https://imgd.aeplcdn.com/600x337/cw/ec/33136/BMW-M5-Exterior-172905.jpg?wm=0s=85"),

         new Vehicle(5, "Batmobile", "JH05AN5799", 2, "Blue", 1, 1, false, "https://imgd.aeplcdn.com/600x337/cw/ec/33136/BMW-M5-Exterior-172905.jpg?wm=0s=85"));
       vehicleDao.saveAll(vehicle);
        return (Vehicle) vehicle;
    }


}
