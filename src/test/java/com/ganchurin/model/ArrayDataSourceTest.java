package com.ganchurin.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ArrayDataSourceTest {

	private ArrayDataSource source;

	@Before
	public void init() {
		String[] array = new String[]{"a", "b"};
		source = new ArrayDataSource(array);
	}

	@Test
	public void getValue() {
		assertTrue(source.getValue(0, 0).equals("a"));
		assertTrue(source.getValue(0, 1).equals("b"));
	}

	@Test
	public void getRowsCount() {
		assertTrue(source.getRowsCount() == 1);
	}

	@Test
	public void getColumnsCount() {
		assertTrue(source.getColumnsCount() == 2);
	}
}
