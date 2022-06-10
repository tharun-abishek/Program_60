package org.assignment.sixtyproblems;

/*Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345*/
import java.util.Scanner;

public class Problem60 {
	public static void main(String[] args) {
		Problem60 obj = new Problem60();
		obj.sumOfSeries();
	}

	void sumOfSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		int sum = 0, j = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum + j;
			j = (j * 10) + 1;
		}
		System.out.println(sum);
		sc.close();
	}
}
