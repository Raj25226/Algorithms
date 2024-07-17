package com.rj;

import java.util.Arrays;

import com.rj.sorting.BubbleSort;
import com.rj.sorting.InsertionSort;
import com.rj.sorting.MergeSort;
import com.rj.sorting.QuickSort;
import com.rj.sorting.SelectionSort;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {5,3,4,2,6,4,7,8,1};
		
//		BubbleSort.bubbleSort(arr);
		
//		InsertionSort.insertionSort(arr);
		
//		SelectionSort.selectionSort(arr);
		
//		QuickSort.quickSort(arr, 0, arr.length - 1);
		
		MergeSort.mergeSort(0, arr.length-1, arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
