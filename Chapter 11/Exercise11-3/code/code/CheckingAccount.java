package code;

import java.util.Date;

public class CheckingAccount extends Account
{
	public static void main(String[] args) 
	{
		
	}
	private double overdraftLimit;
	
	public CheckingAccount()
	{
		id = 0000;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
		this.overdraftLimit = 0.0;
	}
	public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
		this.overdraftLimit = overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	//overrides account withdraw method
	public void withdraw(double amount)
	{
		if (amount > (balance + overdraftLimit))
			System.out.println("Cannot withdraw past overdraft limit");
		else
			balance = balance - amount;
	}
	public String toString()
	{
		return "Account ID: " + this.id + " Balance $" + this.balance + " Annual Interest Rate: " + this.annualInterestRate + " Date Created: " + this.dateCreated.toString() + " Overdraft Limit: " +  this.overdraftLimit; 
	}
}
