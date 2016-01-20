package com.ganchurin.table;

import com.ganchurin.format.align.Align;

interface TableItem {

	int getSize();

	void setSize(int size);

	boolean hasBorder(Side side);

	void setBorder(Side side);

	void align(Align align);

}
