package com.capgemini.service;

import java.util.List;

import com.capgemini.model.CustomerDetails;
import com.capgemini.repository.bankTxnRepository;
import com.capgemini.repository.bankTxnRepositoryImpl;

public class bankTxnServiceImpl implements banktxnService {

	bankTxnRepository repositoryInterface;
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.banktxnService#createaccount(com.capgemini.model.CustomerDetails)
	 */

	@Override
	public int createaccount(CustomerDetails cd){
		repositoryInterface=new bankTxnRepositoryImpl();

		return repositoryInterface.createaccount(cd);
	}

	/* (non-Javadoc)
	 * @see com.capgemini.service.banktxnService#showbalance(int)
	 */

	@Override
	public double showbalance(int accountNumber) {
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.capgemini.service.banktxnService#withdrwal(int, double)
	 */

	@Override
	public String withdrwal(int accountNumber, double amount) {
		
		return null;
	}

	@Override
	public List<CustomerDetails> findallcustomers() {
		repositoryInterface=new bankTxnRepositoryImpl();
		return repositoryInterface.findallcustomers();
	}
}
