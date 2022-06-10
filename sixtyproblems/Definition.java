package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Definition extends Problem48 {
	void revNumberPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 1;
		int space = n - 1;
		int k = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}

			for (int j = 0; j < count; j++) {
				if (j < count / 2) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(k-- + " ");
				}
			}
			space--;
			count = count + 2;
			System.out.println();
				}
	}
	void numberPattern1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 1;
		int space = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			int k = 1;
			for (int j = 0; j < count; j++) {
				if (j < count / 2) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(k-- + " ");
				}
			}
			count = count + 2;
			space--;
			System.out.println();
			sc.close();
		}
	}
}



