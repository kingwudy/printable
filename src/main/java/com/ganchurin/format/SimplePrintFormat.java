package com.ganchurin.format;

public class SimplePrintFormat implements PrintFormat {

	private final static char DefaultCornerChar = '+';
	private final static char DefaultRowChar = '-';
	private final static char DefaultColChar = '|';

	private char cornerChar = DefaultCornerChar;
	private char rowChar = DefaultRowChar;
	private char colChar = DefaultColChar;

	public SimplePrintFormat() {
	}

	public SimplePrintFormat(char cornerChar, char rowChar, char colChar) {
		this.cornerChar = cornerChar;
		this.rowChar = rowChar;
		this.colChar = colChar;
	}

	@Override
	public char getCornerChar() {
		return cornerChar;
	}

	@Override
	public SimplePrintFormat setCornerChar(char c) {
		return new SimplePrintFormat(c, this.rowChar, this.colChar);
	}

	@Override
	public char getRowChar() {
		return rowChar;
	}

	@Override
	public SimplePrintFormat setRowChar(char c) {
		return new SimplePrintFormat(this.cornerChar, c, this.colChar);
	}

	@Override
	public char getColumnChar() {
		return colChar;
	}

	@Override
	public SimplePrintFormat setColumnChar(char c) {
		return new SimplePrintFormat(this.cornerChar, this.rowChar, c);
	}
}
