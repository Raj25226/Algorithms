package com.rj.sorting;

import com.rj.util.Utility;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					Utility.swap(i,j,arr);
				}
			}
		}
	}

}
