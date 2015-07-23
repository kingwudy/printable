package com.ganchurin.model;

public class ArrayDataSource implements DataSource {

	private final String[] array;

	public ArrayDataSource(String[] array) {
		this.array = array;
	}

	@Override
	public String getValue(int row, int col) {
		return array[col];
	}

	@Override
	public void setValue(int row, int col, String value) {
		array[col] = value;
	}

	@Override
	public int getRowsCount() {
		return 1;
	}

	@Override
	public int getColumnsCount() {
		return array.length;
	}
}
