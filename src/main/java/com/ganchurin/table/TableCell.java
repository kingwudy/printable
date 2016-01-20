package com.ganchurin.table;

import com.ganchurin.format.align.Align;
import com.ganchurin.util.StringUtils;

import java.util.EnumMap;

public class TableCell implements TableItem {

	private String value;

	private int size;

	private EnumMap<Side, Boolean> borders = new EnumMap<>(Side.class);

	public TableCell(String value) {
		this.value = value;
		this.size = value == null ? 0 : value.length();
	}

	public String getValue() {
		return value;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public boolean hasBorder(Side side) {
		return borders.getOrDefault(side, false);
	}

	@Override
	public void setBorder(Side side) {
		borders.put(side, true);
	}

	@Override
	public void align(Align align) {
		value = StringUtils.align(value, size, align);
	}
}
