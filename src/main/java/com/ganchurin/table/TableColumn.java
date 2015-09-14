package com.ganchurin.table;

import com.ganchurin.format.Align;

import java.util.ArrayList;
import java.util.List;

public class TableColumn implements TableItem {

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
		if (cells.size() == 0) {
			return false;
		}
		switch (side) {
			case UP:
				return cells.get(0).hasBorder(side);
			case BOTTOM:
				return cells.get(cells.size() - 1).hasBorder(side);
			case LEFT:
			case RIGHT:
				for (TableCell cell : cells) {
					if (!cell.hasBorder(side)) {
						return false;
					}
				}
				return true;
			default:
				throw new IllegalArgumentException("Unknown side: " + side);
		}
	}

	@Override
	public void setBorder(Side side) {
		for (TableCell cell : cells) {
			cell.setBorder(side);
		}
	}

	@Override
	public void align(Align align) {
		setSize(getSize());
		for (TableCell cell : cells) {
			cell.align(align);
		}
	}

	public void register(TableCell cell) {
		cells.add(cell);
	}

	public List<TableCell> getCells() {
		return cells;
	}
}
