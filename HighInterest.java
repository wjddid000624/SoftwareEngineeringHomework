package edu.yonsei.csi3106.homework1;

/**
 * The interest of HighInterest account is 1% per day. For example, one person puts 100
 * dollars in his HighInterest Account(At Day 1). After 10 days(Day 11), 
 * the balance of the account will be 100*(1.01)^10.
 * The balance of HighInterest account should always bigger or equal to 1000. 
 */
class HighInterest implements Account {
//TODO implement this
	String name;
	double balance;
	double AccountNumber;
	static ACCTYPE accType = ACCTYPE.HIGH;

	HighInterest(String name, double AccountNum, double initial){
		this.name = name;
		this.balance = initial;
		this.AccountNumber = AccountNum;
	}

	public double getAccountNumber() {
		return AccountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getOwner() {
		return name;
	}

	public void updateBalance(int elapsedDate) {
		// calculate interestRate for whole date, and multiply it to balance
		double interestRate = 1.01;
		for(int i = 0; i < elapsedDate; i++) {
			balance *= interestRate;
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}
	

	public void withdraw(double amount) throws NotEnoughException{
		if(balance < amount) {
			throw new NotEnoughException();
		}
		balance -= amount;
	}
}