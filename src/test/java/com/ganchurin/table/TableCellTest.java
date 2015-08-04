package com.ganchurin.table;

import com.ganchurin.format.Alignment;
import org.junit.Test;

import static com.ganchurin.format.Alignment.Left;
import static com.ganchurin.format.Alignment.Right;
import static org.junit.Assert.assertEquals;

public class TableCellTest {

	@Test
	public void testCellRightAlign() {
		testCellAlign(Right);
	}

	@Test
	public void testCellLeftAlign() {
		testCellAlign(Left);
	}

	private void testCellAlign(Alignment a) {
		checkAlign(null, 0, a, "");
		checkAlign("", 0, a, "");
		checkAlign("123", 0, a, "123");
		checkAlign("12345", 0, a, "12345");
	}

	@Test
	public void testLongCellLeftAlign() {
		checkAlign(null, 5, Left, "     ");
		checkAlign("", 5, Left, "     ");
		checkAlign("123", 5, Left, "123  ");
		checkAlign("12345", 5, Left, "12345");
	}

	@Test
	public void testLongCellRightAlign() {
		checkAlign(null, 5, Right, "     ");
		checkAlign("", 5, Right, "     ");
		checkAlign("123", 5, Right, "  123");
		checkAlign("12345", 5, Right, "12345");
	}

	private void checkAlign(String value, int size, Alignment alignment, String exp) {
		TableCell cell = new TableCell(value);
		if (size > 0) {
			cell.setSize(size);
		}
		cell.align(alignment);
		assertEquals(cell.getValue(), exp);
	}
}
