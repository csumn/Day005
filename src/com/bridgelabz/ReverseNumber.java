package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int number, remainder, reverseNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		number = scanner.nextInt();
		while(number >0) {
			remainder = number %10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number/10;
		}
		System.out.println("reverse number is : " +reverseNumber);
	}
}
