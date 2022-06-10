package org.assignment.sixtyproblems;

/*Program to Calculate the Sum of Natural Numbers and find the largest digit of the
sum*/
import java.util.Scanner;

public class Problem34 {
	public static void main(String[] args) {
		Problem34 obj = new Problem34();
		obj.sumOfNaturalNumbers();
	}

	private void sumOfNaturalNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Range of the natural number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The summation of " + n + " natural numbers is: " + sum);
		int temp1 = sum;
		int large = Integer.MIN_VALUE;
		while (sum != 0) {
			int temp = sum % 10;
			if (temp > large) {
				large = temp;
			}
			sum = sum / 10;
		}
		System.out.println("In " + temp1 + " the largest digit is: " + large);
		sc.close();
	}
}
