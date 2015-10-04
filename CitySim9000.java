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
		
		for(int i = 0; i < 5; i++)
		{
			int location, route_location;
			String place, place2;
			Random num = new Random();	// this will get a random number between 0 - 4
			location = num.nextInt(5);
			
			do
			{
				Node current_location = new Node(location);
				
				if(location == 0)
				{
					place = "Mall";
				}
				else if(location == 1)
				{
					place = "Bookstore";
				}
				else if(location == 2)
				{
					place = "Outside the city";		// outside Fourth
				}
				else if(location == 3)
				{
					place = "University";
				}
				else if(location == 4)
				{
					place = "Coffee";
				}
				else if(location == 5)
				{
					place = "Outside the city";		// outside Fifth
				} 
				else
				{
					place = "Error choosing location.";
				}
				
				location = num.nextInt(2);
				current_location = current_location.goToNext(location);
				
				location = current_location.cur_loc;
				if(location == 0)
				{
					place2 = "Mall";
				}
				else if(location == 1)
				{
					place2 = "Bookstore";
				}
				else if(location == 2)
				{
					place2 = "Outside the city";	// outside Fourth
				}
				else if(location == 3)
				{
					place2 = "University";
				}
				else if(location == 4)
				{
					place2 = "Coffee";
				}
				else if(location == 5)
				{
					place2 = "Outside the city";	// outside Fifth
				} 
				else
				{
					place2 = "Error choosing destination.";
				}
				
				System.out.println("Driver " + i + " heading from " + place + " to " + place2 + " " + current_location.route_chosen);
			} 	while(location != 2 && location != 5);
			
			System.out.println("Driver " + i + " has left the city!");
			System.out.println("-------------------------");
		}
	}
}