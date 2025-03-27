package sdet;

// Sum of elements in an array
public class Program14 {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 10 };
		int sum = 0;
//		for (int i = 0; i <= arr.length - 1; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("Sum of Array elements is :" + sum);
		for (int value : arr) {
			sum = sum + value;
		}
		System.out.println("Sum of Array elements is :" + sum);
	}

}
