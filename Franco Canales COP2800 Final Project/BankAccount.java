package application;
public abstract class BankAccount {
    	double balance;
	int numberofdeposits_tm;
	int numberofwithdrawls;
	double annualInterestRate;
	double monthlyServiceCharges;
	
	public BankAccount(double balance, double annualInterestRate) {
		super();
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		numberofdeposits_tm=0;
		numberofwithdrawls=0;
	}
	
	public void deposite(double amount)
	{
		numberofdeposits_tm++;
		balance=balance+amount;
		
	}
	
	public void withdraw(double amount)
	{
	numberofwithdrawls++;
	
	balance=balance-amount;
	}

	public void calInterest()
	{
		double montlyInterestRate=annualInterestRate/12;
		double montlyInterest=balance*montlyInterestRate;
		balance=balance+montlyInterest;
	}
	
	
	public void monthlyProcess()
	{
	balance=balance-monthlyServiceCharges;
	calInterest();
	 numberofdeposits_tm=0;
	 numberofwithdrawls=0;
	 monthlyServiceCharges=0;
	
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumberofdeposits_tm() {
		return numberofdeposits_tm;
	}

	public void setNumberofdeposits_tm(int numberofdeposits_tm) {
		this.numberofdeposits_tm = numberofdeposits_tm;
	}

	public int getNumberofwithdrawls() {
		return numberofwithdrawls;
	}

	public void setNumberofwithdrawls(int numberofwithdrawls) {
		this.numberofwithdrawls = numberofwithdrawls;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyServiceCharges() {
		return monthlyServiceCharges;
	}

	public void setMonthlyServiceCharges(double monthlyServiceCharges) {
		this.monthlyServiceCharges = monthlyServiceCharges;
	}
	

}
