package com.ganchurin.view;

public interface PrintFormat {

	char getCornerChar();

	PrintFormat setCornerChar(char c);

	char getRowChar();

	PrintFormat setRowChar(char c);

	char getColumnChar();

	PrintFormat setColumnChar(char c);

}