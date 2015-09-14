package com.ganchurin.table;

import com.ganchurin.format.Align;

interface TableItem {

	int getSize();

	void setSize(int size);

	boolean hasBorder(Side side);

	void setBorder(Side side);

	void align(Align align);

}
