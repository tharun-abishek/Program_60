package org.assignment.sixtyproblems;

/*Write a program to print the alphabet 'C' with the stars based on the given numbers
Eg 1:  Input: 4
        Output:
****
*
*
*****/
import java.util.Scanner;

public class Problem55 {
	public static void main(String[] args) {
		Problem55 obj = new Problem55();
		obj.PrintingAlphabetPattern();
	}

	void PrintingAlphabetPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0 || i == n - 1 || j == 0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
