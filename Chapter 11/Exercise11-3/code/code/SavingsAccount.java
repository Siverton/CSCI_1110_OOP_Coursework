package code;

import java.util.Date;

public class SavingsAccount extends Account
{
	public static void main(String[] args) 
	{
		
	}
	public SavingsAccount()
	{
		id = 0000;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}
	public SavingsAccount(int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}
	//overrides account withdraw method
	public void withdraw(double amount)
	{
		if (amount > balance)
			System.out.println("Cannot withdraw past balance amount");
		else
			balance = balance - amount;
	}
	public String toString()
	{
		return "Account ID: " + this.id + " Balance $" + this.balance + " Annual Interest Rate: " + this.annualInterestRate + " Date Created: " + this.dateCreated.toString(); 
	}
}
