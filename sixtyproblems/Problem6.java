package org.assignment.sixtyproblems;

public class Problem6 {
	public static void main(String[] args) {
		Problem6 obj = new Problem6();
		obj.rollNoPrinting();
	}

	private void rollNoPrinting() {

		int group1[] = new int[10], group2[] = new int[10], group3[] = new int[10], group4[] = new int[10];
		int iterator = 0, value = 101;
		for (int i = 0; i < 5; i++) {
			group1[iterator] = value++;
			group2[iterator] = value++;
			group3[iterator] = value++;
			group4[iterator] = value++;
			iterator++;
		}
		System.out.print("Group 1:\n");
		printFunc(group1);
		System.out.print("Group 2:\n");
		printFunc(group2);
		System.out.print("Group 3:\n");
		printFunc(group3);
		System.out.print("Group 4:\n");
		printFunc(group4);
	}

	void printFunc(int group[]) {
		for (int i = 0; i < 5; i++) {
			System.out.println(group[i]);
		}
	}
}
