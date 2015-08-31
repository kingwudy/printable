package com.ganchurin.model;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class MapSourceTest {

	private MapSource source;

	@Before
	public void init() {
		String[] array = new String[]{"a", "b"};
		Map<String, String> map = new HashMap<>();
		for (String s : array) {
			map.put(s, s + s);
		}
		source = new MapSource(map);
	}

	@Test
	public void getValue() {
		assertTrue(source.getValue(0, 0).equals("a"));
		assertTrue(source.getValue(0, 1).equals("aa"));
		assertTrue(source.getValue(1, 0).equals("b"));
		assertTrue(source.getValue(1, 1).equals("bb"));
	}

	@Test
	public void getRowsCount() {
		assertTrue(source.getRowsCount() == 2);
	}

	@Test
	public void getColumnsCount() {
		assertTrue(source.getColumnsCount() == 2);
	}
}
