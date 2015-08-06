package com.ganchurin.util;

import com.ganchurin.format.Align;

public class StringUtils {

	public static String trimToEmpty(String s) {
		return s == null ? "" : s.trim();
	}

	public static String align(String str, int size, Align align) {
		String s = trimToEmpty(str);
		int length = s.length();
		int offset = size - length;
		if (offset <= 0) {
			return s.substring(0, length + offset);
		} else {
			switch (align) {
				case Left:
					return s + spaces(offset);
				case Right:
					return spaces(offset) + s;
				default:
					throw new IllegalArgumentException("Unknown align: " + align);
			}
		}
	}

	private static String spaces(int cnt) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			sb.append(' ');
		}
		return sb.toString();
	}
}
