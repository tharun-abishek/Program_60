package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem54 {
	public static void main(String[] args) {
		Problem54 obj = new Problem54();
		obj.sortingAscendingAndDescending();

	}

	private void sortingAscendingAndDescending() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of the Array: ");
		int len = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0, m = 1; i < arr.length || m < arr.length; i = i + 2, m = m + 2) {
			for (int j = i + 2, n = m + 2; j < arr.length || n < arr.length; j = j + 2, n = n + 2) {
				if (j < arr.length && arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (n < arr.length && arr[n] < arr[m]) {
					int temp = arr[m];
					arr[m] = arr[n];
					arr[n] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
