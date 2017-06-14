package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaveArray {

	public static void main(String[] args) {

		Integer[] array = new Integer[] { 4, 1, 6, 3, 2 };

		List<Integer> asList = Arrays.asList(array);
		System.out.println(waveArray(asList));
	}

	private static List<Integer> waveArray(List<Integer> a) {

		ArrayList<Integer> temp = new ArrayList<>();
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);

		for (int i = 1; i < a.size(); i = i + 2) {
			temp.add(a.get(i));
			temp.add(a.get(i - 1));
		}

		if (a.size() % 2 == 1) {
			temp.add(a.get(a.size() - 1));
		}

		return temp;
	}

}
