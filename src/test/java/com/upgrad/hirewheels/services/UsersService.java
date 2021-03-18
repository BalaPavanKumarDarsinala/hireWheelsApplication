package com.upgrad.hirewheels.services;
import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
@SpringBootTest
public class UsersService {
    @Mock
    private UsersDao usersDao;

    @InjectMocks
    private UserServiceImpl userService;
    @BeforeEach
    public void setupMockito() {
        Mockito.when(usersDao.save(new Users("save test"))).thenReturn(new Users(1, "save test"));

        Mockito.when(usersDao.findById(1)).thenReturn(Optional.of(new Users(1, "save test")));
        Mockito.when(usersDao.save(new Users(1, "update test"))).thenReturn(new Users(1, "update test"));

        Mockito.when(usersDao.save(new Users("get test"))).thenReturn(new Users(1, "get test"));
        Mockito.when(usersDao.findByEmail("get test")).thenReturn(Optional.of(new Users(1, "get test")));
    }

    @Test
    public void testAcceptUserDetails() throws UserAlreadyExistsException {
        Users users = new Users();
        users.setEmail("save test");

        Users savedUsers = userService.start( );

       Assertions.assertNull(savedUsers);
        Assertions.assertTrue(savedUsers.getUserId() != 0);
       Assertions.assertEquals("save test", savedUsers.getEmail());
    }
    @Test
    public void testGetUserDetails() throws UserAlreadyExistsException {
        Users users = new Users();
        users.setEmail("save test");
        users  = userService.acceptUserTypeDetails( users);

        Users savedUsers = userService.getByEmail(users.getUserId());
        Assertions.assertNotNull(savedUsers);
        Assertions.assertTrue(savedUsers.getUserId() != 0);
        Assertions.assertEquals("save test", savedUsers.getEmail());
    }

}
