package sdet;

import java.util.Scanner;

// Fibonacci Series
public class Program11 {
	public static void main(String[] args) {
		System.out.println("Enter the number of terms");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i < num; i++) {
			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}
