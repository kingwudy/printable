package com.ganchurin.table;

import org.junit.Before;
import org.junit.Test;

import static com.ganchurin.table.Side.*;
import static org.junit.Assert.assertEquals;

public class TableRowTest {

	TableRow row;
	TableCell c1, c2;

	@Before
	public void init() {
		row = new TableRow(0);
		c1 = new TableCell("first");
		c2 = new TableCell("second");
		row.register(c1);
		row.register(c2);
	}

	@Test
	public void getSize() {
		assertEquals(row.getSize(), 11);
	}

	@Test
	public void setBorder() {
		for (Side side : Side.values()) {
			row.setBorder(side);
			assertEquals(c1.hasBorder(side), true);
			assertEquals(c2.hasBorder(side), true);
		}
	}

	@Test
	public void hasNoBorder() {
		for (Side side : Side.values()) {
			assertEquals(row.hasBorder(side), false);
		}
	}

	@Test
	public void emptyColumnHasNoBorders() {
		TableRow row = new TableRow(0);
		for (Side side : Side.values()) {
			assertEquals(row.hasBorder(side), false);
		}
	}

	@Test
	public void hasLeftBorder() {
		c1.setBorder(LEFT);
		assertEquals(row.hasBorder(LEFT), true);
	}

	@Test
	public void hasRightBorder() {
		c2.setBorder(RIGHT);
		assertEquals(row.hasBorder(RIGHT), true);
	}

	@Test
	public void hasUpBorder() {
		c1.setBorder(UP);
		c2.setBorder(UP);
		assertEquals(row.hasBorder(UP), true);
	}

	@Test
	public void hasBottomBorder() {
		c1.setBorder(BOTTOM);
		c2.setBorder(BOTTOM);
		assertEquals(row.hasBorder(BOTTOM), true);
	}
}
