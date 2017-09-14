package com.top10;

public class StringReplace {
	public static String replace(String str, char ch){
		String result = "";
		for(Character c: str.toCharArray()){
			if(c!=ch){
				result += c;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s="Apple";
		System.out.println(replace(s,'l'));
	}

}
