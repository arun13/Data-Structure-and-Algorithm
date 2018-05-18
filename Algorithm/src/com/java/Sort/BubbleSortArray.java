package com.java.Sort;

public class BubbleSortArray {

	public static void main(String[] args) 
	{
		
		int intArray[]={1,2,3,4,5,6,7,8,9,10,11,2,3,4,2,3,5,6,7,12,1,2,3,13,16,17,20};
		int sortedArray[]= bubbleSortArray(intArray);
		for(int i=0; i<sortedArray.length;i++)
		{
			
			System.out.print(sortedArray[i]);
			System.out.print("\n");
			
		}
		
	}
	
	public static int[] bubbleSortArray(int intArray[])
	{
		//Lets imagine last number is 1 and then we are doing the bubble sort.
		//so we need to do it for n times where n= length of Array
		  for(int j=0; j<intArray.length; j++){
	          
			for(int i=0;i<intArray.length;i++)
			{
				
				//i needs to be stopped at second last so that i+1 dont throw ArrayOutOfBoundException
				if(i<intArray.length-2 && intArray[i]>intArray[i+1]) 
				{
					int temp;
					temp=intArray[i];
					intArray[i]=intArray[i+1];
					intArray[i+1]=temp;
										
				}
				
				
			}
		  }
		
		return intArray;
		
	}
	

}
