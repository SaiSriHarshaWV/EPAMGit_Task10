package com.epam.task_10.lambda_functios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PalinList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<n;i++){
			al.add(sc.next());
		sc.close();
		}
		ArrayList<String> FilteredList = PalinList.filterList(al, PalinCheck::isPalindrome);
		System.out.println(FilteredList);
		
	  }	
	public static ArrayList<String> filterList(ArrayList<String> al, Predicate<String> predicate){
		ArrayList<String> result = new ArrayList<String>();
		for(String n : al){
			if(predicate.test(n)){
				result.add(n);
			}
		}
		return result;
	}

	
}
