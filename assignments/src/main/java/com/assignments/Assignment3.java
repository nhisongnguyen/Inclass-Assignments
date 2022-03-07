package com.assignments;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
		int len = nums.length;
		int even_sum = 0, odd_sum = 0;
		
		for(int i = 0; i<len; i++) {
			if(nums[i] %2 == 0) {
				even_sum += nums[i];
			}
			else {
				odd_sum += nums[i];
			}
		}
		
		System.out.println("Answer ******Assignment 3******* \n");
		System.out.println("Sum of evens: " + even_sum + "\n" + "Sum of odds: " + odd_sum);
	}

}
