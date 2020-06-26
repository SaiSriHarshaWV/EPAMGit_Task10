package com.epam.task_10.lambda_functios;

public class PalinCheck {
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
            i++; 
            j--; 
        }
        return true; 
	}
}
