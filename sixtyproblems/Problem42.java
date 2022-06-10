package org.assignment.sixtyproblems;

import java.util.HashMap;
import java.util.Scanner;

public class Problem42 extends Frequency {
	public static void main(String[] args) {
		Problem42 obj = new Problem42();
		obj.frequencyOfElements();
	}
}

class Frequency {
	public void frequencyOfElements() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i]) + 1);
			else
				hm.put(arr[i], 1);
		}
		System.out.println(hm);
	}
}
