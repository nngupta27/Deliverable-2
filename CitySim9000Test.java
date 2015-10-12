import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.*;

public class CitySim9000Test {

		// This test tests to make sure that when a CityMap is initialized with
		// a Driver and 0, two routes WILL be assigned to that location.
		// This tests doubles
		@Test
		public void testCityMap_CityMap() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			assertFalse(map.getRoute1() != 4 && map.getRoute2() != 1);
		}
		
		// This test tests to make sure that when a driver, 0(start) and 1(end) location are entered to the
		// getRouteName method, a valid string is returned with the name of the route.
		// This tests doubles
		@Test
		public void testCityMap_getRouteName() {
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			mockedMap = new CityMap(car, 0);
			String test = mockedMap.getRouteName(car, 0, 1);
			assertFalse(test == null);
		}
		
		// This test tests to make sure that when a driver and location 0
		// are passed into the getPlace method, a valid String with the name of the location
		// This tests doubles
		@Test
		public void testCityMap_getPlace() {
			Driver car = Mockito.mock(Driver.class);
			//car.when(car.getLocation()).thenReturn(2);
			CityMap map = new CityMap(car, 1);
			
		}
		
		// This test tests to make sure that when 
		
		@Test
		public void testDriver_Driver(){
			Driver mockedCar = Mockito.mock(Driver.class);
			assertFalse(mockedCar.current_location == 6);
		}
		
		@Test
		public void testDriver_goToNext(){
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			int ret_val = mockedCar.goToNext(map, 1);	
			assertFalse(ret_val == 10);
		}
		
	}
