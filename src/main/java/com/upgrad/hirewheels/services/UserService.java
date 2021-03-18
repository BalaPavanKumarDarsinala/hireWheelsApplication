package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;

public interface UserService {

    public Users acceptUserTypeDetails(Users users);

    public Users createUser();
public Users createAccount();
    public Users getByEmail(String email) throws UserAlreadyExistsException;
    public boolean login(Users users) throws Exception;
    public boolean register(Users users) throws Exception;
    public Users getId(int id) throws UserAlreadyExistsException;
   /* public UserType getUserTypeDetails(int id) throws UserTypeDetailsNotFoundException;
    public UserType getUserTypeDetailsFromUserTypeName(String userType) throws UserTypeDetailsNotFoundException;
    public boolean deleteUserType(int id) throws UserTypeDetailsNotFoundException;
    public List<UserType> getAllUserTypeDetails();*/

}
