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
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			String test = map.getRouteName(mockedCar, 0, 1);
			assertFalse(test == null);
		}
		
		// This test tests to make sure that when a driver and location 0
		// are passed into the getPlace method, a valid String with the name of the location
		// This tests stubbing
		@Test
		public void testCityMap_getPlace() {
			Driver mockedCar = Mockito.mock(Driver.class);
			// mockedCar.when(mockedCar.getCurrentLocation()).thenReturn(0);
			CityMap map = new CityMap(mockedCar, 0);
			String test = map.getPlace(mockedCar, 0);
			//assertEquals();
		}
		
		// This test tests to make sure that when 
		// This tests doubles
		@Test
		public void testDriver_Driver(){
			Driver car = new Driver();
			assertFalse(car.getCurrentLocation() != 6 && car.getEndLocation() != 6);
		}
		
		@Test
		public void testDriver_goToNext(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			int ret_val = car.goToNext(mockedMap, 1);	
			assertFalse(ret_val == 10);
		}
		
		@Test
		public void testDriver_getCurrentLocation(){
			Driver car = new Driver();
			car.setCurrentLocation(5);
			assertFalse(car.getCurrentLocation() != 5);	
		}
		
	}
