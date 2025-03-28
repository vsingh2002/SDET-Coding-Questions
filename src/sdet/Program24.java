package sdet;

// Remove Junk or Special Characters in String
public class Program24 {
	public static void main(String[] args) {
		String s = "@#$%&! Selenium #$%& Java";
		String st = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("After replacing ");
		System.out.print(st);

	}

}
