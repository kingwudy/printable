package com.ganchurin.format;

public class PrintFormatFactory {

	private PrintFormatFactory() {
	}

	public static PrintFormat createFormat() {
		return new SimplePrintFormat();
	}
}
