package com.ganchurin.format;

public abstract class PrintFormat {

	abstract char getCornerChar();

	abstract void setCornerChar(char c);

	abstract char getRowChar();

	abstract void setRowChar(char c);

	abstract char getColumnChar();

	abstract void setColumnChar(char c);

	abstract Alignment getAlignment();

	abstract void setAlignment(Alignment alignment);

	public static PrintFormat getInstance() {
		return new SimplePrintFormat();
	}

}
