package com.ganchurin.format;

public enum Alignment {
	Left("-"), Right("");

	private final String padSymbol;

	Alignment(String padSymbol) {
		this.padSymbol = padSymbol;
	}

	public String align(String value, int length) {
		String v = value == null ? "" : value;
		return String.format("%1$" + padSymbol + length + "s", v);
	}
}
