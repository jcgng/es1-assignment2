package src.TestSuite;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.MyMergeSort;

public class MyMergeSortTest {
	private final ByteArrayOutputStream outConsole = new ByteArrayOutputStream();
	
	@Before
	public void setOutStream() {
	    System.setOut(new PrintStream(outConsole));
	}

	@After
	public void cleanOutStream() {
	    System.setOut(null);
	}	
	
	@Test
	public void testMyMergeSort() {
		MyMergeSort.main(new String[] {});
		assertEquals("4 11 23 28 43 45 65 77 89 98 ", outConsole.toString());
	}
}
