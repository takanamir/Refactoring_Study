package ReplaceInheritanceWithDelegation.after;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hyuki.refbook.StandardOutputTest;

import junit.framework.JUnit4TestAdapter;

public class MainTest extends StandardOutputTest {
	@Test
	public void testMain() {
		Main.main(new String[0]);
		String expected = getExpectedOutput(
				"1, 5, 3, 4, 6, 3, 3, 4, 5, 3, ",
				"3, 5, 6, 6, 5, 4, 2, 1, 2, 4, ",
				"3, 5, 6, 6, 5, 4, 2, 1, 2, 4, ");
		String actual = getActualOutput();
		assertEquals(expected, actual);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(MainTest.class);
	}
}