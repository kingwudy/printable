package com.ganchurin.model;

import java.util.ArrayList;
import java.util.List;

public class Columns {

	private Columns() {
	}

	public static class Column {
		public final int order;
		public final int width;

		public Column(int order, int width) {
			this.order = order;
			this.width = width;
		}
	}

	public static List<Column> collectFrom(DataSource source) {
		int rows = source.getRowsCount();
		int cols = source.getColumnsCount();

		List<Column> columns = new ArrayList<>();

		for (int col = 0; col < cols; col++) {
			int width = 0;
			for (int row = 0; row < rows; row++) {
				String value = source.getValue(row, col);
				int valWidth = value == null ? 0 : value.length();
				width = Math.max(width, valWidth);
			}
			Column column = new Column(col, width);
			columns.add(column);
		}

		return columns;
	}
}
