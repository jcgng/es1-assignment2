package src.TestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith; 
import org.junit.runners.Suite;

@RunWith(Suite.class) 
@Suite.SuiteClasses({
	MyGenericsStackTest.class,
	InfixFullParantExTest.class,
	MyDynamicStackTest.class,
	TowersOfHanoiImplTest.class,
	MyMergeSortTest.class,
	MyLinearSearchTest.class,
	MyBinarySearchTest.class,
	RecursiveSearchTest.class
})
public class MyTestSuite {
	@BeforeClass public static void setUpClass() {
        // Common initialization done once
    }
    @AfterClass public static void tearDownClass() {
        // Common cleanup for all tests
    }
}
