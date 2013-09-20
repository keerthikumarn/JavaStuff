package com.sample.programs;

/**
 * Java program to find distinct array elements
 * @author kenarayan
 *
 */
public class DistinctArrayElements {

	public static void main(String[] args) {
		int[] numbers = {4,2,6,5,3,9,2,5,9,3};
		printDistinctArrayNumbers(numbers);
		
	}
	
	public static void printDistinctArrayNumbers(int[] nums){
		for(int i = 0; i < nums.length; i++){
			boolean isDistinct = false;
			for(int j=0; j < i; j++){
				if(nums[i] == nums[j]){
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct){
				System.out.print(nums[i]+" ");
			}
			
		}
	}

}
