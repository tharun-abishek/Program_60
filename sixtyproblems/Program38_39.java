package org.assignment.sixtyproblems;

import java.util.Scanner;

interface ArrayOperation {
	void largeElement(int[] arr);

	void printEvenPos(int[] arr);

	void printOddPos(int[] arr);

	void smallElement(int[] arr);
}

public class Program38_39 extends Operation {
	public static void main(String[] args) {
		Program38_39 obj = new Program38_39();
		obj.input();
	}
}

class Operation implements ArrayOperation {

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of the Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(
				" press 1 for Largest Element \n press 2 for Smallest Element \n press 3 for printing even pos element \n press 4 for printing odd pos elements \n press 5 for sum of array elements\n press 6 count and print elements of array");
		System.out.println(" Press 7 to copy array \n press 8 for printing duplicate elements");
		byte choice = sc.nextByte();
		switch (choice) {
		case 1:
			largeElement(arr);
			break;
		case 2:
			smallElement(arr);
			break;
		case 3:
			printEvenPos(arr);
			break;
		case 4:
			printOddPos(arr);
			break;
		case 5:
			printSumOfArray(arr);
			break;
		case 6:
			printElementsOfArray(arr);
			break;
		case 7:
			copyArrayToAnotherArr(arr);
			break;
		case 8:
			printDuplicateElements(arr);
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}

	@Override
	public void largeElement(int[] arr) {
		int large = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.print("Largest element in the above Array : " + large);
	}

	@Override
	public void smallElement(int[] arr) {
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.print("Smallest element in the above Array :" + small);
	}

	@Override
	public void printEvenPos(int[] arr) {
		System.out.println("Printing even position elements of the Array :");
		for (int i = 1; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	@Override
	public void printOddPos(int[] arr) {
		System.out.println(" Printing odd position elements of the Array :");
		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	void printSumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of all elements in an array : " + sum);
	}

	void printElementsOfArray(int[] arr) {
		System.out.println("The number of Elements in an Array is :" + arr.length);
		System.out.println("And elements are :");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();

	}

	void copyArrayToAnotherArr(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("Successfully copied to Second Array");
		for (int x : arr2) {
			System.out.print(x + " ");
		}
		System.out.println();

	}

	void printDuplicateElements(int[] arr) {
		System.out.println("Printing Duplicates in an Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}
}
