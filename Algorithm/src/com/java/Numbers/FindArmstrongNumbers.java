package com.java.Numbers;

public class FindArmstrongNumbers {

	/*
	 * An example of Armstrong number is 153 as 153= 1+ 125+27 which is equal to 1^3+5^3+3^3. 
	 * One more example of the Armstrong number is 371 because it is the sum of 27 + 343 + 1 which is equal to 3^3 + 7^3 + 1^3 
     */
	

	
	public static void main(String[] args) {
		
		
		System.out.print(findArmstrongNumber(153));
	
	}
	
	public static boolean findArmstrongNumber(int number){
		int result =0;
		int orig = number;
		while(number!=0)
		{
			int remainder = number%10;//for 153 this will give 3 in first cycle-->now number is 15 and we will get 5-->now its 1
			result = result + remainder*remainder*remainder;//0+3*3*3-->0+3*3*3+5*5*5-->1*1*1
			
			number = number/10;//for 153 this will give 15 in first cycle--> number is 1 now-->1/10 will result 0 and loop stops
			
		}
		
		if(orig==result)
		{
		return true;
		}
		
		return false;
	}
	

}
