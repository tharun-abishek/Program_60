package org.assignment.sixtyproblems;

/*Write a program to evaluate the polynomial equation*/
import java.util.Scanner;

public class Problem16 {
	public static void main(String[] args) {
		Problem16 obj = new Problem16();
		obj.quadraticEquation();
	}

	private void quadraticEquation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter the b value");
		int b = sc.nextInt();
		System.out.println("Enter the c value");
		int c = sc.nextInt();
		double r = (b * b) - (4 * a * c);
		if (r < 0) {
			r = r * -1;
			double d = Math.sqrt(r);
			double x1 = ((-b) / (2 * a));
			double x2 = ((d) / (2 * a));
			System.out.println("The First Root of  : " + x1 + " + i" + x2);
			System.out.println("The Second Root is : " + x1 + " - i" + x2);
		} else {
			double d = Math.sqrt(r);
			double x1 = ((-b + d) / (2 * a));
			double x2 = ((-b - d) / (2 * a));
			System.out.println("The First Root is : " + d);
			System.out.println("The Second Root is : " + x2);
		}

	}
}
