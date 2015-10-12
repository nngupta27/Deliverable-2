import java.io.*;
import java.util.*;
import java.util.Random;

public class CitySim9000
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
		
		int location = num.nextInt(6);
		
		// makes the city map and driver
		Driver car = new Driver();
		CityMap map = new CityMap(car, location);
		
		int start, end;
		
		for(int i = 0; i < 5; i++)
		{
			do
			{
				int coin =  num.nextInt(2);
				start = location;
				end = car.goToNext(map, coin);
				
				System.out.println("Driver " + i + " heading from " + map.getPlace(car, start) + " to " + map.getPlace(car, end) + " " + map.getRouteName(car, start, end));
				location = end;
				map = new CityMap(car, location);
				
			} while (location != 2 && location != 5);
			System.out.println("---------------------------");
			location = num.nextInt(6);
			map = new CityMap(car, location);
		}
		
	}
}