package com.yedam.object;

// private <-> public.

public class Bank {
	private String accountNo; // unique. 11-23-1234
	private String owner; // 예금주 홍길동.
	private int balance; // 잔고. 1000
	// 메소드. getter/ setter

	void setAccountNo(String acNo) {
		accountNo = acNo;
	}
	String getAccountNo() {
		return accountNo;
	}
	void setOwner(String owner) {
		this.owner = owner;
	}
	String getOwner() {
		return this.owner;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	int getBalance() {
		return this.balance;
	}

}
