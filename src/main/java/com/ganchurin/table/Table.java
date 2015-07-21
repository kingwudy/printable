package com.ganchurin.table;

import com.ganchurin.model.Model;
import com.ganchurin.view.PrintFormat;

public interface Table {

	Model getModel();

	Table setModel(Model model);

	PrintFormat getPrintFormat();

	Table setPrintFormat(PrintFormat format);

}
