package sdet;

// Swap two numbers
// int a=10 , b=20 
public class Program1 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		// Logic 1
		/*
		 * int temp; System.out.println("Before swapping a=" + a + " b=" + b); temp = a;
		 * a = b; b = temp; System.out.println("After swapping a=" + a + " b=" + b);
		 */
		// Logic 2
		/*
		 * a = a + b; b = a - b; a = a - b; System.out.println("After swapping a=" + a +
		 * " b=" + b);
		 */
		// Logic 3 Using * and / but a and b values should not be 0
		/*
		 * a = a * b; // 10*20=200 b = a / b;// 200/20=10 a = a / b;// 200/10=20
		 * System.out.println("After swapping a=" + a + " b=" + b);
		 */
		// Logic 3 Using XOR(^)
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping a=" + a + " b=" + b);

	}

}
