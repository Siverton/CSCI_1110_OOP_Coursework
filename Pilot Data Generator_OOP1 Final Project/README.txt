# Pilot Generator and Pilot/Plane Search Program

## Synopsis
The purpose of this program is to store data for the Pilot and Plane objects in text files, so they can be retrieved later. 
It features a basic search engine and a way to add new pilots to the end of the PilotData.txt file(text file will be created on first run).

## Motivation
The purpose of the program is not necessarily for the best user experience. It's main purpose is to be adaptable into many different kinds of program. 
The FileOrganization class is disconnected from the Pilot and Plane classes, so they can be adapted to a project that would need their functions in the future. 

## How to Run
Open the code for the FileOrganization class in a java development environment and click the run icon in the top left. 
The PilotData.txt file will be created when the program is first started and will be able to be added to from inside the program thereafter.
It is recommended that you take a look at the PlaneData.txt file that came with the project in order to know what you can search for from inside the program. 

## Code Example
I struggled with a good way to search for specific aspects of a plane or pilot for a while. 
However, I landed on the idea that if someone wanted to search for all enemy pilots or all planes equipped with standard missiles, then all I'd need to do is have the program search for those aspects in the objects data by name. 
The fileToString method was intended to save the Pilot/Plane data to a file without the user friendly formating I gave the toString method, but it ended up serving a double purpose. 
The searchPlaneArray method is almost identical.
```
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
```