import java.io.*;
import java.util.*;

public class Driver
{
	
	private int current_location;
	private int end_location;
	
	public Driver() 
	{
		// do nothing
	}
	
	public int goToNext(CityMap map, int rand)
	{
		if(rand == 0)
		{
			return map.getRoute1();
		}
		else if(rand == 1)
		{
			return map.getRoute2();
		}
		
		return 10;
	}
	
	public void setCurrentLocation(int location) {
		current_location = location;
	}
	
	public void setEndLocation(int location){
		end_location = location;
	}
	
	public int getCurrentLocation() {
		return current_location;	
	}
	public int getEndLocation() {
		return end_location;
	}

}