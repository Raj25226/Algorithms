package com.rj.sorting;

import com.rj.util.Utility;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					Utility.swap(j-1, j, arr);
				}else {
					break;
				}
			}
		}
	}
	
}
