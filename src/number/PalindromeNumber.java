package number;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int palindrome = num;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
		if (palindrome == rev) {
			System.out.println("It's a palindrome number");
		} else {
			System.out.println("It's not a palindrome number");
		}
	}

}
