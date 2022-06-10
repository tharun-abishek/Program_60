package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem33 extends Alphabet {
	public static void main(String[] args) {
		Problem33 obj = new Problem33();
		obj.alphabetOrNot();
	}
}

class Alphabet {
	public void alphabetOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is an Alphabet");
		} else {
			System.out.println(ch + " is not an Alphabet");
		}
		sc.close();
	}
}
