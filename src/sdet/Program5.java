package sdet;

import java.util.Scanner;

// Palindrome Number check
public class Program5 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println("Number is palindrome");

		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
