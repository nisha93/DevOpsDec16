package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.AccountDetails;
import com.capgemini.model.CustomerDetails;

public class bankTxnRepositoryImpl implements bankTxnRepository {

	//Map<AccountDetails,CustomerDetails> mapaccountcustomer=new HashMap<AccountDetails,CustomerDetails>();
static List<CustomerDetails> cdList=new ArrayList<CustomerDetails>();
static	int seqNumber=2000;
	
	@Override
	public int createaccount(CustomerDetails cd){
		AccountDetails ad=new AccountDetails();
		seqNumber=seqNumber+10;
		ad.setAccountNumber(seqNumber);
		ad.setAcountBalance(1500);
		cd.setAcDeatils(ad);
		
		cdList.add(cd);
		return seqNumber;
	}

	@Override
	public double showbalance(int accountNumber) {
		
		return 0;
	}

	@Override
	public String withdrwal(int accountNumber, double amount) {
		
		return null;
	}

	@Override
	public List<CustomerDetails> findallcustomers() {
		
		return cdList;
	}
	
}
