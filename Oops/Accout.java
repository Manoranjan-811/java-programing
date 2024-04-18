package Oops;
class Account{
	String accountNo;
	String cusName;
	double balance;
	public Account(String accountNo,String cusName,double balance) {
	this.accountNo=accountNo;
	this.cusName=cusName;
	this.balance=balance;
	}
	void deposite(double amount) {
		balance +=amount;
	}
	void widraw(double amount) {
		balance -=amount;
	}
}	
	
class Bank{
	Account[]accounts;
	public Bank(int maxAccount) {
		this.accounts=new Account[maxAccount];j
	}
	
}

