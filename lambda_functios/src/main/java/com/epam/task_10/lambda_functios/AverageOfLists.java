package com.epam.task_10.lambda_functios;

import java.util.*;

public class AverageOfLists {
	public static void main(String[] args) {
//		Integer[] list = {2, 3, 4, 5, 6, 7, 8};
//		List<Integer> listNum = Arrays.asList(list);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());
		sc.close();
		}
		double Average = average(al);
		System.out.println(Average);
	  }	
	public static Double average(List<Integer> list) {
		return list.stream()
				  .mapToInt(i -> i)
				  .average()
				  .getAsDouble();
	}

}
