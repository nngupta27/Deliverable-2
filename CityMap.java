import java.io.*;
import java.util.*;
import java.util.Random;

public class CityMap
{
	private int route1;
	private int route2;
		
	public CityMap() 
	{
		// do nothing
	}
	
	// this sets up your node with the current location
	public CityMap (Driver driver, int current) 
	{			
	
		driver.setCurrentLocation(current);
		
		if(driver.getCurrentLocation() == 0)
		{
			route1 = 4;
			route2 = 1;
		}
		else if(driver.getCurrentLocation() == 1)
		{
			route1 = 2;
			route2 = 3;
		}
		else if(driver.getCurrentLocation() == 2)
		{
			route1 = 3;
			route2 = 0;
		}
		else if(driver.getCurrentLocation() == 3)
		{
			route1 = 1;
			route2 = 4;
		}
		else if(driver.getCurrentLocation() == 4)
		{
			route1 = 5;
			route2 = 0;
		}
		else if(driver.getCurrentLocation() == 5)
		{
			route1 = 0;
			route2 = 3;
		}
	}
	
	public String getRouteName(Driver driver, int start, int end)
	{
		driver.setCurrentLocation(start);
		driver.setEndLocation(end);
		
		if((driver.getCurrentLocation() == 0 && driver.getEndLocation() == 1) || (driver.getCurrentLocation() == 1 && driver.getEndLocation() == 2) || (driver.getCurrentLocation() == 2 && driver.getEndLocation() == 0) || (driver.getCurrentLocation() == 5 && driver.getEndLocation() == 0))
		{
			return "via Fourth Ave";
		}
		else if ((driver.getCurrentLocation() == 2 && driver.getEndLocation() == 3) || (driver.getCurrentLocation() == 3 && driver.getEndLocation() == 4) || (driver.getCurrentLocation() == 4 && driver.getEndLocation() == 5) || (driver.getCurrentLocation() == 5 && driver.getEndLocation() == 3))
		{
			return "via Fifth Ave";
		}
		else if ((driver.getCurrentLocation() == 0 && driver.getEndLocation() == 4) || (driver.getCurrentLocation() == 4 && driver.getEndLocation() == 0))
		{
			return "via Meow St.";
		}
		else if ((driver.getCurrentLocation() == 1 && driver.getEndLocation() == 3) || (driver.getCurrentLocation() == 3 && driver.getEndLocation() == 1))
		{
			return "via Chirp St.";
		}
		
		return null;
	}
	
	public String getPlace(Driver driver, int location)
	{
		driver.setCurrentLocation((location));
		if(driver.getCurrentLocation() == 0)
		{
			return "Mall";
		}
		else if(driver.getCurrentLocation() == 1)
		{
			return "Bookstore";
		}
		else if(driver.getCurrentLocation() == 2)
		{
			return "Outside City";
		}
		else if(driver.getCurrentLocation() == 3)
		{
			return "University";
		}
		else if(driver.getCurrentLocation() == 4)
		{
			return "Coffee";
		}
		else if(driver.getCurrentLocation() == 5)
		{
			return "Outside City";
		}
		
		return null;
	}
	
	public int getRoute1() {
		return route1;
	}
	
	public int getRoute2() {
		return route2;
	}
	


}