import java.io.*;
import java.util.*;
import java.util.Random;

public class CitySim9000 extends Node
{	
	public static void main(String [] args) throws Exception
	{
			// checks to make sure an argument is passed
		if(args.length != 1)
		{
			System.out.println("Please enter an argument to seed.");
			return;
		}
			// checks to make sure the argument is an integer
		try
		{
			Integer.valueOf(args[0]);
		} 
		catch (NumberFormatException e) 
		{
			// Not an Integer
			System.out.println("Please enter valid integer (NOT a string) to seed.");
			return;
		}
		
		Random num = new Random();	// this will get a random number between 0 - 4
		num.setSeed(Integer.parseInt(args[0]));
		
		for(int i = 0; i < 5; i++)
		{
			int location;
			String place, place2;
			
			location = num.nextInt(6);	// starting point
			
			do
			{
				Node current = new Node(location);		// initializes the Node with location
				
				place = current.whereAmI(location);		// returns string of current location
				
				location = num.nextInt(2);				// determines which route you will take
				current = current.goToNext(location);	// changes your current to the next location
				location = current.cur_loc;				// updates location to current location
				
				place2 = current.whereAmI(location);
			
				System.out.println("Driver " + i + " heading from " + place + " to " + place2 + " " + current.route_chosen);
			
			} while (location != 2 && location != 5);	// location != outside the city on fourth or fifth ave
			
			System.out.println("Driver " + i + " has left the city!");
			System.out.println("-------------------------");
		}
	}
}