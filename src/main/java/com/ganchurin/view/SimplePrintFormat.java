package com.ganchurin.view;

import com.ganchurin.model.DataSource;

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

	@Override
	public String format(DataSource source) {
		StringBuilder sb = new StringBuilder();

		int rows = source.getRowsCount() * 2 + 1;
		int cols = source.getColumnsCount() * 2 + 1;

		for (int row = 0; row < rows; row++) {
			if (!isDataRow(row)) {
				for (int j = 0; j < cols; j++) {
					if (!isDataColumn(j)) {
						sb.append(getCornerChar());
					} else {
						sb.append(getRowChar());
					}
				}
				sb.append("\n");
				continue;
			}
			for (int col = 0; col < cols; col++) {
				if (isDataColumn(col)) {
					sb.append(source.getValue(row / 2, col / 2));
				} else {
					sb.append(getColumnChar());
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private boolean isDataRow(int row) {
		return row % 2 == 1;
	}

	private boolean isDataColumn(int col) {
		return col % 2 == 1;
	}
}
