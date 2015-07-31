package com.ganchurin.format;

import org.junit.Test;

import static com.ganchurin.format.Alignment.Left;
import static com.ganchurin.format.Alignment.Right;
import static org.junit.Assert.assertTrue;

public class AlignmentTest {

	@Test
	public void testLeftAlign() {
		assertTrue(Left.align("", 5).equals("     "));
		assertTrue(Left.align(null, 5).equals("     "));
		assertTrue(Left.align("123", 5).equals("123  "));
	}

	@Test
	public void testRightAlign() {
		assertTrue(Right.align("", 5).equals("     "));
		assertTrue(Right.align(null, 5).equals("     "));
		assertTrue(Right.align("123", 5).equals("  123"));
	}
}
