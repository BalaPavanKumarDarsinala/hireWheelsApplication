package com.upgrad.hirewheels.services;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.dao.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


import javax.persistence.Entity;
import java.util.List;
@Service
public  class InitServiceImpl  {

    @Autowired
    RolesDao rolesDao;

    @Autowired
    UsersDao usersDao;

    @Autowired
    VehicleCategoryDao vehicleCategoryDao;

    @Autowired
    VehicleSubCategoryDao vehicleSubCategoryDao;

    @Autowired
    CityDao cityDao;

    @Autowired
    FuelTypeDao fuelTypeDao;

    @Autowired
    LocationDao locationDao;

   // @Autowired
    //DTOEntityConverter dtoEntityConverter;
    public  void start() {
        addUserRole();
        addUser();
        addVehicleCategory();
        addVehicleSubCategory();
        addCity();
        addFuelType();
        addLocation();
    }

    private void addLocation() {
        Location location = new Location(1, "Worli",
                "Dr E Moses Rd, Worli Naka, Upper Worli",400018);
        locationDao.save(location);
        location = new Location(2, "Chembur",
                "Optic Complex",400019);
        locationDao.save(location);
        location = new Location(3, "Powai",
                "Hiranandani Tower",400020);
        locationDao.save(location);
    }

    private void addFuelType() {
        List<FuelType> fuelTypeList = Arrays.asList(new FuelType(1,"Petrol"), new FuelType(2, "Diesel"));
        fuelTypeDao.saveAll(fuelTypeList);
    }

    private void addCity() { cityDao.save(new City(1,"Mumbai")); }

    private void addVehicleCategory() {
        List<VehicleCategory> vehicleCategoryList = Arrays.asList(new VehicleCategory(10, "CAR"),
                new VehicleCategory(11,"BIKE"));
        vehicleCategoryDao.saveAll(vehicleCategoryList);
    }
    private void addVehicleSubCategory() {
        List<VehicleSubCategory> vehicleSubCategories = Arrays.asList(new VehicleSubCategory(1, "SUV",
                300),

       new VehicleSubCategory(2, "SEDAN",
                350),

       new VehicleSubCategory(3, "HATCHBACK",
                250 ),
                new VehicleSubCategory(4, "CRUISER",
                200 ),

       new VehicleSubCategory(5, "DIRT BIKE",
                200 ),

      new VehicleSubCategory(11, "SPORTS BIKE",
                150 ));
vehicleSubCategoryDao.saveAll(vehicleSubCategories);


    }

    private void addUserRole() {

        List<Roles> userRoleList = Arrays.asList(new Roles(1, "Admin"),
                new Roles(2,"User"));
        rolesDao.saveAll(userRoleList);
    }


    private void addUser() {
        Users adminUser = new Users("Upgrad","Admin","admin@123","upgrad@gmail.com", "9999999999", 10000);
        usersDao.save(adminUser);
    }


}