package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem59 {
	public static void main(String[] args) {
		Problem59 obj = new Problem59();
		obj.substringOrNot();
	}

	private void substringOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String1: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the String you wish to check: ");
		String str2 = sc.next();
		int index = str1.indexOf(str2);
		System.out.println(index);
		sc.close();
	}
}
