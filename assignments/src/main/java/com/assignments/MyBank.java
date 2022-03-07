package com.assignments;

import java.util.Scanner;

public class MyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1\t Create Account");
		System.out.println("2\t Credit");
		System.out.println("3\t Debit");
		System.out.println("4\t Transfer Amount");
		System.out.println("5\t View Balance");
		System.out.println("6\t Do you want to continue");
		int key = scan.nextInt();
		System.out.println("Enter the option: " + key);
		
		switch(key){
		case 1:
			System.out.println("1\t Create Account");
			break;
		case 2:
			System.out.println("2\t Credit");
			break;
		case 3:
			System.out.println("3\t Debit");
			break;
		case 4:
			System.out.println("4\t Transfer Amount");
			break;
		case 5:
			System.out.println("5\t View Balance");
			break;
		case 6:
			System.out.println("6\t Do you want to continue");
			break;
		default: System.out.println("Invalid choice");
		}
		scan.close();
	}

}
