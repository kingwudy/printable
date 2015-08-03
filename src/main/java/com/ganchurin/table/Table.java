package com.ganchurin.table;

import com.ganchurin.model.DataSource;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private final List<TableRow> rows;
	private final List<TableColumn> columns;

	public Table(DataSource source) {
		int rowCnt = source.getRowsCount();
		int colCnt = source.getColumnsCount();

		rows = new ArrayList<>(rowCnt);
		columns = new ArrayList<>(colCnt);

		for (int row = 0; row < rowCnt; row++) {
			for (int col = 0; col < colCnt; col++) {
				String value = source.getValue(row, col);
				register(row, col, value);
			}
		}
	}

	private void register(int row, int col, String value) {
		TableCell cell = new TableCell(value);
		if (rows.size() == row) {
			rows.add(new TableRow(row));
		}
		rows.get(row).register(cell);
		if (columns.size() == col) {
			columns.add(new TableColumn(col));
		}
		columns.get(col).register(cell);
	}

	public List<TableRow> getRows() {
		return rows;
	}

	public List<TableColumn> getColumns() {
		return columns;
	}
}
