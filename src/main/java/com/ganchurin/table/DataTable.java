package com.ganchurin.table;

import com.ganchurin.model.DataSource;
import com.ganchurin.view.PrintFormat;

public interface DataTable {

	DataSource getSource();

	DataTable setSource(DataSource source);

	PrintFormat getPrintFormat();

	DataTable setPrintFormat(PrintFormat format);

}
