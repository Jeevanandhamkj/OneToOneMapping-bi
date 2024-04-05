package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.User;
import com.example.demo.Repository.AddressRepo;
import com.example.demo.Repository.UserRepo;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {
@Autowired
UserRepo userRepo;
@Autowired
AddressRepo addressRepo;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u1=new User();
		u1.setName("jeeva");
		u1.setEmail("jeevakathirvel3699@gmail.com");
		u1.setMobile("9842765347");
		
		User u2=new User();
		u2.setName("Sachin");
		u2.setEmail("sachinsrt@gmail.com");
		u2.setMobile("9842765347");
		
		Address a1=new Address();
		a1.setDoorNum(101);
		a1.setStreet("Xyz Street");
		a1.setCity("Pollachi");
		a1.setPincode("642129");
		Address a2=new Address();
		a2.setDoorNum(102);
		a2.setStreet("Xyz Street");
		a2.setCity("Mumbai");
		a2.setPincode("642000");
		
		a1.setUser(u1);
		u1.setAddress(a1);
		a2.setUser(u2);
		u2.setAddress(a2);
		addressRepo.save(u2);
		userRepo.save(u1);
		
	}

}
