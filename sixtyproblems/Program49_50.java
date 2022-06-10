package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Program49_50 {
	public static void main(String[] args) {
		Program49_50 obj = new Program49_50();
		obj.choice();
	}

	void choice() {
		System.out.print("Enter your choice 1 for * and 2 for num reverse pattern: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			PrintingPattern();
			break;
		case 2:
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			PrintingPattern(n);
			break;
		default:
			System.out.println("Enter valid option");
		}
	}

	void PrintingPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void PrintingPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i); j++) {
				System.out.print((n - i) + " ");
			}
			System.out.println();
		}
	}
}
