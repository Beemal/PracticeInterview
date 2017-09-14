package com.onSiteInterview.practice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SprintTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[4];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(getMostVisited(arr,n));
	}

	private static int getMostVisited(int[] arr, int n) {
		
		if(!isValid(n)){
			return 0;
		}
		int from = 0, to = 1;
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i=0; i<arr.length-1; i++){
			from = arr[i];
			to = arr[i+1];
			if(from > to){
				//swap
				from = arr[i+1];
				to = arr[i];
			}
			for(int j=from; j<=to; j++){
				if(!map.containsKey(j)){
					map.put(j, 1);
				}else{
					map.put(j, 1+map.get(j));
				}
			}
		}
		return getMostVisited(map);
	}

	private static boolean isValid(int n) {
		boolean valid = false;
		if(n>=1 && n<100000)
			valid = true;
		return valid;
	}

	private static int getMostVisited(Map<Integer, Integer> map) {
		int visited = 0, index = 0;
		for(Integer i:map.keySet()){
			if(map.get(i) > visited){
				visited = map.get(i);
				index = i;
			}
	
		
		}
		return index;
		
	}

}
