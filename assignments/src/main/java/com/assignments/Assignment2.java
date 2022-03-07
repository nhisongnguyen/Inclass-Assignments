package com.assignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int add = a + b;
		int subtract = a - b;
		int multiply = a * b;
		int divide = a/b;
		
		System.out.println("Answer ******Assignment 2******* \n");
		System.out.println("a + b = " + add + "\n" + "a - b = " + subtract + "\n" + "a * b = " + multiply + "\n" + "a / b = " + divide + "\n");
		
		scan.close();
	}

}
