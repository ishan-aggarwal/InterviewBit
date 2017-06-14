package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String s[]) {
		Integer[] array = new Integer[] { 3, 30, 34, 5, 9 };

		List<Integer> asList = Arrays.asList(array);
		System.out.println(largestNumber(asList));

	}

	public static String largestNumber(final List<Integer> a) {

		List<String> strList = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			strList.add(a.get(i).toString());
		}

		Collections.sort(strList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strList.size(); i++) {
			sb = sb.append(strList.get(i));
		}
		
		
		while(sb.charAt(0) == '0' && sb.length() > 1) {
			sb = sb.deleteCharAt(0);
		}
		
		return sb.toString();

	}
}
