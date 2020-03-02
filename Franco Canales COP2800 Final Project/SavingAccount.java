package application;

import javax.swing.JOptionPane;

public class SavingAccount extends BankAccount{
 boolean status;
 
 
 
 public SavingAccount(double balance, double annualInterestRate) {
	super(balance, annualInterestRate);
	if (balance<25)
	{
	this.status = false;
	}
	else
	{
		this.status = true;
	}
	}


public void withDraw(double amount)
 {
	 if(status==false)
	 {
		 System.out.println("Inactive Account!");
		 JOptionPane.showMessageDialog(null, "Inactive Account!");
	 }
	 else
	 {
        withdraw(amount);
	 }
	 if(balance<25)
	 {
		 status=false;
	 }
	 else
	 {
		 status=true; 
	 }
 }
	
 
 public void Deposite(double amount)
 {
	 
	 if(status==false)
	 {
		 
		 balance=balance+(25-balance);
		 deposite(amount);
	 }
	 else
	 {
		 deposite(amount);
	 }
	 
	 
	 if(balance<25)
	 {
		 status=false;
	 }
	 else
	 {
		 status=true; 
	 }
 }
 
 public void MonthlyProcess()
 {
	 if(numberofwithdrawls<=4)
	 {
		 monthlyProcess();
	 }
	 else
	 {
		 monthlyServiceCharges++;
		 balance--;
		 monthlyProcess();
	 }
	 
	 if(balance<25)
	 {
		 status=false;
	 }
	 else
	 {
		 status=true; 
	 }
 }


@Override
public String toString() {
	return "SavingAccount [status=" + status + ", balance=" + balance + ", numberofdeposits_tm=" + numberofdeposits_tm
			+ ", numberofwithdrawls=" + numberofwithdrawls + ", annualInterestRate=" + annualInterestRate
			+ ", monthlyServiceCharges=" + monthlyServiceCharges + "]";
}
 

}
