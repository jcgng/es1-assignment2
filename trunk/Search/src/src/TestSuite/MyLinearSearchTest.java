package src.TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import src.MyLinearSearch;

public class MyLinearSearchTest {
	private int[] inputArray = {1, 2, 3, 4};
	private int keyFound = 4;
	private int keyNotFound = 6;
	
	@Test
	public void testMyLinearSearch() {
		MyLinearSearch MyLS = new MyLinearSearch();
		assertNotNull(MyLS);
	}
	
	@Test
	public void testLinerSearchFind() {
		int index = MyLinearSearch.linerSearch(inputArray, keyFound);
		assertTrue(index>0);
//		assertEquals(index, 3);
	}
		
	@Test
	public void testLinerSearchFail() {
		int index = MyLinearSearch.linerSearch(inputArray, keyNotFound);
		assertTrue(index<0);
//		assertEquals(index, -1);
	}
}
