package part1;

import java.util.Scanner;
public class Numbers {
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
	public static void main (String[] args) {
//		Comparable interface is used to compare an object of the same class with an instance of that class
//		=> Non-primitive datatype
		Integer[] intList;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print ("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		intList = new Integer[size];
		System.out.println ("\nEnter the numbers...");
		for (int i = 0; i < size; i++)
			intList[i] = scan.nextInt();
		
//		Sorting.selectionSort(intList);
		Sorting.insertionSort(intList);
		System.out.println ("\nYour numbers in sorted order...");
		for (int i = 0; i < size; i++)
			System.out.print(intList[i] + " ");
		System.out.println ();
	}
}
