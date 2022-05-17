package com.src.BankApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.BankApp.dao.UserDAO;
import com.src.BankApp.entity.BankCustomer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private UserDAO userdao;
	
	@Override
	public List<BankCustomer> getUsers() {
		return userdao.findAll();
		
	}
	@Override
	public BankCustomer getUser(long customer_id) {
		return userdao.findById(customer_id).get();
		
	}
	
	@Override
	public BankCustomer addUser(BankCustomer user) {
		return userdao.save(user);
		
	}

}
