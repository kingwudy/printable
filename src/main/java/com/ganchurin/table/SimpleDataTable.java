package com.ganchurin.table;

import com.ganchurin.model.DataSource;
import com.ganchurin.view.PrintFormat;

public class SimpleDataTable implements DataTable {

	private final DataSource source;
	private final PrintFormat format;

	public SimpleDataTable(DataSource source, PrintFormat format) {
		this.source = source;
		this.format = format;
	}

	@Override
	public DataSource getSource() {
		return source;
	}

	@Override
	public SimpleDataTable setSource(DataSource source) {
		return new SimpleDataTable(source, format);
	}

	@Override
	public PrintFormat getPrintFormat() {
		return format;
	}

	@Override
	public SimpleDataTable setPrintFormat(PrintFormat format) {
		return new SimpleDataTable(source, format);
	}
}
