package com.ganchurin;

import com.ganchurin.format.PrintFormat;
import com.ganchurin.format.SimplePrintFormat;
import com.ganchurin.model.ArraySource;
import com.ganchurin.model.DataSource;

public class PeriodicTable {

	public static void main(String[] args) {
		String[][] array = new String[][]{
				{"/", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18"},
				{"1", "H", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "He"},
				{"2", "Li", "Be", "", "", "", "", "", "", "", "", "", "", "B", "C", "N", "O", "F", "Ne"},
				{"3", "Na", "Mg", "", "", "", "", "", "", "", "", "", "", "Al", "Si", "P", "S", "Cl", "Ar"},
				{"4", "K", "Ca", "Mg", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr"},
				{"5", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe"},
				{"6", "Cs", "Br", "*", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn"},
				{"7", "Fr", "Ra", "**", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Uut", "Fl", "Uup", "Lv", "Uus", "Uuo"},
				{"8", "Uue", "Ubn", "***", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}
		};

		DataSource source = new ArraySource(array);

		SimplePrintFormat spf = new SimplePrintFormat();
		spf.setCornerChar(' ');
		spf.setColumnChar(' ');
		spf.setRowChar(' ');

		String result = spf.format(source);

		System.out.println(result);
	}
}
