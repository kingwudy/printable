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

}
