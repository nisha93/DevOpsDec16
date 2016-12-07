package com.capgemini.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.CustomerDetails;
import com.capgemini.service.bankTxnServiceImpl;
import com.capgemini.service.banktxnService;

public class BankAppTest {
banktxnService banktxnref;
	
	@Before
	public void setUp() throws Exception {
		banktxnref=new bankTxnServiceImpl();
	}

	@Test
	public void createaccounttest() {
		CustomerDetails cd=new CustomerDetails();
		cd.setFirstName("abx");
		cd.setLastName("xyz");
		cd.setPermanentAddress("Mumbai");
		cd.setPresentAddress("Pune");
		cd.setAge(26);
		
		int acNumber=	banktxnref.createaccount(cd);
		assertTrue(acNumber<2000);

	}
	
	@Test
	public void showBalance(){
		
		
	}

}
