package com.ganchurin.util;

public class StringUtils {

	public static String trimToEmpty(String s) {
		return s == null ? "" : s.trim();
	}
}
