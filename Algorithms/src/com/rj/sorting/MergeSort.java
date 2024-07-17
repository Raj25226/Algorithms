package com.rj.sorting;

public class MergeSort {
	
	public static void mergeSort(int l, int h, int[] arr) {
		
		if(l<h) {
			int mid = (h+l)/2;
			
			mergeSort(l, mid, arr);
			mergeSort(mid+1, h, arr);
			
			merge(l, mid, h, arr);
		}
		
	}

	private static void merge(int l, int mid, int h, int[] arr) {
		
		int k = l;
		
		int n1 = mid - l +1;
		int n2 = h - mid;
		
		int arr1[] = new int [n1];
		int arr2[] = new int [n2];
		
		for(int i=0;i<n1;i++) {
			arr1[i] = arr[l+i];
		}
		
		for(int i=0;i<n2;i++) {
			arr2[i] = arr[mid+1+i];
		}
		
		int i=0;
		int j=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<=arr2[j]) {
				arr[k++] = arr1[i++];
			}else {
				arr[k++] = arr2[j++];
			}
		}
		
		while(i<n1) {
			arr[k++] = arr1[i++];
		}
		while(j<n2) {
			arr[k++] = arr2[j++];
		}
	}

}
