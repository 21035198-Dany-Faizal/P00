import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a, b;
	Calculator cal;

	@Before
	public void setUp() throws Exception {
	}

	{
		a = 4321;
		b = 1234;
		cal = new Calculator();

	}

	@Test
	public void testadd() {
		// Act
		int actual = cal.add(a, b);
		int expected = 5555;

		// Assertion
		assertEquals(expected, actual);
	}

	@Test
	public void testsub() {
		// Act
		int actual = cal.sub(a, b);
		int expected = 3087;

		// Assertion
		assertEquals(expected, actual);
	}

	@Test
	public void testmultiply() {
		// Act
		int actual = cal.multiply(a, b);
		int expected = 5332114;

		// Assertion
		assertEquals(expected, actual);
	}

	@Test
	public void testdivide() {
		// Act
		int actual = cal.divide(a, b);
		int expected = 3;

		// Assertion
		assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}

}
