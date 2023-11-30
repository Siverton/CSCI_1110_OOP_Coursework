package code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOrganization 
{
	public static void main (String[] args)
	{
		//quick test to see that all methods work
		Scanner input = new Scanner(System.in);
		
		// create file object based on existing pilot and plane file or create a pilot and plane file if there isn't one already
		File mainPilotFile = new File("PilotData.txt");
		if (mainPilotFile.exists())
		{
			System.out.println("-Pilot file exists-");
		}
		else 
		{
			try 
			{
				PrintWriter fileCreator = new PrintWriter(mainPilotFile);
				fileCreator.print("");
				fileCreator.close();
			}
			catch (IOException e)
			{
				System.out.println("There was an error creating the PilotData.txt file.");
			}
		}
		
		File mainPlaneFile = new File("PlaneData.txt");
		if (mainPlaneFile.exists())
		{
			System.out.println("-Plane file exists-");
		}
		else 
		{
			try 
			{
				PrintWriter fileCreator = new PrintWriter(mainPlaneFile);
				fileCreator.print("");
				fileCreator.close();
			}
			catch (IOException e)
			{
				System.out.println("There was an error creating the PlaneData.txt file.");
			}
		}

		// ask user for the mode (Pilot search, plane search, pilot create, or exit)
		int modeSelect = 1; //generate the mode variable before it is used.
		while (modeSelect != 0)
		{
			System.out.println("Input (1)to search for a pilot (2)to search for a plane (3)to create a pilot and save it to a file (0)to exit the program");
			modeSelect = input.nextInt();
			
			if (modeSelect == 1)
			{
				// search the existing files for pilot information and displays it
				System.out.println("Please enter any information about the pilot you're looking for. (Input is case sensitive)");
				String pilotSearch = input.next();
				try
				{
					searchPilotArray(loadPilotFile(mainPilotFile),pilotSearch);
				}
				catch (IOException e)
				{
					System.out.println("There was an error loading the PilotData.txt file into Pilot objects.");
				}
			}
			else if (modeSelect == 2)
			{
				// search the existing files for plane information and displays it
				System.out.println("Please enter any information about the plane you're looking for. (Input is case sensitive)");
				String planeSearch = input.next();
				try
				{
					searchPlaneArray(loadPlaneFile(mainPlaneFile),planeSearch);
					
				}
				catch (IOException e)
				{
					System.out.println("There was an error loading the PlaneData.txt file into Plane objects.");
				}
			}
			else if (modeSelect == 3 )
			{
				// ask user for the pilot information and save it (info must use '_' instead of space)
				System.out.println("Please enter the pilot's codename.\n(All inputs cannot contian spaces. Use '_' instead)");
				String codeName = input.next();
				System.out.println("Please enter the pilot's name.");
				String name = input.next();
				System.out.println("Please enter the pilot's combat style.");
				String combatStyle = input.next();
				System.out.println("Please enter the pilot's symbols.");
				String symbols = input.next();
				System.out.println("Please enter the pilot's current status.");
				String nsStatus = input.next();
				System.out.println("Please enter the pilot's plane type.");
				String planeType = input.next();
				System.out.println("Please enter the pilot's alignment. (Enemy, Ally, or Unaligned)");
				String alignment = input.next();
				Pilot createPilot = new Pilot (codeName,name,combatStyle,symbols,nsStatus,planeType,alignment);
				try 
				{
					savePilotToEndOfFile (mainPilotFile, createPilot);
				}
				catch (IOException e)
				{
					System.out.println("There was a problem saving the pilot's data to the end of the file.");
				}
			}
			// covers any other integers entered by the user.
			else if (modeSelect >= 4 | modeSelect <= -1) 
			{
				System.out.println("Answer was out of bounds. Please try again.");
			}
			else {}
			
		}
		System.out.println("-Exiting Program-");
		input.close();
		System.exit(0);
	}
	
	//prints search results to the console
	public static void searchPilotArray (Pilot[] searchedPilotArray, String userInput)
	{
		for (int i = 0; i <= searchedPilotArray.length-1; i++)
		{
			if (searchedPilotArray[i].fileToString().contains(userInput))
			{
				System.out.println(searchedPilotArray[i].toString());
			}
		}
		System.out.println("-All Results Displayed-");
	}
	public static void searchPlaneArray (Plane[] searchedPlaneArray, String userInput)
	{
		for (int i = 0; i <= searchedPlaneArray.length-1; i++)
		{
			if (searchedPlaneArray[i].fileToString().contains(userInput))
			{
				System.out.println(searchedPlaneArray[i].toString());
			}
			else {}
		}
		System.out.println("-All Results Displayed-");
	}
	
	//loads file information into an array of the object type
	public static Pilot[] loadPilotFile (java.io.File mainFile) throws IOException
	{
		java.util.ArrayList<Pilot> pilotList = new java.util.ArrayList<Pilot>();
		Scanner reader = new Scanner(mainFile);
		
		while (reader.hasNext())
		{
			String readerCodeName = reader.next();
			String readerName = reader.next();
			String readerSymbols = reader.next();
			String readerCombatStyle = reader.next();
			String readernsStatus = reader.next();
			String readerPlaneType = reader.next();
			String readerAlignment = reader.next();
			Pilot createdPilot = new Pilot (readerCodeName, readerName, readerCombatStyle, readerSymbols , readernsStatus, readerPlaneType, readerAlignment);
			
			pilotList.add(createdPilot);
		}
		 reader.close();
		 
		 Pilot[] returnPilots = new Pilot[pilotList.size()];
		 return pilotList.toArray(returnPilots);
	}
	public static Plane[] loadPlaneFile (java.io.File mainFile) throws IOException
	{
		java.util.ArrayList<Plane> planeList = new java.util.ArrayList<Plane>();
		Scanner reader = new Scanner(mainFile);
		
		while (reader.hasNext())
		{
			String readerName = reader.next();
			double readerTopSpeed = reader.nextDouble();
			double readerStallSpeed = reader.nextDouble();
			double readerTurnSpeed = reader.nextDouble();
			String readerArmaments = reader.next();
			Plane createdPlane = new Plane (readerName, readerTopSpeed, readerStallSpeed, readerTurnSpeed, readerArmaments);
			
			planeList.add(createdPlane);
		}
		 reader.close();
		 
		 Plane[] returnPlanes = new Plane[planeList.size()];
		 return planeList.toArray(returnPlanes);
	}
	
	// Appends the existing files using information from a pilot and plane object.
	public static void savePilotToEndOfFile (java.io.File mainFile, Pilot inputPilot) throws IOException
	{
		//append file with input Pilot object
		try (FileWriter fw = new FileWriter(mainFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);)
		{
			pw.println(inputPilot.fileToString());
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}

	}
	public static void savePlaneToEndOfFile (java.io.File mainFile, Plane inputPlane) throws IOException
	{
		//append file with input Pilot object
		try (FileWriter fw = new FileWriter(mainFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);)
		{
			pw.println(inputPlane.fileToString());
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
	
	}

}
