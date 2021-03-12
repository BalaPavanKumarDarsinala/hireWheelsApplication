package com.upgrad.hirewheels;
import com.upgrad.hirewheels.dao.RolesDao;
import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.entities.Roles;
import com.upgrad.hirewheels.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class HireWheelsApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		UsersDao usersDao = context.getBean(UsersDao.class);
		RolesDao rolesDao = context.getBean(RolesDao.class);
		Users customer1 = new Users();
		customer1.setUser_id(1);
		customer1.setFirst_name("Bala");
		customer1.setLast_name("Pavan");
		customer1.setEmail("balapavan1018@gmail.com");
		customer1.setMobile_no("9542859519");
		customer1.setPassword("bala1018");
		customer1.setRole_id(1);
		customer1.setWallet_money(999.00);

		Users customer2 = new Users();
		customer2.setUser_id(2);
		customer2.setFirst_name("Ifrah");
		customer2.setLast_name("Malik");
		customer2.setEmail("ifrah@gmail.com");
		customer2.setMobile_no("940081718");
		customer2.setPassword("If#123");
		customer2.setRole_id(1);
		customer2.setWallet_money(999.00);

		Users customer3 = new Users();
		customer3.setUser_id(3);
		customer3.setFirst_name("Akash");
		customer3.setLast_name("Sinha");
		customer3.setEmail("Akash@gmail.com");
		customer3.setMobile_no("940081717");
		customer3.setPassword("AK#123");
		customer3.setRole_id(1);
		customer3.setWallet_money(999.00);

		Users customer4 = new Users();
		customer4.setUser_id(4);
		customer4.setFirst_name("satheesh");
		customer4.setLast_name("kumar");
		customer4.setEmail("saths@gmail.com");
		customer4.setMobile_no("9090909090");
		customer4.setPassword("Sa#1235");
		customer4.setRole_id(1);
		customer4.setWallet_money(999.00);

		Users customer5 = new Users();
		customer5.setUser_id(5);
		customer5.setFirst_name("ishwar");
		customer5.setLast_name("abc");
		customer5.setEmail("ishwar@gmail.com");
		customer5.setMobile_no("940081700");
		customer5.setPassword("Sa#1235");
		customer5.setRole_id(1);
		customer5.setWallet_money(999.00);

     /*Roles role1 = new Roles();
     role1.setRole_id(1);
     role1.setRole_name("Hai");
     rolesDao.save(role1);*/



		usersDao.saveAll(List.of(customer1, customer2, customer3, customer4, customer5));

		System.out.println("*************find by theatre name*************");

		usersDao.findByFirstName("Bala")
				.forEach(users -> System.out.println(users.getFirst_name()));



	}

}
