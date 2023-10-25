package code;

import java.util.Date;
//Class for account
public class Account 
{
	public static void main(String[] args) 
	{
		
		Account testAccount = new Account();
		CheckingAccount testCheckAccount = new CheckingAccount();
		SavingsAccount testSaveAccount = new SavingsAccount();
		
		System.out.println(testAccount.toString());
		System.out.println(testCheckAccount.toString());
		System.out.println(testSaveAccount.toString());
	}
	
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date dateCreated;
	
	public Account()
	{
		id = 0000;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}
	
	public int getId(){
		return id;}
	
	public double getBalance(){
		return balance;}
		
	public double getAnnualInterestRate(){
		return annualInterestRate;}
		
	public Date getDateCreated(){
		return dateCreated;}
		
	public void setId(int id){
		this.id = id;}
	
	public void setBalance(double balance){
		this.balance = balance;}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;}
		
	public double getMonthlyInterestRate(){
		return (annualInterestRate / 100) / 12;}	
		
	public double getMonthlyInterest(){
		return balance * ((annualInterestRate / 100) / 12);}
		
	public void withdraw(double amount){
		balance = balance - amount;}
		
	public void deposit(double amount){
		balance = balance + amount;}
	
	public String toString()
	{
		return "Account ID: " + this.id + " Balance $" + this.balance + " Annual Interest Rate: " + this.annualInterestRate + " Date Created: " + this.dateCreated.toString(); 
	}
	
}
