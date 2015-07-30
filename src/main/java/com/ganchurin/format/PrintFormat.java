package com.ganchurin.format;

public interface PrintFormat {

	char getCornerChar();

	PrintFormat setCornerChar(char c);

	char getRowChar();

	PrintFormat setRowChar(char c);

	char getColumnChar();

	PrintFormat setColumnChar(char c);

	Alignment getAlignment();

	PrintFormat setAlignment(Alignment alignment);

}
