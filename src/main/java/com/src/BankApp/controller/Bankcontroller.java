package com.src.BankApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.src.BankApp.entity.BankCustomer;
import com.src.BankApp.services.CustomerServiceImpl;


@RestController
public class Bankcontroller {
	
	@Autowired                              
	private CustomerServiceImpl customerSer;
	
	@GetMapping("/users")
	public List<BankCustomer> getUsers() {
		return this.customerSer.getUsers();
	}
	
	@PostMapping("/add_users")
	public BankCustomer addUser(@RequestBody BankCustomer user) {
		return this.customerSer.addUser(user);
	}	
	

}
