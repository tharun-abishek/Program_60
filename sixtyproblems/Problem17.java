package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem17 {
	public static void main(String[] args) {
		Problem17 obj = new Problem17();
		obj.areaConcentric();
	}

	void areaConcentric() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Circle Radius: ");
		double r1 = sc.nextDouble();
		System.out.print("Enter the Second Circle Radius: ");
		double r2 = sc.nextDouble();
		double value = (3.14 * ((r1 * r1) - (r2 * r2)));
		System.out.println("The area of the space between the circles " + value);
		sc.close();
	}
}
