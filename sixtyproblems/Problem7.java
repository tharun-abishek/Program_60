package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Problem7 obj = new Problem7();
		obj.crossNumberPattern();
	}

	void crossNumberPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String str = sc.next();
		int length = str.length();
		int n = length;
		int m = str.length()-1;
		for (int i = 1; i <= length * 2 + 1; i++) {
			for (int j = 1; j <= length; j++) {
				if ((j == n))
					System.out.print(str.charAt(i-1));
				else if ((i == j + 4))
					System.out.print(i);
						
				else {
					System.out.print(" ");
				}
			}		 
			n--;
			m--;
			System.out.println();
		}
		sc.close();
	}
}
/*
 * for (int i=0;i<length ;i++ ) { int n=length-i-1; for (int j=0;j<length ;j++ )
 * { if (j==i||j==n) { System.out.print(str.charAt(i)); } else {
 * System.out.print(" "); } } System.out.println();
 */
