package com.java.Search;
	/*
	Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
	
	A simple approach is to do linear search.The time complexity of above algorithm is O(n). 
	Another approach to perform the same task is using Binary Search.
	
	Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
	Begin with an interval covering the whole array. 
	If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. 
	Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
	 */

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int intArray[]={1,3,4,6,8,9,11,24,25,26,27,29,32,33,35,36,37,41,42};
		
	//	int position=binarySearch(intArray,24);
		int position=binarySearch(intArray,0,intArray.length-1,24);
		
		if(position==-1)
		{
			System.out.println("Not Found");			
		}
		else
		{
			System.out.println("Found "+position);
		}
		
		
	}
	
	public static int binarySearch(int[] intArray,int search)
	
	{
		 	int start = 0;
	        int end = intArray.length - 1;
	        while(start<=end)
	        {
	        	int mid = (start + end) / 2;
	        	if (search == intArray[mid]) {
	                return mid;
	            }
	            if (search < intArray[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        	
	        }
	        return -1;
	        
	        
	}
	

	public static  int binarySearch(int arr[], int start, int end, int search)
    {
        if (start<=end)
        {
            int mid = (start + end)/2;
 
            // If the element is present at the 
            // middle itself
            if (arr[mid] == search)
               return mid;
 
            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (arr[mid] > search)
               return binarySearch(arr, start, mid-1, search);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, end, search);
        }
 
        // We reach here when element is not present
        //  in array
        return -1;
    }


}
