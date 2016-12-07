package com.capgemini.mainapp;

import java.util.List;
import java.util.Scanner;

import com.capgemini.model.CustomerDetails;
import com.capgemini.service.bankTxnServiceImpl;
import com.capgemini.service.banktxnService;

public class MainApp {
	static banktxnService banktxnref;

	public static void main(String[] args) {
		
		MainApp mp=new MainApp();
		mp.readinginputsfromconsole();
	       
	
	}

	private  void readinginputsfromconsole() {
		   banktxnref= new bankTxnServiceImpl();
		   Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter customer first name:  ");
	       String custFirstName = in.next();
	       System.out.printf("Enter customer last name:  ");
	       String custLastName = in.next();
	       System.out.printf("Enter customer age:  ");
	       int age = in.nextInt();
	       System.out.printf("Enter customer presentaddress:  ");
	       String presentAddress = in.next();
	       System.out.printf("Enter customer permanentaddress:  ");
	       String permanentAddress = in.next();
	
	       CustomerDetails cd=new CustomerDetails();
	       cd.setAge(age);
	       cd.setFirstName(custFirstName);
	       cd.setLastName(custLastName);
	       cd.setPresentAddress(presentAddress);
	       cd.setPermanentAddress(permanentAddress);
	       int accountNumber= banktxnref.createaccount(cd);
	       System.out.println("Successfully created your account and A/C number is:"+accountNumber);
	     	    	
	       System.out.printf("Create another customer account: (Y/N)");
	       String custflag = in.next();
	       if(custflag!=null&& custflag.equals("Y")){
	    	   readinginputsfromconsole();
	       }else{
	    	   
	    	 banktxnref= new bankTxnServiceImpl();
	    	   
	    	List<CustomerDetails> cdList= banktxnref.findallcustomers();
	    	
	    	for (CustomerDetails customerDetails : cdList) {
				
	    		System.out.println("Name:"+customerDetails.getFirstName()+" "+customerDetails.getLastName()+" A/c Number "+customerDetails.getAcDeatils().getAccountNumber());
			}
	    	
	    	   System.exit(0);
	       }
	}
}
