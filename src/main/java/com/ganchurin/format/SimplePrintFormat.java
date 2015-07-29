package com.ganchurin.format;

import com.ganchurin.model.Columns;
import com.ganchurin.model.Columns.Column;
import com.ganchurin.model.DataSource;

import java.util.List;

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
		List<Column> columns = Columns.collectFrom(source);

		StringBuilder sb = new StringBuilder();

		int rows = source.getRowsCount();

		String rowDivider = createRowDivider(columns);

		sb.append(rowDivider);
		for (int row = 0; row < rows; row++) {
			for (Column column : columns) {
				sb.append(getColumnChar());
				String value = source.getValue(row, column.order);
				if (value == null) value = "";
				value = String.format("%1$-" + column.width + "s", value);
				sb.append(value);
			}
			sb.append(getColumnChar()).append("\n");
			sb.append(rowDivider);
		}
		return sb.toString();
	}

	private String createRowDivider(List<Column> columns) {
		StringBuilder sb = new StringBuilder();

		for (Column column : columns) {
			sb.append(getCornerChar());
			for (int i = 0; i < column.width; i++) {
				sb.append(getRowChar());
			}
		}
		sb.append(getCornerChar()).append("\n");

		return sb.toString();
	}
}
