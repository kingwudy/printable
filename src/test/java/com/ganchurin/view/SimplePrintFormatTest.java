package com.ganchurin.view;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimplePrintFormatTest {

	@Test
	public void createSimplePrintFormat() {
		char cornerChar = '+';
		char rowChar = '-';
		char colChar = '|';

		SimplePrintFormat format = new SimplePrintFormat(cornerChar, rowChar, colChar);

		assertTrue(format.getCornerChar() == cornerChar);
		assertTrue(format.getRowChar() == rowChar);
		assertTrue(format.getColumnChar() == colChar);
	}
}
