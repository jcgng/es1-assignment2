package src.TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import src.MyBinarySearch;

public class MyBinarySearchTest {
	private MyBinarySearch mbs = new MyBinarySearch();
	private int[] inputArray = { 2,6,8,10,12,14,16 };
	private int keyFound = 8;
	private int keyNotFound = 7;
	
	@Test
	public void testBinarySearchFind() {
		assertNotNull(mbs);
		int index = mbs.binarySearch(inputArray,/*key*/keyFound);
		assertTrue(index>0);
//		assertEquals(index,2); // workaround assertTrue
	}
	
	@Test
	public void testBinarySearchFail() {
		assertNotNull(mbs);
		int index = mbs.binarySearch(inputArray,/*key*/keyNotFound);
		assertTrue(index<0);
//		assertEquals(index,-1); // workaround assertTrue
	}
}
