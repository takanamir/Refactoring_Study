package ReplaceConstructorWithFactoryMethod.after;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hyuki.refbook.StandardOutputTest;

import junit.framework.JUnit4TestAdapter;

public class MainTest extends StandardOutputTest {
	@Test
	public void testMain() {
		Main.main(new String[0]);
		String expected = getExpectedOutput(
				"drawLine: [ LINE, (0, 0)-(100, 200) ]",
				"drawRectangle: [ RECTANGLE, (10, 20)-(30, 40) ]",
				"drawOval: [ OVAL, (100, 200)-(300, 400) ]");
		String actual = getActualOutput();
		assertEquals(expected, actual);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(MainTest.class);
	}
}