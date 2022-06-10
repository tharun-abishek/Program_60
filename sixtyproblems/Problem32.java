package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem32 extends Zero {
	public static void main(String[] args) {
		Problem32 obj = new Problem32();
		obj.print();
	}

	@Override
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n == 0) {
			super.print();
		} else if (n > 0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is negative");
		sc.close();
	}
}

class Zero {
	public void print() {
		System.out.println("Number is neither positive or negative");
	}
}
