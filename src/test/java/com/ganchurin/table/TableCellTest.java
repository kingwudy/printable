package com.ganchurin.table;

import com.ganchurin.format.Alignment;
import org.junit.Test;

import static com.ganchurin.format.Alignment.Left;
import static com.ganchurin.format.Alignment.Right;
import static org.junit.Assert.assertEquals;

public class TableCellTest {

	@Test
	public void newCell() {
		checkNewCell(null, 0);
		checkNewCell("", 0);
		checkNewCell("123", 3);
	}

	private void checkNewCell(String value, int expSize) {
		TableCell cell = new TableCell(value);
		assertEquals(cell.getValue(), value);
		assertEquals(cell.getSize(), expSize);
	}

	@Test
	public void alignCellRight() {
		alignCell(Right);
	}

	@Test
	public void alignCellLeft() {
		alignCell(Left);
	}

	private void alignCell(Alignment a) {
		checkAlignCell(null, 0, a, "");
		checkAlignCell("", 0, a, "");
		checkAlignCell("123", 0, a, "123");
		checkAlignCell("12345", 0, a, "12345");
	}

	@Test
	public void alignLongCellLeft() {
		checkAlignCell(null, 5, Left, "     ");
		checkAlignCell("", 5, Left, "     ");
		checkAlignCell("123", 5, Left, "123  ");
		checkAlignCell("12345", 5, Left, "12345");
	}

	@Test
	public void alignLongCellRight() {
		checkAlignCell(null, 5, Right, "     ");
		checkAlignCell("", 5, Right, "     ");
		checkAlignCell("123", 5, Right, "  123");
		checkAlignCell("12345", 5, Right, "12345");
	}

	private void checkAlignCell(String value, int size, Alignment a, String exp) {
		TableCell cell = new TableCell(value);
		if (size > 0) {
			cell.setSize(size);
		}
		cell.align(a);
		assertEquals(cell.getValue(), exp);
	}
}
