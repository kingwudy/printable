package com.ganchurin.view;

import com.ganchurin.model.DataSource;

interface PrintFormat {

	char getCornerChar();

	PrintFormat setCornerChar(char c);

	char getRowChar();

	PrintFormat setRowChar(char c);

	char getColumnChar();

	PrintFormat setColumnChar(char c);

	String format(DataSource source);

}
