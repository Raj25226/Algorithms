package com.rj.sorting;

import com.rj.util.Utility;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			int minIdx = -1;
			for(int j=i;j<arr.length;j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIdx = j;
				}
			}
			Utility.swap(i, minIdx, arr);
		}
		
	}
	
}
