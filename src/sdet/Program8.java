package sdet;

import java.util.Scanner;

// Sum of digits in a number 123=6
public class Program8 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum += d;
			num /= 10;
		}
		System.out.println("Sum of digits of a number is :" + sum);
	}
}
