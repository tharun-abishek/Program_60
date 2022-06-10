package org.assignment.sixtyproblems;

import java.util.Scanner;

public class Problem29 extends Vowel {
	public static void main(String[] args) {
		Problem29 obj = new Problem29();
		obj.vowelOrConsonant();
	}
}

class Vowel {
	void vowelOrConsonant() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Alphabet: ");
		String vowel = sc.next();
		String ch = vowel.toLowerCase();
		switch (ch) {
		case "a":
			System.out.println("Entered alphabet is " + ch + ": vowel");
			break;
		case "e":
			System.out.println("Entered alphabet is " + ch + ": vowel");
			break;
		case "i":
			System.out.println("Entered alphabet is " + ch + ": vowel");
			break;
		case "0":
			System.out.println("Entered alphabet is " + ch + ": vowel");
			break;
		case "u":
			System.out.println("Entered alphabet is " + ch + ": vowel");
			break;
		default:
			System.out.println("Entered alphabet is " + ch + ":  consonant");
		}
		sc.close();
	}
}
