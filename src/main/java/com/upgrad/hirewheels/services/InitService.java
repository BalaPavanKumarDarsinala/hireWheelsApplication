package com.upgrad.hirewheels.services;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.dao.*;
public interface InitService {
Users addUser(Users users);
Roles addUserRole(Roles roles);
VehicleSubCategory addVehicleSubCategory(VehicleSubCategory vehicleSubCategory);
VehicleCategory addVehicleCategory(VehicleCategory vehicleCategory);
City addCity(City city);
FuelType addFuelType(FuelType fuelType);
Location addLocation(Location location);

}
