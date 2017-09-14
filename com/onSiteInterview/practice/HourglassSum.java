package com.onSiteInterview.practice;

import CareerCupLibrary.CareerCupLibrary.AssortedMethods;

public class HourglassSum {
	public static void main(String[] args) {
		int[][] m = AssortedMethods.randomMatrix(6, 6, 0, 9);
		System.out.println(findMaxSum(m));
	}

	private static int findMaxSum(int[][] m) {
		int maxSum = 0;
		int R = m.length;
	
		for(int i=0; i<R-2; i++){
			for(int j=0; j<R-2; j++){
				int sum = m[i][j]+m[i][j+1]+m[i][j+2]+
						m[i+1][j+1]
								+m[i+2][j]+m[i+2][j+1]+m[i+2][j+2];
				if(sum > maxSum){
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
}
