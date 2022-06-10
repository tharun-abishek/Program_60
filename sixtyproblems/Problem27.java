package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem27 extends Swap {
	public static void main(String[] args) {
		Problem27 obj = new Problem27();
		obj.swapTwoNumbers();
	}
}

class Swap {
	public void swapTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.printf("b:%d",b=a+b-(a=b));
		System.out.printf("%na:%d",a);
		sc.close();

	}
}
