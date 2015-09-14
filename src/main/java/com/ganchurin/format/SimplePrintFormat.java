package com.ganchurin.format;

import com.ganchurin.model.DataSource;

public class SimplePrintFormat implements PrintFormat {

	private final static char DefaultCornerChar = '+';
	private final static char DefaultRowChar = '-';
	private final static char DefaultColChar = '|';

	private final static Align DefaultAlign = Align.LEFT;

	private final static int DefaultSize = 0;

	private char cornerChar = DefaultCornerChar;
	private char rowChar = DefaultRowChar;
	private char colChar = DefaultColChar;

	private Align align = DefaultAlign;

	private int columnSize = DefaultSize;

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
	public int getColumnSize() {
		return columnSize;
	}

	@Override
	public void setColumnSize(int size) {
		columnSize = size;
	}

	@Override
	public String format(DataSource source) {
		Formatter formatter = new Formatter(this);
		return formatter.format(source);
	}
}
