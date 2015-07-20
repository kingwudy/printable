package com.ganchurin.model;

public interface Model {

	String getValue(int row, int col);

	void setValue(int row, int col);

	int getRowsCount();

	int getColumnsCount();

}
