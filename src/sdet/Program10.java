package sdet;

import java.util.Scanner;

// Prime Number
public class Program10 {
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}

}
