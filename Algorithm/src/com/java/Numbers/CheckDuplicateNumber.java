package com.java.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= {1,2,3,4,5,6,7,8,9,11,11,12,13,14,15,16,17,18,17,19,20,11,11,13,6};
		//checkDuplicateInArray(i);
		
		System.out.print(checkDuplicateUsingAdd(i));
		

	}
	//Brute Force
	public static void checkDuplicateInArray(int[] intArray)
	{
		
		int len=1;
		int length = intArray.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(intArray[i]==intArray[j] && i!=j)
				{
					len++;//if matched once that means occurrence is 2.So we initialized it with 1
				}
			}
			
			if(len>1)
			{
			 System.out.println("Number of Occurances "+len+" Position in array "+i+ " Duplicate number " +intArray[i]+" ");
			}
			len=1;
		}
		
		
	}
	//Check duplicate using Set and Array.Set Doesn't store duplicate values
	public static boolean checkDuplicateinArray(int arrayInt[])
	{
		/*
		If you already have the array of ints, there is not quick way to convert, you're better off with the loop.
		On the other hand, if your array has Objects, not primitives in it, Arrays.asList will work:
    	List<int[]> arrayList = Arrays.asList(arrayInt);//Converting Array to List
	    */
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : arrayInt)
		{
		    intList.add(i);
		}
	  Set intSet = new HashSet(intList);//Converting Array to set.This will not store duplicate values
	  
	  //System.out.print(intSet.size());
	  //System.out.print(intList.size());
	  
	  if(intList.size()>intSet.size())
	  {
		  
				  
		  return true;  
	  }
	    
	  return false;
	  
	}

	
	/*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateUsingAdd(int[] input) {
        Set tempSet = new HashSet();
        for (Integer inte : input) {
            if (!tempSet.add(inte)) {
                return true;
            }
        }
        return false;
    }

    
}
