package com.capgemini.model;

public class BankDetails {

	private int bankId, branchCode;
	private String bankName, bankAuthCode, ifscCode;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAuthCode() {
		return bankAuthCode;
	}

	public void setBankAuthCode(String bankAuthCode) {
		this.bankAuthCode = bankAuthCode;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

}
