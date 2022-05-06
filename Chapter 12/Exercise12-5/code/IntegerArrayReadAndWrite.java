package code;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class IntegerArrayReadAndWrite 
{
	public static void main (String[] args) throws IOException 
	{
		java.io.File mainFile = new java.io.File("Exercise12_15.txt");
		int[] writtenArray = generateIntArray();
		
		//check if file exists and create one if it doesn't
		if (mainFile.exists())
		{
			System.out.println("File already exists.");
		}
		else 
		{
			java.io.PrintWriter arrayWriter = new java.io.PrintWriter(mainFile);
			//create and write array to file object with PrintWriter
			for (int i = 0; i <= writtenArray.length - 1; i++)
			{
				arrayWriter.print (writtenArray[i] + " ");
			}
			arrayWriter.close();
		}
		
		//read the new file
		Scanner arrayReader = new Scanner(mainFile);
		Integer[] readArray = new Integer[100];
		for (int i = 0; i <= readArray.length - 1; i++)
		{
			readArray[i] = Integer.valueOf(arrayReader.nextInt()); 
		}
		arrayReader.close();
		
		//display the array from lowest to highest value
		java.util.ArrayList<Integer> arraySorted = new java.util.ArrayList<Integer>(Arrays.asList(readArray));
		java.util.Collections.sort(arraySorted);
		arraySorted.toArray(readArray);
		
		for (int i = 0; i <= readArray.length - 1; i++)
		{
			System.out.print(readArray[i] + " ");
		}
		
	}
	
	public static int getRandomInt (int max)
	{
		return (int)(Math.floor(Math.random() * max));
	}
	
	//creates an array of 100 integers
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

