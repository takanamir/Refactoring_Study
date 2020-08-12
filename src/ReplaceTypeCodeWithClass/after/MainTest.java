package ReplaceTypeCodeWithClass.after;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hyuki.refbook.StandardOutputTest;

import junit.framework.JUnit4TestAdapter;

public class MainTest extends StandardOutputTest {
	@Test
	public void testMain() {
		Main.main(new String[0]);
		String expected = getExpectedOutput(
				"book = [ 0, 世界の歴史, 4800 ]",
				"dvd  = [ 1, ニューヨークの夢・特別版, 3000 ]",
				"soft = [ 2, チューリングマシンエミュレータ, 3200 ]");
		String actual = getActualOutput();
		assertEquals(expected, actual);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(MainTest.class);
	}
}