package examples;

import java.util.ArrayList;
import java.util.List;

public class BigOExamples {

	/*
	Time Complexity
	 */

	public static void linear (int[] arr) throws Exception {
		// O(n)
		for (int num : arr) {
			System.out.println(num);
		}
	}

	public static void slowLinear (int[] arr) throws Exception {
		// Still O(n) because we perform a print for each loop, but the outer loop causes this to be much slower
		for (int num : arr) {
			for (int i=0; i<1000; i++) {
				System.out.println(num);
			}
		}
	}

	public static void square (int[] arr) throws Exception {
		// O(n^2) -- Each loop performs O(n) twice == O(n*n)
		for (int num : arr) {
			for (int num2 : arr) {
				System.out.println(num * num2);
			}
		}
	}

	public static void multipleVar (int[] arr1, int[] arr2) throws Exception {
		// O(n+m) -- We have two separate variables at linear time
		for (int num : arr1) {
			System.out.println(num);
		}

		for (int num : arr1) {
			System.out.println(num);
		}

		for (int num : arr2) {
			System.out.println(num);
		}
	}

	public static void partialSum (int[] arr) throws Exception {
		// O(n^2) -- Partial sum of series compresses down
		for (int i=0; i < arr.length; i++) {
			for (int j=i; j < arr.length; j++) {
				System.out.println(arr[i] + arr[j]);
			}
		}
	}

	public static void binarySearch (int[] arr) throws Exception {
		// O(n log n)
		// O(logn) means that somewhere in your algorithm, the input is being reduced by a percentage at every step.


	}

	/*
	Space Complexity
	 */

	public static void constantSpace (int[] arr) throws Exception {
		// O(1) -- We are not allocating any further memory, just printing output
		for (int num : arr) {
			System.out.println(num);
		}
	}

	public static void linearSpace (int[] arr) throws Exception {
		// O(n) -- For every input we allocate an item
		List<Integer> doubledNums = new ArrayList<>();

		for (int num : arr) {
			doubledNums.add(num * 2);
		}
	}

	public static void fastLinearSpace (int[] arr) throws Exception {
		// O(n) -- n/100 is still n as n approaches infinity
		List<Integer> nums = new ArrayList<>();
		int oneHundredth = arr.length / 100;

		for (int i=0; i < oneHundredth; i++) {
			nums.add(arr[i]);
		}
	}

	public static void multipleVarSpace (int[] arr1, int[] arr2) throws Exception {
		//O(n*m)

	}
}
