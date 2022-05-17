package com.src.BankApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.BankApp.entity.BankCustomer;

public interface UserDAO extends JpaRepository<BankCustomer, Long>{
}
