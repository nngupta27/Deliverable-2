import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.*;

public class CitySim9000Test {

		// These tests test to make sure that when a CityMap is initialized with
		// a Driver and a start location, the two correct routes be assigned to that location.
		// This tests doubles
		@Test
		public void testCityMap_CityMap_0() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			assertFalse(map.getRoute1() != 4 && map.getRoute2() != 1);
		}
		@Test
		public void testCityMap_CityMap_1() {
			Driver mockedCar = new Driver();
			CityMap map = new CityMap(mockedCar, 1);
			assertFalse(map.getRoute1() != 2 && map.getRoute2() != 3);
		}
		@Test
		public void testCityMap_CityMap_2() {
			Driver mockedCar = new Driver();
			CityMap map = new CityMap(mockedCar, 2);
			assertFalse(map.getRoute1() != 3 && map.getRoute2() != 0);
		}
		@Test
		public void testCityMap_CityMap_3() {
			Driver mockedCar = new Driver();
			CityMap map = new CityMap(mockedCar, 3);
			assertFalse(map.getRoute1() != 1 && map.getRoute2() != 4);
		}
		@Test
		public void testCityMap_CityMap_4() {
			Driver mockedCar = new Driver();
			CityMap map = new CityMap(mockedCar, 4);
			assertFalse(map.getRoute1() != 5 && map.getRoute2() != 0);
		}
		@Test
		public void testCityMap_CityMap_5() {
			Driver mockedCar = new Driver();
			CityMap map = new CityMap(mockedCar, 5);
			assertFalse(map.getRoute1() != 0 && map.getRoute2() != 3);
		}
		
		// These tests test to make sure that when a driver, start and location are entered to the
		// getRouteName method, a valid string is returned with the name of the route.
		// This tests doubles
		@Test
		public void testCityMap_getRouteName_01() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			String test = map.getRouteName(mockedCar, 0, 1);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_12() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 1);
			String test = map.getRouteName(mockedCar, 1, 2);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_20() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 2);
			String test = map.getRouteName(mockedCar, 2, 0);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_50() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 5);
			String test = map.getRouteName(mockedCar, 5, 0);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_23() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 2);
			String test = map.getRouteName(mockedCar, 2, 3);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_34() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 3);
			String test = map.getRouteName(mockedCar, 3, 4);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_45() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 4);
			String test = map.getRouteName(mockedCar, 4, 5);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_53() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 5);
			String test = map.getRouteName(mockedCar, 5, 3);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_04() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			String test = map.getRouteName(mockedCar, 0, 4);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_40() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 4);
			String test = map.getRouteName(mockedCar, 4, 0);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_13() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 1);
			String test = map.getRouteName(mockedCar, 1, 3);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName_31() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 3);
			String test = map.getRouteName(mockedCar, 3, 1);
			assertFalse(test == null);
		}
		@Test
		public void testCityMap_getRouteName() {
			Driver mockedCar = Mockito.mock(Driver.class);
			CityMap map = new CityMap(mockedCar, 0);
			String test = map.getRouteName(mockedCar, 0, 0);
			assertFalse(test != null);
		}
		
		
		// This test tests to make sure that when a driver and location 0
		// are passed into the getPlace method, a valid String with the name of the location
		// This tests stubbing
		@Test
		public void testCityMap_getPlace() {
			Driver mockedCar = Mockito.mock(Driver.class);
			when(mockedCar.getCurrentLocation()).thenReturn(1);
			CityMap map = new CityMap(mockedCar, 1);
			String returnVal = map.getPlace(mockedCar, 1);
			assertEquals(returnVal, "Bookstore");
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
		public void testDriver_goToNext_0(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			when(car.goToNext(mockedMap, 0)).thenReturn(0);
			int ret_val = car.goToNext(mockedMap, 0);
			assertEquals(0, ret_val);
		}
		@Test
		public void testDriver_goToNext_1(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			when(car.goToNext(mockedMap, 1)).thenReturn(0);
			int ret_val = car.goToNext(mockedMap, 1);
			assertEquals(0, ret_val);
		}
		@Test
		public void testDriver_goToNext_10(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			//mockedMap.when(car.goToNext(mockedMap, 2)).thenReturn(10);
			int ret_val = car.goToNext(mockedMap, 2);
			assertEquals(10, ret_val);
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
		@Test
		public void testDriver_getEndLocation(){
			Driver car = new Driver();
			CityMap mockedMap = Mockito.mock(CityMap.class);
			//mockedMap.when(car.getCurrentLocation()).thenReturn(6);
			int ret_val = car.getEndLocation();
			assertEquals(6, ret_val);	
		}
		
	}
