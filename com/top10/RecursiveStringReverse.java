package com.top10;

public class RecursiveStringReverse {
	public static String reverseRecursively(String str){
		if(str.length() < 2){
			return str;
		}
		System.out.println(str.substring(1)+"->"+str.charAt(0));
		return reverseRecursively(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(reverseRecursively("apple"));
	}
}
