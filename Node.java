import java.io.*;
import java.util.*;

public class Node
{
	int cur_loc;
	int next_loc;
	int route1;
	int route2;
	String route1_str;
	String route2_str;
	String route_chosen;
	
	public Node() 
	{
		next_loc = 6;
		route1 = 2;
		route2 = 2;
	}
	
	// this sets up your node with the current location
	public Node (int current) 
	{
		cur_loc = current;
		this.setUpRoutes(current);
	}
	
	// this method moves you to the next location based on which route is chosen
	public Node goToNext (int next_location)
	{
		if (next_location == 0)
		{
			route_chosen = getRouteStr(route1);
			this.cur_loc = route1;
		}
		else //if(next_location == 1)
		{
			route_chosen = getRouteStr(route2);
			this.cur_loc = route2;
		}
		
		return this;
	}
	
	public String whereAmI (int location)
	{
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
			return "Outside the city";		// outside Fourth
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
			return "Outside the city";		// outside Fifth
		} 
		else
		{
			return "Error choosing location.";
		}
	}
	
	// this sets up the routes that are available
	private Node setUpRoutes (int current)
	{
		this.cur_loc = current;		// this tells you where you are
		if(current == 0)		// MALL
		{
			route1 = 1;
			route2 = 4;
		}
		else if(current == 1)	// BOOKSTORE
		{
			route1 = 3;
			route2 = 2;
		}
		else if(current == 2)	// OUTSIDE THE CITY (Fourth Ave)
		{
			route1 = 0;
			route2 = 3;
		}
		else if(current == 3)	// UNIVERSITY
		{
			route1 = 1;
			route2 = 4;
		}
		else if(current == 4)	// COFFEE
		{
			route1 = 0;
			route2 = 5;
		}
		else if(current == 5)	// OUTSIDE THE CITY (Fifth Ave)
		{
			route1 = 3;
			route2 = 0;
		}
		
		return this;
	}
	
	// this method returns you the string of which street/avenue taken to get from current to destination
	private String getRouteStr (int destination)
	{
		if(destination == 0 && cur_loc == 4)
		{
			return "via Meow St.";
		}
		else if(destination == 1 && cur_loc == 0)
		{
			return "via Fourth Ave";
		}
		else if(destination == 1 && cur_loc == 3)
		{
			return "via Chirp St.";
		}
		else if(destination == 3 && cur_loc == 2)
		{
			return "via Fifth Ave";
		}
		else if(destination == 0 && cur_loc == 2)
		{
			return "via Fourth Ave";
		}
		else if(destination == 3 && cur_loc == 1)
		{
			return "via Chirp St.";
		}
		else if(destination == 4 && cur_loc == 0)
		{
			return "via Meow St.";
		}
		else if(destination == 4 && cur_loc == 3)
		{
			return "via Fifth Ave";
		}		
		else if(destination == 0 && cur_loc == 5)
		{
			return "via Fourth Ave";
		}
		else if(destination == 3 && cur_loc == 5)
		{
			return "via Fifth Ave";
		} 
		else if(destination == 2 && cur_loc == 1)
		{
			return "via Fourth Ave";
		}
		else if(destination == 5 && cur_loc == 4)
		{
			return "via Fifth Ave";
		}
		else
		{
			return "Error determining route";
		}
	}


}