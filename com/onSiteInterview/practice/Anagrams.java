package com.onSiteInterview.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(checkAnagrams(s1,s2)?"Yes Anagrams":"No Anagrams");
		System.out.println(replaceSpace(s1,"%20"));
	}

	private static String replaceSpace(String input, String string) {
		// replacing the space with %20
		return Pattern.compile("[\\s+]").matcher(input).replaceAll(string);
		
	}

	private static boolean checkAnagrams(String s1, String s2) {
		char[] c1 = s1.replaceAll("[\\s+]","").toLowerCase().toCharArray();
		char[] c2 = s2.replaceAll("[\\s+]","").toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}

}
