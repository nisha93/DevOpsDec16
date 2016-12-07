package com.capgemini.service;

import java.util.List;

import com.capgemini.model.CustomerDetails;

public interface banktxnService {

	int createaccount(CustomerDetails cd);

	double showbalance(int accountNumber);

	String withdrwal(int accountNumber, double amount);
	
	List<CustomerDetails> findallcustomers();
	

}