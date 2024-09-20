package com.lab;

/*  Question 4 : Declare an array with 10 elements. Get a subarray from an array
    between index 2 to 6 and find out the 2nd highest number from the sub array.
	Input: 2 4 5 3 6 7 9 4 5 6
	 Output: Sub array: 5 3 6 7 9
 			2nd Highest element: 7  */

public class SubArray {

	public static void printArray(int[] array) {
		// prints array
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void sortArray(int[] array) {
		// sorts the array in increasing order
		int temp;
		for(int i = 0; i < array.length -1; i++) {
			if(array[i] > array[i+1]) {
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
	}
	
	public static void main(String args[]) {
		
		int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
		int[] subArray = new int[5];

		System.out.println("The elements of the array : ");
		printArray(arr);
		System.out.println();
		// setting elements of subarray
		int idx = 0;
		for(int i = 2; i < 7; i++) {
			subArray[idx++] = arr[i];
		}
		System.out.println("The elements of the subarray : ");
		printArray(subArray);
		System.out.println();

		sortArray(subArray);
		System.out.println("Sorted subarray :");
		printArray(subArray);
		
		System.out.println();
		// As the array is sorted the second highest number must be in second last position
		System.out.println("The second highest elements of the subarray is : " + subArray[3] );
	}
}