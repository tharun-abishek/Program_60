package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem25 extends Division {
	public static void main(String[] args) {
		Problem25 obj = new Problem25();
		obj.quotientAndRemainder();
	}
}

class Division {
	void quotientAndRemainder() {
		int quotient = 0, remainder = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Divident: ");
		int divident = sc.nextInt();
		System.out.print("Enter the Divisor: ");
		int divisor = sc.nextInt();
		try {
			quotient = divident / divisor;
			remainder = divident % divisor;
			System.out.println("Quotient of two numbers are : " + quotient);
			System.out.println("Remainder of two numbers are : " + remainder);
		} catch (ArithmeticException e) {
			System.out.println("OOPS!!!Enter a non-zero value for divisor");
		}
		sc.close();
	}
}
