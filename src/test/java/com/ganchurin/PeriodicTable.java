package com.ganchurin;

import com.ganchurin.format.PrintFormat;
import com.ganchurin.model.ArraySource;
import com.ganchurin.model.DataSource;

public class PeriodicTable {

	public static void main(String[] args) {
		String[][] array = new String[][]{
				{"/", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"},
				{"1", "H", "", "", "", "", "", "", "", "", "", "", ""},
				{"2", "Li", "Be", "", "", "", "", "", "", "", "", "", ""},
				{"3", "Na", "Mg", "", "", "", "", "", "", "", "", "", ""},
				{"4", "K", "Ca", "Mg", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn"},
				{"5", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd"},
				{"6", "Cs", "Br", "", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg"},
				{"7", "Fr", "Ra", "", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn"}
		};

		DataSource source = new ArraySource(array);

		String result = PrintFormat.getInstance().format(source);

		System.out.println(result);
	}
}
