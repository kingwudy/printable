package com.ganchurin.model;

import java.util.Map;

public class MapSource implements DataSource {

	private final String[][] data;

	public MapSource(Map<String, String> map) {
		data = new String[map.size()][2];
		int i = 0;
		for (Map.Entry<String, String> me : map.entrySet()) {
			data[i][0] = me.getKey();
			data[i][1] = me.getValue();
			i++;
		}
	}

	@Override
	public String getValue(int row, int col) {
		return data[row][col];
	}

	@Override
	public int getRowsCount() {
		return data.length;
	}

	@Override
	public int getColumnsCount() {
		return 2;
	}
}
