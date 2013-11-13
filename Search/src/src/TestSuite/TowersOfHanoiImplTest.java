package src.TestSuite;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.TowersOfHanoiImpl;

public class TowersOfHanoiImplTest {
	private final ByteArrayOutputStream outConsole = new ByteArrayOutputStream();
	private String[] hanoiExpected = {
			"Move disk 1 from tower 1 to top of tower 3",
			"Move disk 2 from tower 1 to top of tower 2",
			"Move disk 1 from tower 3 to top of tower 2",
			"Move disk 3 from tower 1 to top of tower 3",
			"Move disk 1 from tower 2 to top of tower 1",
			"Move disk 2 from tower 2 to top of tower 3",
			"Move disk 1 from tower 1 to top of tower 3",
			"Move disk 4 from tower 1 to top of tower 2",
			"Move disk 1 from tower 3 to top of tower 2",
			"Move disk 2 from tower 3 to top of tower 1",
			"Move disk 1 from tower 2 to top of tower 1",
			"Move disk 3 from tower 3 to top of tower 2",
			"Move disk 1 from tower 1 to top of tower 3",
			"Move disk 2 from tower 1 to top of tower 2",
			"Move disk 1 from tower 3 to top of tower 2"
	};
	
	@Before
	public void setOutStreams(){
		System.setOut(new PrintStream(outConsole,false));
	
	}
	
	@After
	public void cleanOutStreams(){
		System.setOut(null);
	}
	
	@Test
	public void testInstantiateObject() {
		TowersOfHanoiImpl towersHanoi = new TowersOfHanoiImpl();
		assertNotNull(towersHanoi);
	}
	
	@Test
	public void testTowersOfHanoi() {
		TowersOfHanoiImpl.towersOfHanoi(4);
		String[] tokens = outConsole.toString().split("\r\n");
		assertArrayEquals(hanoiExpected,tokens);
		TowersOfHanoiImpl.showTowerStates(4, 1, 2, 3);
	}

}
