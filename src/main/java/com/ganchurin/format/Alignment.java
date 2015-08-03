package com.ganchurin.format;

public enum Alignment {
	Left("-"), Right("");

	public final String padSymbol;

	Alignment(String padSymbol) {
		this.padSymbol = padSymbol;
	}
}
