package com.java.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
public class ArrayListSortingExample {

   
    @SuppressWarnings("unchecked")
	public static void main(String... args) {
      
    	@SuppressWarnings("rawtypes")
		List unsortedList = Arrays.asList("abc", "bcd", "ade", "cde");
    	Collections.sort(unsortedList, Collections.reverseOrder());
             
    	System.out.println("Arraylist in descending order: " + unsortedList);


    	unsortedList = Arrays.asList("abc", "bcd", "ABC", "BCD");
    	System.out.println("ArrayList before case insensitive sort: " + unsortedList);
    	             
    	Collections.sort(unsortedList, String.CASE_INSENSITIVE_ORDER);
    	System.out.println("ArrayList after case insensitive sort: " + unsortedList);


    	
    }
}
