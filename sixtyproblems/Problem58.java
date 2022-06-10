package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem58 {
	public static void main(String[] args) {
		Problem58 obj = new Problem58();
		obj.hollowDiamond();
	}

	void hollowDiamond() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int stars = 2 * n;
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < stars / 2; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * n - stars; j++) {
				System.out.print("-");
			}
			for (int k = 0; k < stars / 2; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < n - 1)
				stars = stars - 2;
			else
				stars = stars + 2;
		}
		sc.close();
	}
}
