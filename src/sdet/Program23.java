package sdet;

import java.util.Arrays;

// Sort elements in an array using build in method
public class Program23
{
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,12,9,10,3};
		System.out.println("Array before sorting is");
		int n=ar.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	//	Arrays.parallelSort(ar); Approach 1
		Arrays.sort(ar); // Approach 2
		System.out.println("Array after sorting is");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
