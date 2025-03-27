package sdet;

// Print even and Odd numbers in an array 
public class Program15 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 7, 9, 13, 15 };
		System.out.println("Even numbers in an Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Odd numbers in an Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
