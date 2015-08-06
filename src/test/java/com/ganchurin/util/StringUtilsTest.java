package com.ganchurin.util;

import com.ganchurin.format.Align;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

	@Test
	public void trimToEmpty() {
		assertEquals(StringUtils.trimToEmpty(null), "");
		assertEquals(StringUtils.trimToEmpty("  "), "");
		assertEquals(StringUtils.trimToEmpty(" 123 "), "123");
	}

	@Test
	public void align() {
		assertEquals(StringUtils.align(null, 5, Align.Left), "     ");
		assertEquals(StringUtils.align("", 5, Align.Left), "     ");
		assertEquals(StringUtils.align("123", 5, Align.Left), "123  ");
		assertEquals(StringUtils.align("12345", 5, Align.Left), "12345");
		assertEquals(StringUtils.align("1234567", 5, Align.Left), "12345");

		assertEquals(StringUtils.align(null, 5, Align.Right), "     ");
		assertEquals(StringUtils.align("", 5, Align.Right), "     ");
		assertEquals(StringUtils.align("123", 5, Align.Right), "  123");
		assertEquals(StringUtils.align("1234567", 5, Align.Right), "12345");
	}
}
