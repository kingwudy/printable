package com.ganchurin.table;

import org.junit.Before;
import org.junit.Test;

import static com.ganchurin.table.Side.*;
import static org.junit.Assert.assertEquals;

public class TableColumnTest {

	TableColumn column;
	TableCell c1, c2;

	@Before
	public void init() {
		column = new TableColumn(0);
		c1 = new TableCell("c1");
		c2 = new TableCell("c2");
		column.register(c1);
		column.register(c2);
	}

	@Test
	public void setBorder() {
		for (Side side : Side.values()) {
			column.setBorder(side);
			assertEquals(c1.hasBorder(side), true);
			assertEquals(c2.hasBorder(side), true);
		}
	}

	@Test
	public void hasNoBorder() {
		for (Side side : Side.values()) {
			assertEquals(column.hasBorder(side), false);
		}
	}

	@Test
	public void emptyColumnHasNoBorders() {
		TableColumn column = new TableColumn(0);
		for (Side side : Side.values()) {
			assertEquals(column.hasBorder(side), false);
		}
	}

	@Test
	public void hasLeftBorder() {
		column.setBorder(LEFT);
		assertEquals(column.hasBorder(LEFT), true);
	}

	@Test
	public void hasRightBorder() {
		column.setBorder(RIGHT);
		assertEquals(column.hasBorder(RIGHT), true);
	}

	@Test
	public void hasUpBorder() {
		c1.setBorder(UP);
		assertEquals(column.hasBorder(UP), true);
	}

	@Test
	public void hasBottomBorder() {
		c2.setBorder(BOTTOM);
		assertEquals(column.hasBorder(BOTTOM), true);
	}
}
