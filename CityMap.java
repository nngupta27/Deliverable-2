import java.io.*;
import java.util.*;
import java.util.Random;

public class CityMap
{
	int route1;
	int route2;
	
	public CityMap() 
	{
		route1 = 6;
		route2 = 6;
	}
	
	// this sets up your node with the current location
	public CityMap (Driver driver, int current) 
	{			
	
		driver.current_location = current;
		
		if(current == 0)
		{
			route1 = 4;
			route2 = 1;
		}
		else if(current == 1)
		{
			route1 = 2;
			route2 = 3;
		}
		else if(current == 2)
		{
			route1 = 3;
			route2 = 0;
		}
		else if(current == 3)
		{
			route1 = 1;
			route2 = 4;
		}
		else if(current == 4)
		{
			route1 = 5;
			route2 = 0;
		}
		else if(current == 5)
		{
			route1 = 0;
			route2 = 3;
		}
	}
	
	public String getRouteName(Driver driver, int start, int end)
	{
		driver.current_location = start;
		driver.end_location = end;
		
		if((start == 0 && end == 1) || (start == 1 && end == 2) || (start == 2 && end == 0) || (start == 5 && end == 0))
		{
			return "via Fourth Ave";
		}
		else if ((start == 2 && end == 3) || (start == 3 && end == 4) || (start == 4 && end == 5) || (start == 5 && end == 3))
		{
			return "via Fifth Ave";
		}
		else if ((start == 0 && end == 4) || (start == 4 && end == 0))
		{
			return "via Meow St.";
		}
		else if ((start == 1 && end == 3) || (start == 3 && end == 1))
		{
			return "via Chirp St.";
		}
		
		return null;
	}
	
	public String getPlace(Driver driver, int location)
	{
		driver.current_location = location;
		
		if(location == 0)
		{
			return "Mall";
		}
		else if(location == 1)
		{
			return "Bookstore";
		}
		else if(location == 2)
		{
			return "Outside City";
		}
		else if(location == 3)
		{
			return "University";
		}
		else if(location == 4)
		{
			return "Coffee";
		}
		else if(location == 5)
		{
			return "Outside City";
		}
		
		return null;
	}
	


}