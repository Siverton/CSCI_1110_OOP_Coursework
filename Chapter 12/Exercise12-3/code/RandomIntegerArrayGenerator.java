package code;
import java.util.Scanner;

public class RandomIntegerArrayGenerator 
{
	public static void main(String[] args) 
	{
		boolean arraySearched = false;
		int[] mainArray = generateIntArray();
		Scanner input = new Scanner(System.in);
		
		while (arraySearched == false)
		{
			System.out.print("An array of 100 integers has been generated. Please enter an array index: ");
			try 
			{
				int userIndexSearch = input.nextInt();
				System.out.println("Integer at array index: " + mainArray[userIndexSearch]);
				arraySearched = true;
			}
			//code in the try block has a chance of throwing the below runtime exception so I don't need to specify the exception in the above code. 
			catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Search is out of bounds. Enter a value between 0-99.");
			}
		}
		input.close();
	}
	
	public static int getRandomInt (int max)
	{
		return (int)(Math.floor(Math.random() * max));
	}
	
	public static int[] generateIntArray()
	{
		int[] intArray = new int[100];
		
		for (int i = 0; i <= 99; i++)
		{
			intArray[i] = getRandomInt(100);
		}
		
		return intArray;
	}
	
}
