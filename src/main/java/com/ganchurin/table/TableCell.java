package com.ganchurin.table;

import com.ganchurin.format.Alignment;

import java.util.EnumMap;

import static com.ganchurin.util.StringUtils.trimToEmpty;

public class TableCell implements ValueItem {

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
	public void align(Alignment alignment) {
		if (size != 0) {
			value = String.format("%1$" + alignment.padSymbol + size + "s", trimToEmpty(value));
		} else {
			value = "";
		}
	}
}
