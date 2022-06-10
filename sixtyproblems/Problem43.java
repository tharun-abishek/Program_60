package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem43 {
	public static void main(String[] args) {
		Problem43 obj = new Problem43();
		obj.input();
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(" press 1 for left rotate \n press 2 for right rotate");
		byte option = sc.nextByte();
		switch (option) {
		case 1:
			leftRotate(arr);
			break;
		case 2:
			rightRotate(arr);
			break;
		default:
			System.out.println("press valid option");
		}
	}

	void leftRotate(int[] arr) {
		System.out.print("Enter number of times to be rotated: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
		System.out.println("After rotating:");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	void rightRotate(int[] arr) {
		System.out.print("Enter number of times to be rotated: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			int last = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
