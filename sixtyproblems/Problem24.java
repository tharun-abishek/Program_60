package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem24 extends ASCII {
	public static void main(String[] args) {
		Problem24 obj = new Problem24();
		obj.printingAsciiValue();
	}
}

class ASCII {
	public void printingAsciiValue() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		int a = ch;
		System.out.println(ch + "=" + a);
		sc.close();
	}
}
