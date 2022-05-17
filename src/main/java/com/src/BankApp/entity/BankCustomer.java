package com.src.BankApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankCustomer {
	@Id
	private long customer_id;
	private String customer_name;
	private long phone_num;
	private long balance;
	
	
	public BankCustomer(long customer_id, String customer_name, long phone_num, long balance) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.phone_num = phone_num;
		this.balance = balance;
	}
	
	public BankCustomer() {
		super();
	}
	
	@Override
	public String toString() {
		return "BankCustomer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", phone_num="
				+ phone_num + ", balance=" + balance + "]";
	}
	
	public long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}


	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
