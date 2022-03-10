package com.assignments;

/*Given a string and it contains characters.  
 * Check whether the given String is Palindrome or not (use String only).*/

public class a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabaa";
		int len = str.length();
		int i=0, j = len-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				System.out.println("No");
			i++;
			j--;
		}
		System.out.println("Yes");
	}


}
