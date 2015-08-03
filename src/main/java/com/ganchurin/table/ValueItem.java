package com.ganchurin.table;

import com.ganchurin.format.Alignment;

interface ValueItem {

	int getSize();

	void setSize(int size);

	void align(Alignment alignment);

	boolean hasBorder(Side side);

	void setBorder(Side side);

}
