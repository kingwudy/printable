package com.ganchurin.format;

public class SimplePrintFormat extends PrintFormat {

	private final static char DefaultCornerChar = '+';
	private final static char DefaultRowChar = '-';
	private final static char DefaultColChar = '|';
	private final static Alignment DEFAULT_ALIGNMENT = Alignment.Left;

	private char cornerChar = DefaultCornerChar;
	private char rowChar = DefaultRowChar;
	private char colChar = DefaultColChar;
	private Alignment alignment = DEFAULT_ALIGNMENT;

	public SimplePrintFormat() {
	}

	public SimplePrintFormat(char cornerChar, char rowChar, char colChar, Alignment alignment) {
		this.cornerChar = cornerChar;
		this.rowChar = rowChar;
		this.colChar = colChar;
		this.alignment = alignment;
	}

	@Override
	public char getCornerChar() {
		return cornerChar;
	}

	@Override
	public SimplePrintFormat setCornerChar(char c) {
		return new SimplePrintFormat(c, rowChar, colChar, alignment);
	}

	@Override
	public char getRowChar() {
		return rowChar;
	}

	@Override
	public SimplePrintFormat setRowChar(char c) {
		return new SimplePrintFormat(cornerChar, c, colChar, alignment);
	}

	@Override
	public char getColumnChar() {
		return colChar;
	}

	@Override
	public SimplePrintFormat setColumnChar(char c) {
		return new SimplePrintFormat(cornerChar, rowChar, c, alignment);
	}

	@Override
	public Alignment getAlignment() {
		return alignment;
	}

	@Override
	public PrintFormat setAlignment(Alignment alignment) {
		return new SimplePrintFormat(cornerChar, rowChar, colChar, alignment);
	}
}
