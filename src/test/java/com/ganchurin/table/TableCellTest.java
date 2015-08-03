package com.ganchurin.table;

import com.ganchurin.format.Alignment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.ganchurin.format.Alignment.Left;
import static com.ganchurin.format.Alignment.Right;
import static org.junit.Assert.assertTrue;

public class TableCellTest {

	TableCell c1;
	TableCell c2;
	TableCell c3;
	TableCell c4;
	List<TableCell> cells = new ArrayList<>();

	@Before
	public void init() {
		c1 = new TableCell("");
		c2 = new TableCell(null);
		c3 = new TableCell("123");
		c4 = new TableCell("12345");
		cells.addAll(Arrays.asList(c1, c2, c3, c4));
	}

	@Test
	public void alignCellLeft() {
		checkAlignCell(Left);
	}

	@Test
	public void alignCellRight() {
		checkAlignCell(Right);
	}

	private void checkAlignCell(Alignment alignment) {
		for (TableCell cell : cells) {
			cell.align(alignment);
		}

		checkValue(c1, "");
		checkValue(c2, "");
		checkValue(c3, "123");
		checkValue(c4, "12345");
	}

	@Test
	public void alignLongCellLeft() {
		for (TableCell cell : cells) {
			cell.setSize(5);
			cell.align(Left);
		}

		checkValue(c1, "     ");
		checkValue(c2, "     ");
		checkValue(c3, "123  ");
		checkValue(c4, "12345");
	}

	@Test
	public void alignLongCellRight() {
		for (TableCell cell : cells) {
			cell.setSize(5);
			cell.align(Right);
		}

		checkValue(c1, "     ");
		checkValue(c2, "     ");
		checkValue(c3, "  123");
		checkValue(c4, "12345");
	}

	@After
	public void clear() {
		cells.clear();
	}

	private void checkValue(TableCell cell, String value) {
		assertTrue(Objects.equals(cell.getValue(), value));
	}
}
