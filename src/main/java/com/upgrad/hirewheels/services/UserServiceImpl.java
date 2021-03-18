package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public  class UserServiceImpl {
 @Autowired
private UsersDao usersDao;

 private  Users users;
    private static UserServiceImpl instance;

    public Users acceptUserTypeDetails(Users users) {
        return usersDao.save(users);
    }



    public UserServiceImpl(UsersDao usersDao, Users users) {
        this.usersDao = usersDao;
        this.users = users;
    }

    private UserServiceImpl () {}

    public static UserServiceImpl getInstance() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }

    public Users start() throws UserAlreadyExistsException {
createAccount();


        return null;
    }


   /* @Override
    public boolean login(Users users) throws Exception {
        return false;
    }

    @Override
    public boolean register(Users users) throws Exception {
        return false;
    }


    public Users getEmail(String email) throws UserAlreadyExistsException {
        return usersDao.findByEmail(email)
                .orElseThrow(
                        () -> new UserAlreadyExistsException("UserType not found with userTypeName: " + email)
                );
    }
@Override
    public Users getId(int id) throws UserAlreadyExistsException {
        return usersDao.findById(id)
                .orElseThrow(
                        () -> new UserAlreadyExistsException("UserType not found with id: " + id)
                );
    }*/

    /*public Users createAccount(String email,String password) throws UserAlreadyExistsException {
        Users savedEmail = getByEmailAndPassword(email,password);
        savedEmail.setEmail(email);

        //savedEmail.setEmail("bala");
        return savedEmail;*/
    public Users createAccount() throws UserAlreadyExistsException{
        Users adminUser = new Users("Upgrad","Admin","admin@123","upgrad@gmail.com", "9999999999", 10000);
      return   usersDao.save(adminUser);

    }

    public Users getByEmail(int userId) {

        return users;
    }
}





