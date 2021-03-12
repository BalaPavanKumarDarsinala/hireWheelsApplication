package com.upgrad.hirewheels.dao;
import com.upgrad.hirewheels.entities.Roles;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RolesDao extends JpaRepository<Roles, Integer> {

}

