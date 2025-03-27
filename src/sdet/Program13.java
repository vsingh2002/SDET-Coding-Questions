package sdet;

import java.util.Scanner;

// Factorial of a number
public class Program13 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of a number is :" + fact);
	}

}
