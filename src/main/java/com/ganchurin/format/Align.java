package com.ganchurin.format;

public enum Align {
	Left("-"), Right("");

	public final String padSymbol;

	Align(String padSymbol) {
		this.padSymbol = padSymbol;
	}
}
