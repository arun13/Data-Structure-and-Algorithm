package com.java.Numbers;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=12311;
		int reverse=0;
			while(i!=0)
			{
				int remainder= i%10;
				int divide = i/10;
				i=divide;
				reverse = reverse*10 + remainder;
				
			}
			System.out.print(reverse);
	}
	
}
