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
		assertEquals(StringUtils.align(null, 5, Align.LEFT), "     ");
		assertEquals(StringUtils.align("", 5, Align.LEFT), "     ");
		assertEquals(StringUtils.align("123", 5, Align.LEFT), "123  ");
		assertEquals(StringUtils.align("1234", 5, Align.LEFT), "1234 ");
		assertEquals(StringUtils.align("12345", 5, Align.LEFT), "12345");
		assertEquals(StringUtils.align("123456", 5, Align.LEFT), "12345");

		assertEquals(StringUtils.align(null, 5, Align.RIGHT), "     ");
		assertEquals(StringUtils.align("", 5, Align.RIGHT), "     ");
		assertEquals(StringUtils.align("123", 5, Align.RIGHT), "  123");
		assertEquals(StringUtils.align("1234", 5, Align.RIGHT), " 1234");
		assertEquals(StringUtils.align("12345", 5, Align.RIGHT), "12345");
		assertEquals(StringUtils.align("123456", 5, Align.RIGHT), "12345");

		assertEquals(StringUtils.align(null, 5, Align.CENTER), "     ");
		assertEquals(StringUtils.align("", 5, Align.CENTER), "     ");
		assertEquals(StringUtils.align("123", 5, Align.CENTER), " 123 ");
		assertEquals(StringUtils.align("1234", 5, Align.CENTER), " 1234");
		assertEquals(StringUtils.align("12345", 5, Align.CENTER), "12345");
		assertEquals(StringUtils.align("123456", 5, Align.CENTER), "12345");
	}
}
