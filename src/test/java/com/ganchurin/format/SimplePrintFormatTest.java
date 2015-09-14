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
		newSimplePrintFormat(format);
		newSimplePrintFormat(PrintFormatFactory.createFormat());
	}

	private void newSimplePrintFormat(PrintFormat format) {
		assertTrue(format.getCornerChar() == '+');
		assertTrue(format.getRowChar() == '-');
		assertTrue(format.getColumnChar() == '|');
		assertTrue(format.getAlign() == Align.LEFT);
		assertTrue(format.getColumnSize() == 0);
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
		format.setAlign(Align.RIGHT);
		assertTrue(format.getAlign() == Align.RIGHT);
	}

	@Test
	public void setColumnSize() {
		format.setColumnSize(10);
		assertTrue(format.getColumnSize() == 10);
	}

}
