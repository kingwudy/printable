package com.ganchurin.table;

import com.ganchurin.format.Alignment;

interface ValueItem {

	int getSize();

	void setSize(int size);

	boolean hasBorder(Side side);

	void setBorder(Side side);

	void align(Alignment alignment);

}
