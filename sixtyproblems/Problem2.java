package org.assignment.sixtyproblems;

import java.util.Scanner;

/*Write a program to print a letters from the user input character to 'Z' without using
strings.
Example 1:  input : X
Output : XYZ*/

public class Problem2 extends Printer {
	public static void main(String[] args) {
		Problem2 obj = new Problem2();
		obj.printingFollowUp();
	}
}

class Printer {
	public void printingFollowUp() {
		System.out.println("input: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		for (char alpha = ch; alpha <= 'Z'; alpha++) {
			System.out.print(alpha);
		}
		sc.close();
	}
}
