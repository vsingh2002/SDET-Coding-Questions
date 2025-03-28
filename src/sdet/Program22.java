package sdet;

import java.util.Arrays;

// Sort Array using Bubble Sort
public class Program22 {
	public static void main(String[] args) {
		int ar[] = { 2, 4, 6, 7, 3, 1 };
		int n = ar.length;
		// System.out.println("Array before sorting is :" + Arrays.toString(ar));
		System.out.print("Array before sorting is :"+" ");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n - 1; i++) // Number of Passes
		{
			for (int j = 0; j < n - 1; j++) // Iteration in each pass
			{
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}

			}

		}

		// System.out.println("Array after sorting is :" + Arrays.toString(ar));
		System.out.print("Array after sorting is :");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
