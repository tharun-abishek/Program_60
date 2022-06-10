package org.assignment.sixtyproblems;

/*Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.
Example: Input : {1, 2, 3, 4, 5, 6, 7}
Output: {7, 1, 6, 2, 5, 3, 4}*/
import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		new Sorting().alternateSorting();
	}
}

class Sorting extends Problem10 {
	void alternateSorting() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		System.out.println("Enter the Elements in an Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int a = 0;
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			arr1[a++] = arr[j];
			arr1[a++] = arr[i];
		}
		if (arr.length % 2 == 1)
			arr1[a] = arr[arr.length / 2];
		System.out.println("Sorted Array");
		for (int x : arr1) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
