package com.upgrad.hirewheels.dao;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import java.util.Optional;
public  interface UsersDao extends JpaRepository<Users,Integer>
{


    List <Users> findByFirstName(String first_name);
    List <Users> findByLastName(String last_name);

    //List <Users> findByEmail(String first_name);
    public  Optional<Users> findByEmail(String email);
    List <Users> findByMobileNo(String mobileNo);



}
