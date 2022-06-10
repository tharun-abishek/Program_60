package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem28 {
	public static void main(String[] args) {
		Problem28 obj = new Problem28();
		// obj.positiveOrNegative();
		// obj.evenOrOdd();
		obj.largestOfThreeNumbers();
	}

	void largestOfThreeNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First value: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the Second value: ");
		int n2 = sc.nextInt();
		System.out.print("Enter the Third value: ");
		int n3 = sc.nextInt();
		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number");
		else
			System.out.println(n3 + " is the largest number");

	}

	void positiveOrNegative() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println(n + " is a positive number");
		} else if (n == 0) {
			System.out.println(n + " is Zero");
		} else {
			System.out.println(n + " is a negative number");
		}
	}

	void evenOrOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is an even number");
		} else
			System.out.println(n + " is a odd number");
		sc.close();
	}
}
