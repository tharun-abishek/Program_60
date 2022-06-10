package org.assignment.sixtyproblems;

/*Input: a1b10
Output: abbbbbbbbbb*/
import java.util.Scanner;

public class Problem53 {
	public static void main(String[] args) {
		Problem53 obj = new Problem53();
		obj.printingAlphabetBasedOnNumber();
	}

	void printingAlphabetBasedOnNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			int j = i;
			while (j < str.length() && str.charAt(j) >= '0' && str.charAt(j) <= '9') {
				j++;
			}
			if (j > i) {
				int num = Integer.parseInt(str.substring(i, j));
				for (int k = 0; k < num; k++) {
					System.out.print(str.charAt(i - 1));
				}
			}
			i = j;
		}
		sc.close();
	}

}
