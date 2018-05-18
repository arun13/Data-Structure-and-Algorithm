package com.java.Sort;

public class SelectionSort {
//https://www.youtube.com/watch?v=cqh8nQwuKNE
	
	static int[] intArray={1,3,45,343,23,22,43,22,1,223,67};
	
	
	public static int[] selectionSort(int[] intArray)
	
	{
		int length = intArray.length;
		
		for(int i=0;i<length;i++)
		{
			
			int min = intArray[i];
			int min_index = i;
			for(int j=i+1;j<length;j++)
			{
				
				if(intArray[j]<min)
				{
				   min=intArray[j];
				   min_index = j;
				}
			}
			//Swap min found with index
			int temp = intArray[i];
			intArray[i]=intArray[min_index];
			intArray[min_index]=temp;
			
			
		}
		
		return intArray;
	}
	
	public static void printArray(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
		{
			System.out.print("| " + intArray[i] + " ");
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
	
		int[] sortedArray = selectionSort(intArray);
		printArray(sortedArray);
		

	}

}
