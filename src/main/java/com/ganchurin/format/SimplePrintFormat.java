package com.ganchurin.format;

import com.ganchurin.model.DataSource;

public class SimplePrintFormat extends PrintFormat {

	private final static char DefaultCornerChar = '+';
	private final static char DefaultRowChar = '-';
	private final static char DefaultColChar = '|';
	private final static Align DefaultAlign = Align.Left;

	private char cornerChar = DefaultCornerChar;
	private char rowChar = DefaultRowChar;
	private char colChar = DefaultColChar;
	private Align align = DefaultAlign;

	@Override
	public char getCornerChar() {
		return cornerChar;
	}

	@Override
	public void setCornerChar(char cornerChar) {
		this.cornerChar = cornerChar;
	}

	@Override
	public char getRowChar() {
		return rowChar;
	}

	@Override
	public void setRowChar(char rowChar) {
		this.rowChar = rowChar;
	}

	@Override
	public char getColumnChar() {
		return colChar;
	}

	@Override
	public void setColumnChar(char colChar) {
		this.colChar = colChar;
	}

	@Override
	public Align getAlign() {
		return align;
	}

	@Override
	public void setAlign(Align align) {
		this.align = align;
	}

	@Override
	public String format(DataSource source) {
		Formatter formatter = new Formatter(this);
		return formatter.format(source);
	}
}
