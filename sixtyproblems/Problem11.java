package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Problem11 obj = new Problem11();
		obj.multiDimensionalArrayRotation();
	}

	void multiDimensionalArrayRotation() {
		int a[][] = new int[15][15];
		Scanner sc = new Scanner(System.in);
		int r, c, i, j;
		System.out.print("Enter the no of rows: ");
		r = sc.nextInt();
		System.out.print("Enter the no of Column: ");
		c = sc.nextInt();
		int trans[][] = new int[10][10];
		System.out.println("Enter the array values");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				trans[j][i] = a[i][j];
			}
		}
		System.out.println("Transpose of the array");
		for (i = 0; i < c; i++) {
			for (j = 0; j < r; j++) {
				System.out.print(trans[i][j] + " ");
			}
			System.out.println("");
		}
		for (i = 0; i < c; i++) {
			int start = 0;
			int end = r - 1;
			while (start < end) {
				int temp = trans[i][start];
				trans[i][start] = trans[i][end];
				trans[i][end] = temp;
				start++;
				end--;
			}
		}
		System.out.println("The Result after array rotation");
		for (i = 0; i < c; i++) {
			for (j = 0; j < r; j++) {
				System.out.print(trans[i][j] + " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}
