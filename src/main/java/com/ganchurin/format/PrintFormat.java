package com.ganchurin.format;

public abstract class PrintFormat {

	abstract char getCornerChar();

	abstract PrintFormat setCornerChar(char c);

	abstract char getRowChar();

	abstract PrintFormat setRowChar(char c);

	abstract char getColumnChar();

	abstract PrintFormat setColumnChar(char c);

	abstract Alignment getAlignment();

	abstract PrintFormat setAlignment(Alignment alignment);

	public static PrintFormat getInstance() {
		return new SimplePrintFormat();
	}

}
