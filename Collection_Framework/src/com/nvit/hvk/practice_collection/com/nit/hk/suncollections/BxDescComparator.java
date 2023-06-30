package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

import java.util.Comparator;

public class BxDescComparator implements Comparator<B> {

	@Override
	public int compare(B o1, B o2) {
		return o2.getX() - o1.getX();
	}

}


