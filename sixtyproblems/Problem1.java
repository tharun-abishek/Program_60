package org.assignment.sixtyproblems;

import java.util.Scanner;

/*Write a single program to generate a multiplicaiton and subtraction table for a given
number*/
public class Problem1 {
	public static void main(String[] args) {
		Problem1 p1 = new Problem1();
		p1.multiplication();
		p1.subtraction();
	}

	void multiplication() {
		System.out.println("The Multiplication table is :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		//sc.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	void subtraction() {

		System.out.println("The Subtraction table is :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for (int i = n; i <= 10 + n; i++) {
			System.out.println(n + " - " + i + " = " + (i - n));
		}
		sc.close();
	}
}
