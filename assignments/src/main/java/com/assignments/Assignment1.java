package com.assignments;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of units");
		int units = scan.nextInt();
		int consumption = 0;
		
		if(units > 0 && units <= 50) {
			consumption = units;
		}
		else if(units > 50 && units <= 100) {
			consumption = 50 + ((units-50) *2);
		}
		else if(units > 100 && units <= 200) {
			consumption = 50 + 100 + ((units-100) *3);
		}
		else if(units > 200 && units <= 400) {
			consumption = 50 + 100+ 300 + ((units-200) *4);
		}
		else if(units > 400) {
			consumption = 50 + 100+ 300 + 800 + ((units-400) *5);
		}
		System.out.println("Answer ******Assignment 1******* \n");
		System.out.println("Consumption charrge is Rs. " + consumption + "\n");
		scan.close();
	}

}
