package org.assignment.sixtyproblems;

import java.util.Scanner;

/*Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
   4 5 6
  7 8 9 10*/
public class Problem56 {
	public static void main(String[] args) {
		Problem56 obj = new Problem56();
		obj.pyramidPatternWithIncreasingNumber();
	}

	void pyramidPatternWithIncreasingNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int n = sc.nextInt();
		int count = 1, space = (n) / 2 - 1;
		for (int i = 1; i <= n;) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < (i + count); j++) {
				System.out.print(j + " ");
			}
			i = i + count;
			count++;
			space--;
			System.out.println();
			sc.close();
		}
	}
}
