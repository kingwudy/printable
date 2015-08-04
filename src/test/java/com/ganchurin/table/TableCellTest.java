package com.ganchurin.table;

import com.ganchurin.format.Align;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableCellTest {

	@Test
	public void newCell() {
		checkNewCell(null, 0);
		checkNewCell("", 0);
		checkNewCell(" ", 1);
		checkNewCell("123", 3);
	}

	private void checkNewCell(String value, int expSize) {
		TableCell cell = new TableCell(value);
		assertEquals(cell.getValue(), value);
		assertEquals(cell.getSize(), expSize);
	}

	@Test
	public void setBorder() {
		for (Side side : Side.values()) {
			checkBorder(side);
		}
	}

	private void checkBorder(Side side) {
		TableCell c = new TableCell(null);
		c.setBorder(side);
		assertEquals(c.hasBorder(side), true);
	}

	@Test
	public void alignCellRight() {
		alignCell(Align.Right);
	}

	@Test
	public void alignCellLeft() {
		alignCell(Align.Left);
	}

	private void alignCell(Align a) {
		checkAlignCell(null, 0, a, "");
		checkAlignCell("", 0, a, "");
		checkAlignCell("123", 0, a, "123");
		checkAlignCell("12345", 0, a, "12345");
	}

	@Test
	public void alignLongCellLeft() {
		checkAlignCell(null, 5, Align.Left, "     ");
		checkAlignCell("", 5, Align.Left, "     ");
		checkAlignCell("123", 5, Align.Left, "123  ");
		checkAlignCell("12345", 5, Align.Left, "12345");
	}

	@Test
	public void alignLongCellRight() {
		checkAlignCell(null, 5, Align.Right, "     ");
		checkAlignCell("", 5, Align.Right, "     ");
		checkAlignCell("123", 5, Align.Right, "  123");
		checkAlignCell("12345", 5, Align.Right, "12345");
	}

	private void checkAlignCell(String value, int size, Align a, String exp) {
		TableCell cell = new TableCell(value);
		if (size > 0) {
			cell.setSize(size);
		}
		cell.align(a);
		assertEquals(cell.getValue(), exp);
	}
}
