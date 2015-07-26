package com.ganchurin.view;

import com.ganchurin.model.DataSource;

public abstract class PrintFormat {

	abstract char getCornerChar();

	abstract PrintFormat setCornerChar(char c);

	abstract char getRowChar();

	abstract PrintFormat setRowChar(char c);

	abstract char getColumnChar();

	abstract PrintFormat setColumnChar(char c);

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
