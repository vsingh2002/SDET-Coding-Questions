package sdet;

import java.util.Scanner;

//Count number of digits in a number ex- 1234 output-4
public class Program6 {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	while(num!=0)
	{
		int d=num%10;
		count++;
		num=num/10;

	}
	System.out.println(count);
	
}
}
