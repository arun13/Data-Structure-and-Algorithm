package com.java.StringFunctions;

public class StringReversal {

	static String alogrithm = "I am Arun Taneja";
	
	public static void main(String[] args) {
	
	
	
	
	//Reverse String using Iteration and String Builder
	String reversed= reverseRecursively(alogrithm);
	System.out.print(reversed);
		
	
	
	}
	
	//Reverse String using Iteration and String Builder
	public static String reverse1(String str)
	{
		char[] characterArray = str.toCharArray();
		StringBuilder stringBuilder =new StringBuilder();
		for(int i=characterArray.length-1; i>=0 ;i--)
		{
			stringBuilder.append(characterArray[i]);
		}
		
		return stringBuilder.toString();
				
	}

	//Reverse String using Iteration and without String Builder
		public static String reverse2(String str)
		{
			char[] characterArray = str.toCharArray();
			char[] reverseArray = str.toCharArray();//Just for initialization
			
			String string =new String();
			
			int lenArrayForm= characterArray.length-1;
			
			for(int i=lenArrayForm; i>=0 ;i--)
			{
				reverseArray[lenArrayForm-i]=characterArray[i];
			}
			
			return  string.copyValueOf(reverseArray);
			
					
		}
		
		//Reverse String recursively --means function call itself to reverse it, dont use recursive function in 
		//production it may result into StackOverFlowError 
		public static String reverseRecursively(String str) {
			
			// System.out.println(str.substring(0));//String from 0 index

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	        	
	            return str;
	        }

	      // System.out.println(reverseRecursively(str.substring(1)));
	        System.out.println(str.charAt(0));
	        return reverseRecursively(str.substring(1))+str.charAt(0);
	        /* This is how recursive will work
	         * reverseRecursively( am Arun Taneja)+I -> (reverseRecursively(am Arun Taneja)+" ")+I
	         * -->(((reverseRecursively(m Arun Taneja)+a)+)" ")+I 
	         * 
	         * 
	         * 
	         * 
	         */

	    }

		
		
}
