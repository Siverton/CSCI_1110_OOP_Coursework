import java.rmi.server.*;

class MyInteger 
{
	public static void main(String[] args) 
	{
		MyInteger intObject = new MyInteger(5);
		MyInteger intObject2 = new MyInteger(7);
		char[] characterArray = {'1', '2', '3', '4'};
		System.out.println("intObject value '5' is prime: " + intObject.isPrime());
		System.out.println("intObject value '5' is odd: " + intObject.isOdd());
		System.out.println("intObject value '5' is even: " + intObject.isEven());
		System.out.println("intObject value '5' is equal to intObject2 value '7' :" + intObject.equals(intObject2));
		System.out.println("intObject value '5' is equal to int '5' :" + intObject.equals(5));
		System.out.println("parseInt(\"1234\") = " + intObject.parseInt("1234"));
		System.out.println("parseInt(characterArray{'1','2','3','4'} = " + intObject.parseInt(characterArray));
		
	}
	
	private int value;
	
	public MyInteger()
	{
		value = 0;
	}
	
	public MyInteger(int inputValue)
	{
		value = inputValue;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public boolean isEven()
	{
		if (value % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isOdd()
	{
		if (value % 2 != 0)
			return true;
		else 
			return false;
	}
	
	public boolean isPrime()
	{
		if (value == 2)
			return true;
					
		if (isEven(value) == true)
			return false;
			
		for (int i = value - 1; i > 1; i--)
		{
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int testNum)
	{
		if (testNum % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(int testNum)
	{
		if (testNum % 2 != 0)
			return true;
		else 
			return false;	}
	
	public static boolean isPrime(int testNum)
	{
		if (testNum == 2)
			return true;
		
		if (isEven(testNum) == true)
			return false;
		
		for (int i = testNum - 1; i > 0; i--)
		{
			if (testNum == 1)
				break;
			if (testNum % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger testValue)
	{
		if (testValue.getValue() % 2 == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(MyInteger testValue)
	{
		if (testValue.getValue() % 2 != 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isPrime(MyInteger testValue)
	{
		if (testValue.getValue() == 2)
			return true;
		
		if (isEven(testValue.getValue()) == true)
			return false;
		
		for (int i = testValue.getValue() - 1; i > 0; i--)
		{
			if (testValue.getValue() == 1)
				break;
			if (testValue.getValue() % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int testNum)
	{
		if (testNum == value)
			return true;
		else 
			return false;
	}
	
	public boolean equals(MyInteger testValue)
	{
		if (testValue.getValue() == value)
			return true;
		else 
			return false;
	}
	
	public static int parseInt(char[] convArray)
	{
		String convString = String.valueOf(convArray);
		return Integer.parseInt(convString);
	}
	
	public static int parseInt(String convString)
	{
		return Integer.parseInt(convString);
	}
	
}