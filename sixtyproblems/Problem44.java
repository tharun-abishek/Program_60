package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem44 extends Duplicate {
	public static void main(String[] args) {
		Problem44 obj = new Problem44();
		obj.printDuplicate();
	}
}

class Duplicate {
	public void printDuplicate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Printing Duplicate Elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");

				}
			}
		}
		sc.close();
	}
}
