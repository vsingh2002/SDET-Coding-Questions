package sdet;

import java.util.Arrays;

// Check equality of two arrays
public class Program16 {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 5, 7 };
		int arr2[] = { 1, 2, 7, 5 };
		// Approach 1 Using equals method
		/*
		 * boolean status = Arrays.equals(arr1, arr2); if (status == true) {
		 * System.out.println("Arrays are equals"); } else {
		 * System.out.println("Arrays are not equals"); }
		 * 
		 */
		// Approach 2
		boolean status = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i <= arr1.length - 1; i++) {
				if (arr1[i] != arr2[i]) {
					status = false;
					break;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are not equals");
		}
	}

}
