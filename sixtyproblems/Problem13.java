package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Problem13 obj = new Problem13();
	//	obj.areaSquare();
	//	obj.areaRectangle();
	//	obj.areaCylinder();
	}

	void areaCylinder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder ");
		double r = sc.nextDouble();
		System.out.println("Enter the Height of cylinder ");
		double h = sc.nextDouble();
		double value = 2 * 3.14 * r * (r + h);
		System.out.println("The Area of cylinder is " + value);

	}

	void areaRectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle : ");
		int b = sc.nextInt();
		System.out.println("Area of the rectangle is : " + (l * b));

	}

	void areaSquare() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the side: ");
		int side = sc.nextInt();
		System.out.print("Area of an Square is : " + (side * side));
		sc.close();
	}
}
