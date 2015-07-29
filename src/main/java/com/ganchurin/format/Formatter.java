package com.ganchurin.format;

import com.ganchurin.model.Columns;
import com.ganchurin.model.DataSource;

import java.util.List;

public class Formatter {

	private final PrintFormat format;

	public Formatter(PrintFormat format) {
		this.format = format;
	}

	public String format(DataSource source) {
		List<Columns.Column> columns = Columns.collectFrom(source);

		StringBuilder sb = new StringBuilder();

		int rows = source.getRowsCount();

		String rowDivider = createRowDivider(columns);

		sb.append(rowDivider);
		for (int row = 0; row < rows; row++) {
			for (Columns.Column column : columns) {
				sb.append(format.getColumnChar());
				String value = source.getValue(row, column.order);
				if (value == null) value = "";
				value = String.format("%1$-" + column.width + "s", value);
				sb.append(value);
			}
			sb.append(format.getColumnChar()).append("\n");
			sb.append(rowDivider);
		}
		return sb.toString();
	}

	private String createRowDivider(List<Columns.Column> columns) {
		StringBuilder sb = new StringBuilder();

		for (Columns.Column column : columns) {
			sb.append(format.getCornerChar());
			for (int i = 0; i < column.width; i++) {
				sb.append(format.getRowChar());
			}
		}
		sb.append(format.getCornerChar()).append("\n");

		return sb.toString();
	}
}
