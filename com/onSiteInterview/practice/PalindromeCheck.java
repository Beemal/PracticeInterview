package com.onSiteInterview.practice;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(checkPalindrome(input)?"Yes Palindrome":"Not a Palindrome");
	}

	private static boolean checkPalindrome(String input) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<input.length(); i++){
			stack.push(input.charAt(i));
		}
		String reverseString = "";
		while(!stack.isEmpty()){
			reverseString += stack.pop();
		}
		if(reverseString.equals(input))
			return true;
		else
		return false;
	}
}
