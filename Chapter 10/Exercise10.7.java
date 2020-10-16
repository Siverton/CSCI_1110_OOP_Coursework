import java.util.Date;
import java.util.Scanner;
// Class for account
class Account 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Account[] accountArray = new Account[10];
		
		for (int i = 0; i < 10; i++)
		{
			accountArray[i] = new Account(i, 100, 0);
		}
		
		int userAccountID = -1;
		int userAction = -1;
		while (true)
		{
			// entering your account ID number.
			while (true)
			{
				System.out.print("Please enter your account ID number: ");
				userAccountID = input.nextInt();
				
				// checks if the number is valid.
				if (userAccountID < 0 | userAccountID > 9)
				{
					System.out.println("Incorrect Input");
					continue;
				}
				break;
			}
			
			while (true)
			{
			// choosing an account action
				while (true)
				{
					System.out.print("Please enter an action [1]View Account balance [2]Withdraw [3]Deposit [4]Exit: ");
					userAction = input.nextInt();
					
					// checks if the number is valid.
					if (userAction < 1 | userAction > 4)
					{
						System.out.println("Incorrect Input");
						continue;
					}
					break;
				}
				// action is taken
				if (userAction == 1)
				{
					System.out.printf("Your account balance is: $%.2f\n", accountArray[userAccountID].getBalance());
				}
				else if (userAction == 2)
				{
					System.out.print("How much would you like to withdraw from your account? ");
					double withdrawAmount = input.nextDouble();
					accountArray[userAccountID].withdraw(withdrawAmount);
				}	
				else if (userAction == 3)
				{
					System.out.print("How much would you like to deposit into your account? ");
					double depositAmount = input.nextDouble();
					accountArray[userAccountID].deposit(depositAmount);
				}	
				else if (userAction == 4)
					break;
				
			}
		}
	

		
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
