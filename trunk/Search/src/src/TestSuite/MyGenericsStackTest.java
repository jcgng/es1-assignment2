package src.TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import src.MyGenericsStack;

public class MyGenericsStackTest {
	private MyGenericsStack<String> GenericsStack = new MyGenericsStack<String>(5);

	@Test
	public void testMyGenericsStackObject() {
		assertNotNull(GenericsStack);
	}
	
	public void testPush() {
		assertNotNull(GenericsStack);
		assertFalse(GenericsStack.isStackFull());
		while(!GenericsStack.isStackFull()) {
			GenericsStack.push("a");
		}
		assertTrue(GenericsStack.isStackFull());
		GenericsStack.push("b");
		assertFalse(GenericsStack.isStackFull());
		testPeek();
	} 
	
	@Test
	public void testPushPop() {
		testPush();
		try {
			while(!GenericsStack.isStackEmpty()) {
				GenericsStack.pop();
			}
			GenericsStack.pop();
		} catch(Exception ex) {
			assertEquals("Stack is empty. Can not remove element.",ex.getMessage());
		}
	}
	
	public void testPeek() {
		assertEquals(GenericsStack.peek(), "b");
	}

}
