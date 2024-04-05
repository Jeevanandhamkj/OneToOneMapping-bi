package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.User;

public interface AddressRepo extends  JpaRepository<Address, Long> {

	void save(User u2);

	
	

}
