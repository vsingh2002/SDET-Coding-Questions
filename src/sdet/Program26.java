package sdet;

import java.util.Scanner;

// Count Words in a String
public class Program26 {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine(); // Welcome to Java
		int count = 1;

		for (int i = 0; i < st.length() - 1; i++) {
			if ((st.charAt(i) == ' ') && (st.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a String is :" + count);

	}

}
