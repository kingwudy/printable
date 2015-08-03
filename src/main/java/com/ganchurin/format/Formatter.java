package com.ganchurin.format;

import com.ganchurin.model.DataSource;
import com.ganchurin.table.*;

public class Formatter {

	private final PrintFormat format;

	public Formatter() {
		this.format = new SimplePrintFormat();
	}

	public Formatter(PrintFormat format) {
		this.format = format;
	}

	public String format(DataSource source) {
		Table table = new Table(source);
		setBorders(table);
		return print(table);
	}

	private void setBorders(Table table) {
		for (TableColumn column : table.getColumns()) {
			int size = column.getSize();
			column.setSize(size);
			column.align(format.getAlignment());
			if (column.order == 0) {
				column.setBorder(Side.LEFT);
			}
			column.setBorder(Side.RIGHT);
		}
		for (TableRow row : table.getRows()) {
			if (row.order == 0) {
				row.setBorder(Side.UP);
			}
			row.setBorder(Side.BOTTOM);
		}
	}

	private String print(Table table) {
		StringBuilder sb = new StringBuilder();
		for (TableRow row : table.getRows()) {
			StringBuilder upBuilder = new StringBuilder();
			StringBuilder vlBuilder = new StringBuilder();
			StringBuilder bmBuilder = new StringBuilder();
			for (TableCell cell : row.getCells()) {
				if (cell.hasBorder(Side.UP) && cell.hasBorder(Side.LEFT)) {
					upBuilder.append(format.getCornerChar());
				}
				if (cell.hasBorder(Side.UP)) {
					upBuilder.append(createDivider(cell.getSize()));
				}
				if (cell.hasBorder(Side.UP) && cell.hasBorder(Side.RIGHT)) {
					upBuilder.append(format.getCornerChar());
				}
				if (cell.hasBorder(Side.LEFT)) {
					vlBuilder.append(format.getColumnChar());
				}
				vlBuilder.append(cell.getValue());
				if (cell.hasBorder(Side.RIGHT)) {
					vlBuilder.append(format.getColumnChar());
				}
				if (cell.hasBorder(Side.BOTTOM) && cell.hasBorder(Side.LEFT)) {
					bmBuilder.append(format.getCornerChar());
				}
				if (cell.hasBorder(Side.BOTTOM)) {
					bmBuilder.append(createDivider(cell.getSize()));
				}
				if (cell.hasBorder(Side.BOTTOM) && cell.hasBorder(Side.RIGHT)) {
					bmBuilder.append(format.getCornerChar());
				}
			}
			if (upBuilder.length() != 0) sb.append(upBuilder).append("\n");
			sb.append(vlBuilder).append("\n");
			if (bmBuilder.length() != 0) sb.append(bmBuilder).append("\n");
		}
		return sb.toString();
	}

	private String createDivider(int size) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(format.getRowChar());
		}
		return sb.toString();
	}
}
