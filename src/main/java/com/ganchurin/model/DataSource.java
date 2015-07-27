package com.ganchurin.model;

public interface DataSource {

	String getValue(int row, int col);

	int getRowsCount();

	int getColumnsCount();

}
