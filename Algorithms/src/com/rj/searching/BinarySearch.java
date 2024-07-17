package com.rj.searching;

public class BinarySearch {
	
	public static int binarySearchRecurssive(int[] arr, int l, int h, int value) {
		
		if(l>h) {
			return -1;
		}
		
		int mid = l + (h-l)/2;
		
		if(arr[mid] == value) {
			return mid;
		}else if(arr[mid] > value) {
			return binarySearchRecurssive(arr, l, mid-1, value);
		}else {
			return binarySearchRecurssive(arr, mid+1, h, value);
		}
		
	}
	
	public static int binarySearchIterative(int[] arr, int value) {
		
		int l=0;
		int h=arr.length-1;
		
		while(l<=h) {
			int mid = l + (h-l)/2;
			
			if(arr[mid] == value) {
				return mid;
			}else if(arr[mid] > value) {
				h = mid -1;
			}else {
				l = mid + 1;
			}
			
		}
		
		return -1;
	}
	
}
