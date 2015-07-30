package com.ganchurin.model;

public class ArraySource implements DataSource {

	private final String[][] array;

	public ArraySource(String[] array) {
		this.array = new String[1][];
		this.array[0] = array;
	}

	public ArraySource(String[][] array) {
		this.array = array;
	}

	@Override
	public String getValue(int row, int col) {
		return array[row][col];
	}

	@Override
	public int getRowsCount() {
		return array.length;
	}

	@Override
	public int getColumnsCount() {
		return array[0].length;
	}
}
