import java.util.Date;
// Class for account
class Account 
{
	public static void main(String[] args) 
	{
		Account myAccount = new Account(1122, 20000, 4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		Date date = myAccount.getDateCreated();
		System.out.printf("The account balance is: $%.2f\n", myAccount.getBalance());
		System.out.printf("The account monthly interest is: $%.2f\n", myAccount.getMonthlyInterest());
		System.out.println("The account was created on: " + date.toString());
	}
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		id = 0000;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}
	
	public Account(int newId, double newBalance, double newRate)
	{
		id = newId;
		balance = newBalance;
		annualInterestRate = newRate;
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
		
	public void setId(int idInput){
		id = idInput;}
	
	public void setBalance(double balanceInput){
		balance = balanceInput;}
	
	public void setAnnualInterestRate(double rateInput){
		annualInterestRate = rateInput;}
		
	public double getMonthlyInterestRate(){
		return (annualInterestRate / 100) / 12;}	
		
	public double getMonthlyInterest(){
		return balance * ((annualInterestRate / 100) / 12);}
		
	public void withdraw(double amount){
		balance = balance - amount;}
		
	public void deposit(double amount){
		balance = balance + amount;}
	
	
}