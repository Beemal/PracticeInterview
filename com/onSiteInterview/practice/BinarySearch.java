package com.onSiteInterview.practice;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = new int[]{2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(a, 0, a.length-1, 8)?"Yes Found":"Not Found");
	}

	private static boolean binarySearch(int[] a, int fromIndex, int toIndex, int key) {
		while(fromIndex <= toIndex){
			int mid = (fromIndex + toIndex) / 2;
			System.out.println("mid -> "+mid+" from-> "+fromIndex+" to "+toIndex);
			if(key == a[mid]){
				return true;
			}
			if(key < a[mid]){
				toIndex = mid - 1;
			}else{
				fromIndex = mid + 1;
			}
		}
		return false;
	}
}
