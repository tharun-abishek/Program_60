package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem5 extends Pattern {
	public static void main(String[] args) {
		Problem5 obj =new Problem5();
		obj.reducingAlphabets();
	}
}

class Pattern {

	public void reducingAlphabets() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0);
		int count = 1;
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			if (ch == ch1) {
				break;
			} else
				count++;
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (i + j <= count - 1) {
					System.out.print(ch);
				}
			}
			System.out.println();
			--ch;
		}
		sc.close();
	}
}
