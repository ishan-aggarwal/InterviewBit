package com.arrays;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		Integer[] spam = new Integer[] { -2, -3, 4, -1, -2, 1, 5, -3 };
		List<Integer> asList = Arrays.asList(spam);

		System.out.println("Maximum contiguous sum is " + maxSubArray(asList));
	}

	// DO NOT MODFIY THE LIST.
	public static int maxSubArray(final List<Integer> a) {
		int size = a.size();
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		int position = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a.get(i);
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}
