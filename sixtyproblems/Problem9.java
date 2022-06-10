package org.assignment.sixtyproblems;

public class Problem9 {
public static void main(String[] args) {
	Problem9 obj = new Problem9();
	obj.formatSorting();
}

	void formatSorting() {
		int[] arr1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] arr2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15 };
		int n = arr1.length + arr2.length;
		int[] arr3 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		for (int i = 0; i < arr3.length; i++) {
			boolean dub = true;
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[i] == arr3[j]) {
					dub = false;
					break;
				}
			}
			if (dub) {
				System.out.print(arr3[i] + " ");
			}
		}
		System.out.println();
	}
}
