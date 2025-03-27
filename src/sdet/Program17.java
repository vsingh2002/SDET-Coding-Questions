package sdet;

// Find missing number in an array
public class Program17 {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i <= ar.length - 1; i++) {
			sum1 += ar[i];
		}
		for (int i = 1; i <= 11; i++) {
			sum2 += i;
		}
		int missing_number = sum2 - sum1;
		System.out.println("Missing number in an array is :" + missing_number);
	}

}
