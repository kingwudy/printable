package com.ganchurin.table;

import com.ganchurin.format.Alignment;

import java.util.ArrayList;
import java.util.List;

public class TableColumn implements ValueItem {

	public final int order;

	public TableColumn(int order) {
		this.order = order;
	}

	private List<TableCell> cells = new ArrayList<>();

	@Override
	public int getSize() {
		int size = 0;
		for (TableCell cell : cells) {
			size = Math.max(size, cell.getSize());
		}
		return size;
	}

	@Override
	public void setSize(int size) {
		for (TableCell cell : cells) {
			cell.setSize(size);
		}
	}

	@Override
	public boolean hasBorder(Side side) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void setBorder(Side side) {
		for (TableCell cell : cells) {
			cell.setBorder(side);
		}
	}

	@Override
	public void align(Alignment alignment) {
		for (TableCell cell : cells) {
			cell.align(alignment);
		}
	}

	public void register(TableCell cell) {
		cells.add(cell);
	}

	public List<TableCell> getCells() {
		return cells;
	}
}
