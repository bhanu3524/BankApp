package com.src.BankApp.services;

import com.src.BankApp.entity.BankCustomer;

import java.util.List;

public interface CustomerService {

	 List<BankCustomer> getUsers();
	
	 BankCustomer getUser(long customer_id);
	 
	 public BankCustomer addUser(BankCustomer user);
	
}
