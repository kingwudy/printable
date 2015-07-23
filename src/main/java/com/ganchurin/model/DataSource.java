package com.ganchurin.model;

public interface DataSource {

	String getValue(int row, int col);

	void setValue(int row, int col, String value);

	int getRowsCount();

	int getColumnsCount();

}
