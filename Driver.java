import java.io.*;
import java.util.*;

public class Driver
{
	
	int current_location;
	int end_location;
	
	public Driver() 
	{
		current_location = 6;
	}
	
	public int goToNext(CityMap map, int rand)
	{
		if(rand == 0)
		{
			return map.route1;
		}
		else if(rand == 1)
		{
			return map.route2;
		}
		
		return 10;
	}
	
	


}