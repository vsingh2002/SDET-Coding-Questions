package sdet;

import java.util.Scanner;

//Palindrome String
public class Program4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.nextLine();
		// String st = "Vishal";
		String rev = "";
		String palindrome = st;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			rev = ch + rev;
		}

		if (rev.equals(palindrome)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
