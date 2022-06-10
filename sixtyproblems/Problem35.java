package org.assignment.sixtyproblems;

/*Program to Find Factorial of a Number and the factorial number's sum of digits.*/
import java.util.Scanner;

public class Problem35 {
	public static void main(String[] args) {
		Problem35 obj = new Problem35();
		obj.factorial();
	}

	void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(n + " the factorial is " + fact);
		int sum = 0;
		while (fact != 0) {
			int temp = fact % 10;
			sum = sum + temp;
			fact = fact / 10;
		}
		System.out.println("The sum of the factorial digits is : " + sum);
		sc.close();
	}
}
