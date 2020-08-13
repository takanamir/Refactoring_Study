package DuplicateObservedData.after;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.JUnit4TestAdapter;

public class MainTest {
	@Test
	public void testMain() {
		IntegerDisplay display = new IntegerDisplay();
		display.setValue(1);
		int actual = display.getValue();
		int expected = 1;
		assertEquals(expected, actual);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(MainTest.class);
	}
}