package org.assignment.sixtyproblems;
/*Using Recursion reverse the string such as
Eg 1:  Input: one two three
       Output: three two one*/

import java.util.Scanner;

public class Problem52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		Problem52 obj = new Problem52();
		obj.recursionReverse(str, 0);
		sc.close();
	}

	void recursionReverse(String a, int k) {
		if (a.indexOf(" ", k) > -1) {
			recursionReverse(a, a.indexOf(" ", k) + 1);
			System.out.print(a.substring(k, a.indexOf(" ", k)) + " ");
		} else {
			System.out.print(a.substring(k) + " ");
		}
	}
}
