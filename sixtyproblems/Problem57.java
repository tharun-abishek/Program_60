package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem57 {
	public static void main(String[] args) {
		Problem57 obj = new Problem57();
		obj.crossNumberPattern();
	}

	void crossNumberPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String str = sc.next();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			int k = length - i - 1;
			for (int j = 0; j < length; j++) {
				if (i == j) {
					System.out.print(str.charAt(i));
				} else if (j == k) {
					System.out.print(str.charAt(k));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
