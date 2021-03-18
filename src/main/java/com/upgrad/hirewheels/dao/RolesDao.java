package com.upgrad.hirewheels.dao;
import com.upgrad.hirewheels.entities.Roles;
import com.upgrad.hirewheels.entities.Users;
//import com.upgrad.hirewheels.entities.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolesDao extends JpaRepository<Roles, Integer> {
    List< Roles> findByRoleId(int role_id);

}

