package com.ganchurin.format;

import com.ganchurin.model.DataSource;

public interface PrintFormat {

	char getCornerChar();

	void setCornerChar(char c);

	char getRowChar();

	void setRowChar(char c);

	char getColumnChar();

	void setColumnChar(char c);

	Align getAlign();

	void setAlign(Align align);

	int getColumnSize();

	void setColumnSize(int size);

	String format(DataSource source);

}
