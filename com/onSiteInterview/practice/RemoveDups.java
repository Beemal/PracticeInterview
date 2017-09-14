package com.onSiteInterview.practice;

public class RemoveDups {

	public static void main(String[] args) {
		String s = "aaaaaaacv";
//		char[] arr = s.toCharArray();
		removeDups(s);
	}

	private static void removeDups(String s) {
		
		String result = "";
		for(int i = 0; i < s.length(); i++){
			if(!result.contains(String.valueOf(s.charAt(i)))){
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
