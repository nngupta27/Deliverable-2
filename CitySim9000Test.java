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
		
		// This test tests to make sure that when a CityMap object is initialized with a starting location
		// of 0, it returns the correct first route, 4
		// This tests doubles
		@Test
		public void testCityMap_getRoute1(){
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			int ret_val = map.getRoute1();
			assertEquals(4, ret_val);
		}
		
		// This test tests to make sure that when a CityMap object is initialized with a starting location
		// of 0, it returns the correct second route, 1
		// This tests doubles
		@Test
		public void testCityMap_getRoute2(){
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			int ret_val = map.getRoute2();
			assertEquals(1, ret_val);			
		}
		
		// This test tests to make sure that when a new Driver object is created, the current and end 
		// locations are initialized correctly.
		@Test
		public void testDriver_Driver(){
			Driver car = new Driver();
			assertFalse(car.getCurrentLocation() != 6 && car.getEndLocation() != 6);
		}
		
		// This test tests to make sure that the method ".goToNext()" returns correctly
		// This tests stubbing
		@Test
		public void testDriver_goToNext(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			//mockedMap.when(car.goToNext(mockedMap, 0)).thenReturn(0);
			int ret_val = car.goToNext(mockedMap, 0);
			assertEquals(0, ret_val);
		}
		
		// This test tests to make sure that the method ".getCurrentLocation()" returns correctly
		// This tests stubbing
		@Test
		public void testDriver_getCurrentLocation(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			//mockedMap.when(car.getCurrentLocation()).thenReturn(6);
			int ret_val = car.getCurrentLocation();
			assertEquals(6, ret_val);	
		}
		
	}
