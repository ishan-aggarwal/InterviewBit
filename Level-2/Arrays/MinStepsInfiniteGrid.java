package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class MinStepsInfiniteGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<Integer> l1 = new ArrayList<>();
		// l1.add(0);
		// l1.add(1);
		// l1.add(1);
		//
		// List<Integer> l2 = new ArrayList<>();
		// l2.add(0);
		// l2.add(1);
		// l2.add(2);
		//
		// System.out.println(coverPoints(l1, l2));

		List<Integer> l3 = new ArrayList<>();
		l3.add(0);
		l3.add(15);
		l3.add(-5);

		List<Integer> l4 = new ArrayList<>();
		l4.add(0);
		l4.add(10);
		l4.add(-15);

		System.out.println("l3 : l4 - " + coverPoints(l3, l4));

	}

	public static int coverPoints(List<Integer> X, List<Integer> Y) {
		int x = 0;
		int i, j, k;
		for (i = 1; i < X.size(); ++i) {
			j = Math.abs(X.get(i) - X.get(i - 1));
			k = Math.abs(Y.get(i) - Y.get(i - 1));
			x += (j > k) ? j : k;
		}
		return x;

	}

}
