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

		int rows = source.getRowsCount();
		int cols = source.getColumnsCount() * 2 + 1;

		String rowDivider = buildRowDivider(cols);

		for (int row = 0; row < rows; row++) {
			if (sb.length() == 0) {
				sb.append(rowDivider);
			}
			for (int col = 0; col < cols; col++) {
				if (isDataColumn(col)) {
					sb.append(source.getValue(row, col / 2));
				} else {
					sb.append(getColumnChar());
				}
			}
			sb.append("\n");
			sb.append(rowDivider);
		}
		return sb.toString();
	}

	private String buildRowDivider(int cols) {
		StringBuilder sb = new StringBuilder();
		for (int col = 0; col < cols; col++) {
			char c = isDataColumn(col) ? getRowChar() : getCornerChar();
			sb.append(c);
		}
		sb.append("\n");
		return sb.toString();
	}

	private boolean isDataRow(int row) {
		return row % 2 == 1;
	}

	private boolean isDataColumn(int col) {
		return col % 2 == 1;
	}
}
