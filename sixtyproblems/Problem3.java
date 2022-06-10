package org.assignment.sixtyproblems;

import java.util.Scanner;

/* Input : 12345
Output : 12345 - 54321 = -41976*/
public class Problem3 extends Reverse {
	public static void main(String[] args) {
		Problem3 obj = new Problem3();
		obj.numberReverseAndDiff();
	}
	
}

 class Reverse {
	public void numberReverseAndDiff() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		int number = sc.nextInt();
		int temp = number;
		int reverse = 0;
		while (temp != 0) {
			reverse = reverse * 10 + (temp % 10);
			temp = temp / 10;
		}
		System.out.println(number + "-" + reverse + "=" + (number - reverse));
		sc.close();
	
	}
}

