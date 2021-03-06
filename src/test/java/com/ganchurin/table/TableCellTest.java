package com.ganchurin.table;

import com.ganchurin.format.align.Align;
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
	public void alignCellLeft() {
		checkAlignCell("123", 5, Align.LEFT, "123  ");
	}

	@Test
	public void alignCellRight() {
		checkAlignCell("123", 5, Align.RIGHT, "  123");
	}

	@Test
	public void alignCellCenter() {
		checkAlignCell("123", 5, Align.CENTER, " 123 ");
	}

	private void checkAlignCell(String value, int size, Align a, String exp) {
		TableCell cell = new TableCell(value);
		cell.setSize(size);
		cell.align(a);
		assertEquals(cell.getValue(), exp);
	}
}
