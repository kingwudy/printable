package com.ganchurin.table;

import com.ganchurin.format.Alignment;

import java.util.ArrayList;
import java.util.List;

public class TableRow implements ValueItem {

	public final int order;

	public TableRow(int order) {
		this.order = order;
	}

	private List<TableCell> cells = new ArrayList<>();

	@Override
	public int getSize() {
		int size = 0;
		for (TableCell cell : cells) {
			size += cell.getSize();
		}
		return size;
	}

	@Override
	public void setSize(int size) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void align(Alignment alignment) {
		for (TableCell cell : cells) {
			cell.align(alignment);
		}
	}

	@Override
	public void setBorder(Side side) {
		for (TableCell cell : cells) {
			cell.setBorder(side);
		}
	}

	@Override
	public boolean hasBorder(Side side) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	public void register(TableCell cell) {
		cells.add(cell);
	}

	// @todo delete?
	public List<TableCell> getCells() {
		return cells;
	}
}