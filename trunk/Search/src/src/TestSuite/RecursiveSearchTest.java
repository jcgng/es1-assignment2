package src.TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import src.RecursiveSearch;


public class RecursiveSearchTest {
	public int[] inputArray = { 2,6,8,10,12,14,16 };
	public int keyFound = 8;
	public int keyNotFound = 7;
	
	@Test
	public void testRecursiveSearch() {
		RecursiveSearch recursiveSearch = new RecursiveSearch();
		assertNotNull(recursiveSearch);
	}
	
	@Test
	public void testRecursiveSearchFind() {	
		int index = RecursiveSearch.recursiveSearch(inputArray,/*start*/0,/*end*/6,/*key*/keyFound);
		assertTrue(index>0);
//		assertEquals(index,2);
	}
	
	@Test
	public void testRecursiveSearchFail() {
		int index = RecursiveSearch.recursiveSearch(inputArray,/*start*/0,/*end*/6,/*key*/keyNotFound);
		assertTrue(index<0);
//		assertEquals(index,-3);
	}
}
