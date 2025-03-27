package sdet;

import java.util.Scanner;

// Count odd and even digits in a number
public class Program7 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		while (num != 0)

		{
			int d = num % 10;
			if (d % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;

		}

		System.out.println(oddCount);
		System.out.println(evenCount);
	}

}
