package com.rj.sorting;

import com.rj.util.Utility;

public class QuickSort {
	
	public static void quickSort(int[] arr, int l, int h) {
		
		if (l < h) {
			int pivotIdx = partition2(l, h, arr);
			quickSort(arr, l, pivotIdx-1);
			quickSort(arr, pivotIdx+1, h);
		}
		
	}
	
	// Considering last element as pivot
	
	public static int partition1(int l, int h, int[] arr) {
		
		int pivot = arr[h];
		int pivotIdx = l-1;
		
		for(int i=l;i<h;i++) {
			if(arr[i]<pivot) {
				Utility.swap(++pivotIdx, i, arr);
			}
		}
		
		Utility.swap(++pivotIdx, h, arr);
		
		return pivotIdx;
	}
	
	// Considering first element as pivot
	
	public static int partition2(int l, int h, int[] arr) {
		
		int pivot = arr[l];
		int pivotIdx = h+1;
		
		for(int i=h;i>l;i--) {
			if(arr[i]>pivot) {
				Utility.swap(--pivotIdx, i, arr);
			}
		}
		
		Utility.swap(--pivotIdx, l, arr);
		
		return pivotIdx;
	}

}
