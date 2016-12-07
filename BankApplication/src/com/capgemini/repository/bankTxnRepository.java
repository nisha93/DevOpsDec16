package com.capgemini.repository;

import java.util.List;

import com.capgemini.model.CustomerDetails;

public interface bankTxnRepository {

	int createaccount(CustomerDetails cd);
	double showbalance(int accountNumber);
	String withdrwal(int accountNumber,double amount);
	List<CustomerDetails> findallcustomers();

}