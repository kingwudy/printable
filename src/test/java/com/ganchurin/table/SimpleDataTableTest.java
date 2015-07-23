package com.ganchurin.table;

import com.ganchurin.model.ArrayDataSource;
import com.ganchurin.view.SimplePrintFormat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimpleDataTableTest {

	private final String[] array = new String[1];
	private final ArrayDataSource source = new ArrayDataSource(array);
	private final SimplePrintFormat format = new SimplePrintFormat();

	private SimpleDataTable table;

	@Before
	public void init() {
		table = new SimpleDataTable(source, format);
	}

	@Test
	public void getDataSource() {
		assertTrue(table.getSource() == source);
	}

	@Test
	public void setDataSource() {
		ArrayDataSource source = new ArrayDataSource(array);
		SimpleDataTable table = this.table.setSource(source);

		assertTrue(this.table != table);
		assertTrue(table.getSource() == source);
	}

	@Test
	public void getPrintFormat() {
		assertTrue(table.getPrintFormat() == format);
	}

	@Test
	public void setPrintFormat() {
		SimplePrintFormat format = new SimplePrintFormat();
		SimpleDataTable table = this.table.setPrintFormat(format);

		assertTrue(this.table != table);
		assertTrue(table.getPrintFormat() == format);
	}

}
