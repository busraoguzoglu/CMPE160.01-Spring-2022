package question;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;  
import java.util.*;

public class CityNavigator
{  

	public static int pathFinder(String startCity, String targetCity) {
		
		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		
		ArrayList<String> citiesAndDistances = new ArrayList<String>();
		try  
		{  
			//the file to be opened for reading  
			FileInputStream fis=new FileInputStream("cities_and_distances.txt");       
			Scanner sc=new Scanner(fis);    //file to be scanned  
			//returns true if there is another line to read  
			while(sc.hasNextLine())  
			{  
				String line = sc.nextLine();
				citiesAndDistances.add(line);
			}  
			sc.close();     //closes the scanner  
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		} 

		/* Variables */
		int totalDistance = 0;
		int shortestTotalDistance = 1000;
		boolean connected = false;
		ArrayList<String> finalPath = new ArrayList<String>();
		ArrayList<String> tempPath = new ArrayList<String>();

		//Find first city on the cities to select a starting point: 
		//(Just select the first that we find)
		int startIndex = -1;	
		for(int y = 0; y < citiesAndDistances.size(); y++) {

			char city1 = citiesAndDistances.get(y).charAt(0);
			char city2 = citiesAndDistances.get(y).charAt(2);

			if(startCity.charAt(0)==city1  || startCity.charAt(0)==city2) {
				startIndex = y;
				break;
			}
		}

		char location = startCity.charAt(0); // Shows the location we are in
		int checkIndex = startIndex; // Shows the index our location is in

		tempPath.add(citiesAndDistances.get(checkIndex));
		int currentDist = Character.getNumericValue(citiesAndDistances.get(checkIndex).charAt(4));

		for (int i = 0; i < 100000; i++) {

			if(tempPath.size() >= 5) {
				// We are possibly looping on same path
				// Select a different starting point and try again:
				Collections.shuffle(citiesAndDistances);

				for(int y = 0; y < citiesAndDistances.size(); y++) {

					char city1 = citiesAndDistances.get(y).charAt(0);
					char city2 = citiesAndDistances.get(y).charAt(2);

					if(startCity.charAt(0)==city1  || startCity.charAt(0)==city2) {
						checkIndex = y;
						break;
					}
				}


				location = startCity.charAt(0);
				tempPath = new ArrayList<String>();
				tempPath.add(citiesAndDistances.get(checkIndex));
				totalDistance = 0;
			}

			// Check if target city (secondCity) is connected to our current location:
			char city1 = citiesAndDistances.get(checkIndex).charAt(0);
			char city2 = citiesAndDistances.get(checkIndex).charAt(2);
			currentDist = Character.getNumericValue(citiesAndDistances.get(checkIndex).charAt(4));

			if(targetCity.charAt(0)==city1  || targetCity.charAt(0)==city2) {
				connected = true;
				totalDistance += currentDist;

				if(totalDistance < shortestTotalDistance) {
					shortestTotalDistance = totalDistance;
					finalPath = tempPath;
					tempPath = new ArrayList<String>();
				}

				// Select a different starting point and try again
				// We may be able to find a smaller path:
				Collections.shuffle(citiesAndDistances);

				for(int y = 0; y < citiesAndDistances.size(); y++) {

					char checkCity1 = citiesAndDistances.get(y).charAt(0);
					char checkCity2 = citiesAndDistances.get(y).charAt(2);

					if(startCity.charAt(0)==checkCity1  || startCity.charAt(0)==checkCity2) {
						checkIndex = y;
						break;
					}
				}

				tempPath.add(citiesAndDistances.get(checkIndex));
				location = startCity.charAt(0);
				totalDistance = 0;
				continue;
			}

			// Target city is not connected to our current location
			// Visit one of the connected cities to find a path
			else {
				// Randomize the array (to be able to choose different connected cities)
				Collections.shuffle(citiesAndDistances);

				//Change location, go to next city
				if(location==city1) {
					location = city2;
				}
				else if(location==city2) {
					location = city1;
				}

				// Try to find a city that our location is connected:
				// If there is no connected city, the variable will remain 0 after the loop
				char connectedCity = '0';

				for(int y = 0; y < citiesAndDistances.size(); y++) {

					char city1Check = citiesAndDistances.get(y).charAt(0);
					char city2Check = citiesAndDistances.get(y).charAt(2);

					if (city1Check==city1 && city2Check==city2) {
						continue;
					}
					else {
						if(location==city1Check){
							connectedCity = city2Check;
							checkIndex = y;
							break;
						}
						else if(location==city2Check){
							connectedCity = city1Check;
							checkIndex = y;
							break;
						}
					}

				}

				if(connectedCity == '0') {
					// Select a different starting point and try again:
					Collections.shuffle(citiesAndDistances);

					for(int y = 0; y < citiesAndDistances.size(); y++) {

						char checkCity1 = citiesAndDistances.get(y).charAt(0);
						char checkCity2 = citiesAndDistances.get(y).charAt(2);

						if(startCity.charAt(0)==checkCity1  || startCity.charAt(0)==checkCity2) {
							checkIndex = y;
							break;
						}
					}

					location = startCity.charAt(0);
					tempPath = new ArrayList<String>();
					tempPath.add(citiesAndDistances.get(checkIndex));
					totalDistance = 0;
					continue;
				}
				else {
					tempPath.add(citiesAndDistances.get(checkIndex));
					totalDistance += currentDist;
				}
			}


		}

		if(connected) {
			System.out.println("Found path is: " + finalPath);
			System.out.println(shortestTotalDistance);
			return shortestTotalDistance;
		}
		else  {
			System.out.println("No path has been found.");
			return 0;
		}
		
		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	}

}  