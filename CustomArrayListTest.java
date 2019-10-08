import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomArrayListTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomArrayListTest {
	private CustomArrayList customAr1;

	/**
	 * Default constructor for test class CustomArrayListTest
	 */
	public CustomArrayListTest() {
	}

	/**
	 * Sets up the test fixture.
	 *
	 * Called before every test case method.
	 */
	@Before
	public void setUp() {
		customAr1 = new CustomArrayList();
	}

	/**
	 * Tears down the test fixture.
	 *
	 * Called after every test case method.
	 */
	@After
	public void tearDown() {
	}

	@Test
	public void testConstructor() {
		assertEquals(10, customAr1.size());
	}

	@Test
	public void testAddValue() {
		customAr1.addValue(1);
		customAr1.addValue(3);
		customAr1.addValue(5);
		customAr1.addValue(7);
		customAr1.addValue(9);
		customAr1.addValue(8);
		customAr1.addValue(2);
		customAr1.addValue(1);
		customAr1.addValue(8);
		customAr1.addValue(3);
		customAr1.addValue(5);
		customAr1.addValue(4);
		customAr1.addValue(5);
		customAr1.addValue(6);
		assertEquals(20, customAr1.size());
		assertEquals(6, customAr1.get(12));
	}

	@Test
	public void testRemove() {
		customAr1.addValue(3);
		customAr1.addValue(4);
		customAr1.remove(1);
		assertEquals(9, customAr1.size());
		assertEquals(0, customAr1.get(1));
	}

	@Test
	public void testRemoveInvalid() {
		customAr1.remove(-10);
		assertEquals(10, customAr1.size());
		customAr1.remove(100);
		assertEquals(10, customAr1.size());
	}

	@Test
	public void testGetSize() {
		assertEquals(10, customAr1.size());
	}

	@Test
	public void testGetInvalid() {
		assertEquals(-1, customAr1.get(100));
	}

	@Test
	public void testGetValid() {
		customAr1.addValue(1);
		assertEquals(1, customAr1.get(0));
	}

	@Test
	public void testAddNotResize() {
		customAr1.addValue(9);
		assertEquals(10, customAr1.size());
		assertEquals(9, customAr1.get(0));
	}
}
