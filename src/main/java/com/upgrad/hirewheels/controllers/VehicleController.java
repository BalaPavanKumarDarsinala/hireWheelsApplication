package com.upgrad.hirewheels.controllers;
import com.upgrad.hirewheels.dto.VehicleDto;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.services.UserService;
import com.upgrad.hirewheels.services.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VehicleController {

    VehicleService vehicleService;


    ModelMapper modelmapper;

    @GetMapping(value = "/vehicle/{id}")

    public ResponseEntity getVehicleDetails(@PathVariable(name = "id") int id)  {
        Vehicle responseVehicle = vehicleService.getVehicleDetails(id);
        VehicleDto responseVehicleDto = modelmapper.map(responseVehicle.getVehicleId(), VehicleDto.class);
        return new ResponseEntity<>(responseVehicleDto, HttpStatus.OK);
    }
}
