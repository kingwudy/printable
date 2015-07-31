package com.ganchurin.format;

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
		assertTrue(format.getAlignment() == Alignment.Left);
	}

	@Test
	public void setCornerChar() {
		format.setCornerChar('*');
		assertTrue(format.getCornerChar() == '*');
	}

	@Test
	public void setRowChar() {
		format.setRowChar('*');
		assertTrue(format.getRowChar() == '*');
	}

	@Test
	public void setColumnChar() {
		format.setColumnChar('*');
		assertTrue(format.getColumnChar() == '*');
	}

	@Test
	public void setAlignment() {
		format.setAlignment(Alignment.Right);
		assertTrue(format.getAlignment() == Alignment.Right);
	}

}
