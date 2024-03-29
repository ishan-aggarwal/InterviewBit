// Single Number

//Problem Description
//
//Given an array of integers A, every element appears twice except for one. Find that single one.
//
//
//NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//
//
//Problem Constraints
//2 <= |A| <= 2000000
//
//0 <= A[i] <= INTMAX
//
//
//
//Input Format
//First and only argument of input contains an integer array A.
//
//
//
//Output Format
//Return a single integer denoting the single element.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 2, 3, 1]
//Input 2:
//
// A = [1, 2, 2]
//
//
//Example Output
//Output 1:
//
// 3
//Output 2:
//
// 1
//
//
//Example Explanation
//Explanation 1:
//
//3 occurs once.
//Explanation 2:
//
//1 occurs once.

package level3.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public static int singleNumber(final List<Integer> A) {

		Integer xorValue = 0;
		for (Integer num : A) {
			xorValue = xorValue ^ num;
		}
		return xorValue;
	}

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		A.addAll(Arrays.asList(1, 2, 2, 3, 1));
		System.out.println(singleNumber(A));
	}
}
