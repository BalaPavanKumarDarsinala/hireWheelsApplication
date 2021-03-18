package com.upgrad.hirewheels;

import com.upgrad.hirewheels.dao.*;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication

public  class HireWheelsApplication  {




	public static void main(String[] args) throws UserAlreadyExistsException {


		ApplicationContext context = SpringApplication.run(HireWheelsApplication.class, args);
		UsersDao usersDao = context.getBean(UsersDao.class);
		RolesDao rolesDao = context.getBean(RolesDao.class);
		LocationDao locationDAO = context.getBean(LocationDao.class);
		VehicleCategoryDao vehicleCategoryDao = context.getBean(VehicleCategoryDao.class);
		FuelTypeDao fuelTypeDao = context.getBean(FuelTypeDao.class);
		CityDao cityDao = context.getBean(CityDao.class);
		VehicleSubCategoryDao vehicleSubCategoryDao = context.getBean(VehicleSubCategoryDao.class);
		HireWheelsApplication hireWheelsApplication = context.getBean(HireWheelsApplication.class);
       UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        //UserService userService = context.getBean(UserService.class);
		InitServiceImpl initService = context.getBean(InitServiceImpl.class);
		//userServiceImpl.start();
		VehicleServiceImpl vehicleServiceImpl = context.getBean(VehicleServiceImpl.class);
		initService.start();
		vehicleServiceImpl.start();
		try {

			userServiceImpl.createAccount();
		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}
		//initService.start();
		//Users adminUser = new Users("Upgrad","Admin","admin@123","upgrad@gmail.com", "9999999999", 10000);
		//usersDao.save(adminUser);

		/*Users customer1 = new Users();
		customer1.setUserId(3);
		customer1.setFirstName("Bala");
		customer1.setLastName("Pavan");
		customer1.setEmail("balapavan1018@gmail.com");
		customer1.setMobileNo("954285951");
		customer1.setPassword("bala1018");
		//customer1.setRoleId(rolesDao.getOne(1));
		customer1.setWallet_money(999);


		Users customer2 = new Users();
		customer2.setUserId(4);
		customer2.setFirstName("ifrah");
		customer2.setLastName("Malik");
		customer2.setEmail("ifrah@gmail.com");
		customer2.setMobileNo("940081718");
		customer2.setPassword("If#123");
		//customer2.setRoleId(rolesDao.getOne(2));
		customer2.setWallet_money(999);

		Users customer3 = new Users();
		customer3.setUserId(5);
		customer3.setFirstName("Akash");
		customer3.setLastName("Sinha");
		customer3.setEmail("Akash@gmail.com");
		customer3.setMobileNo("940081717");
		customer3.setPassword("AK#123");
		//customer3.setRoleId(rolesDao.getOne(2));
		customer3.setWallet_money(999);

		Users customer4 = new Users();
		customer4.setUserId(6);
		customer4.setFirstName("satheesh");
		customer4.setLastName("kumar");
		customer4.setEmail("saths@gmail.com");
		customer4.setMobileNo("9090909090");
		customer4.setPassword("Sa#1235");
		//customer4.setRoleId(rolesDao.getOne(2));
		customer4.setWallet_money(999);

		Users customer5 = new Users();
		customer5.setUserId(7);
		customer5.setFirstName("ishwar");
		customer5.setLastName("abc");
		customer5.setEmail("ishwar@gmail.com");
		customer5.setMobileNo("940081700");
		customer5.setPassword("Sa#1235");
		//customer5.setRoleId(rolesDao.getOne(2));
		customer5.setWallet_money(999);

		//usersDao.saveAll(List.of(customer1,customer2,customer3,customer4,customer5));


		System.out.println("*************find by first name*************");

		usersDao.findByFirstName("Bala")
				.forEach(users -> System.out.println(users.getFirstName()));

		System.out.println("*************find by last name*************");
		usersDao.findByLastName("Pavan")
				.forEach(users -> System.out.println(users.getLastName()));


		//usersDao.findByEmail("balapavan1018@gmail.com")
			//.forEach(users -> System.out.println(users.getEmail()));

		System.out.println("*************find by mobile number*************");


		usersDao.findByMobileNo("954285951")
				.forEach(users -> System.out.println(users.getMobileNo()));
		Roles roles1 = new Roles();
		roles1.setRoleId(1);
		roles1.setRoleName("Admin");
		rolesDao.save(roles1);

		Roles roles2 = new Roles();
		roles2.setRoleId(2);
		roles2.setRoleName("User");
		rolesDao.save(roles2);

		List<Roles> userRoleList = Arrays.asList(new Roles(2, "Admin"),
				new Roles(3,"User"));
		rolesDao.saveAll(userRoleList);

		List<FuelType> fuelTypeList = Arrays.asList(new FuelType(4,"Petrol"), new FuelType(5, "Diesel"));
		fuelTypeDao.saveAll(fuelTypeList);


		List<VehicleSubCategory> vehicleSubCategories = Arrays.asList(new VehicleSubCategory(6, "SUV",
						300),

				new VehicleSubCategory(7, "SEDAN",
						350),

				new VehicleSubCategory(8, "HATCHBACK",
						250 ),
				new VehicleSubCategory(9, "CRUISER",
						200 ),

				new VehicleSubCategory(10, "DIRT BIKE",
						200 ),

				new VehicleSubCategory(11, "SPORTS BIKE",
						150 ));
		vehicleSubCategoryDao.saveAll(vehicleSubCategories);

		List<VehicleCategory> vehicleCategoryList = Arrays.asList(new VehicleCategory(10, "CAR"),
				new VehicleCategory(12,"BIKE"));
		vehicleCategoryDao.saveAll(vehicleCategoryList);

		Location location = new Location(13, "Worli",
				"Dr E Moses Rd, Worli Naka, Upper Worli",400018);
		locationDAO.save(location);
		location= new Location(14, "Chembur",
				"Optic Complex",400019);
		locationDAO.save(location);
		location = new Location(15, "Powai",
				"Hiranandani Tower",400020);
		locationDAO.save(location);

		  cityDao.save(new City(16,"Mumbai"));*/

		/*ServiceFactory serviceFactory = new ServiceFactory();
		UserService userService = serviceFactory.getUserService();*/





	}

}
