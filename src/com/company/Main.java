package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n >= 0 && n < 100) {
			if (n < 10) {
				System.out.println("DIGIT");
			}
			if (n > 9) {
				System.out.println("NUM");
			}
		} else {
			System.out.println("OTHER");
		}


	}
}
