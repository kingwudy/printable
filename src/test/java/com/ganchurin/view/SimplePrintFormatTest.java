package com.ganchurin.view;

import com.ganchurin.model.ArrayDataSource;
import com.ganchurin.model.DataSource;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimplePrintFormatTest {

	private SimplePrintFormat format;

	@Before
	public void init() {
		format = new SimplePrintFormat();
	}

	@Test
	public void newSimplePrintFormat() {
		assertTrue(format.getCornerChar() == '+');
		assertTrue(format.getRowChar() == '-');
		assertTrue(format.getColumnChar() == '|');
	}

	@Test
	public void setCornerChar() {
		SimplePrintFormat f = format.setCornerChar('*');
		assertTrue(f.getCornerChar() == '*');
	}

	@Test
	public void setRowChar() {
		SimplePrintFormat f = format.setRowChar('*');
		assertTrue(f.getRowChar() == '*');
	}

	@Test
	public void setColumnChar() {
		SimplePrintFormat f = format.setColumnChar('*');
		assertTrue(f.getColumnChar() == '*');
	}

	@Test
	public void testFormat() {
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}};
		DataSource src = new ArrayDataSource(array);
		PrintFormat pf = new SimplePrintFormat();
		String s = pf.format(src);
		String exp = "" +
				"+-+-+\n" +
				"|a|b|\n" +
				"+-+-+\n" +
				"|c|d|\n" +
				"+-+-+\n";
		assertTrue(s.equals(exp));
	}
}
