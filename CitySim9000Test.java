import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import java.util.Random;
import org.junit.Test;
import org.mockito.Mockito;

public class CitySim9000Test {

		// This test tests to make sure that when a CityMap is initialized with
		// a Driver and an int that is between 0 - 5, two routes WILL be assigned to that
		// location.
		// This tests doubles
		@Test
		public void testCityMap_CityMap() {
			Driver car = new Driver();	
			Random num = new Random();
			int start = num.nextInt(6);
			CityMap map = Mockito.mock(CityMap.class);
			map = new CityMap(car, start);
			assertFalse(map.route1 == 6 || map.route2 == 6);
		}
		
		// This test tests to make sure that when a driver, start and end location are entered to the
		// getRouteName method, a valid string is returned with the name of the route.
		// This tests doubles
		@Test
		public void testCityMap_getRouteName() {
			Driver car = new Driver();	
			Random num = new Random();
			int start = num.nextInt(6);
			CityMap map = Mockito.mock(CityMap.class);
			map = new CityMap(car, start);
			int rand = num.nextInt(2);
			int end = car.goToNext(map, rand);
			String test = map.getRouteName(car, start, end);
			assertFalse(test == null);
		}
		
		// This test tests to make sure that when a driver and location that is between 0 - 5
		// are passed into the getPlace method, a valid String with the name of the location
		// This tests doubles
		@Test
		public void testCityMap_getPlace() {
			Driver car = new Driver();	
			Random num = new Random();
			int start = num.nextInt(6);
			CityMap map = Mockito.mock(CityMap.class);
			map = new CityMap(car, start);
			String test = map.getPlace(car, start);
			assertFalse(test == null);
		}
		
		@Test
		public void testDriver_Driver(){
			
			Driver car = Mockito.mock(Driver.class);
						
			assertFalse(car.current_location == 6);
		}
		
		@Test
		public void testDriver_goToNext(){
			
			Driver car = Mockito.mock(Driver.class);
			Random num = new Random();
			int start = num.nextInt(6);
			CityMap map = new CityMap(car, start);
			int rand = num.nextInt(2);
			int ret_val = car.goToNext(map, rand);	
			System.out.println(ret_val + " " + map.route1 + " " + rand);
			assertFalse(ret_val == 10);
		}
		
	}
