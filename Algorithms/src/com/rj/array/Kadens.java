package com.rj.array;

public class Kadens {
	
	public static int maxSumSubarray(int[] arr) {
		
		int maxSum = 0;
		int currSum = 0;
		
		for(int x : arr) {
			
			currSum += x;
			
			if(currSum < 0) {
				currSum = 0;
			}
			
			if(maxSum < currSum) {
				maxSum = currSum;
			}
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,-9,6,7,8,9};
		
		System.out.println(maxSumSubarray(arr));
		
		
	}

}
