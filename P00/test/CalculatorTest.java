import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * chuyi, May 26, 2023 11:14:23 AM
 */

public class CalculatorTest {

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	
	
	
	
	/**
	 * @throws java.lang.Exception
	 **/
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSubtract() {
		// fail("Not yet implemented");
		int a = 8765;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 7531;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMultiple() {
		// fail("Not yet implemented");
		int a = 12;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 144;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		// fail("Not yet implemented");
		int a = 144;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 12;
		assertEquals(expected,actual);
	}

}
