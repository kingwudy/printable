package com.ganchurin.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

	@Test
	public void testTrimToEmpty() {
		assertEquals(StringUtils.trimToEmpty(null), "");
		assertEquals(StringUtils.trimToEmpty("  "), "");
		assertEquals(StringUtils.trimToEmpty(" 123 "), "123");
	}
}
