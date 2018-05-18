package com.java.Numbers;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFib = recursiveFibonacci(8);
		System.out.print(isFib);
	//	boolean isRecursiveFib = recursiveFibonacci(8);
	//	System.out.print(isRecursiveFib);
	}
	
	public static boolean findFibonaccinumber(int number)
	{
		
		int current_fib= 1;
		int next_fib=0;
		int previous_fib=0;
		
	
		for(int i=1; i<=number;i++)
		{
			
			if(i>=2)
			{
			next_fib = previous_fib + current_fib;//0+1--
			
			previous_fib=current_fib;//1
			current_fib=next_fib;//1
			}
			if(number==current_fib)
			{
				System.out.print(current_fib);
				return true;
			}
			
			System.out.print(current_fib);
	
			
		}
		return false;
		
		
		//return true;
	}
	//Recursive function
	public static int recursiveFibonacci(int number)
	{
		
		if(number==1||number==2)
		{
			//System.out.print(number);
			return 1;
		}
			//System.out.print(number);
				
			return recursiveFibonacci(number-1) + recursiveFibonacci(number -2);//Nth fibanocci number
			
		//return true;
	}

}
