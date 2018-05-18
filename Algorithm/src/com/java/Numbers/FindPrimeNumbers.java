package com.java.Numbers;

public class FindPrimeNumbers {

	public static void main(String[] args) {
//Find if the number is prime
	int number = 11;
	boolean primeNumber = isPrime(number);
	System.out.print(primeNumber);

	
	//Find what all numbers are prime from 1 to 100
		
		for(int i=2;i<=100;i++)
		{
			
			System.out.println("upper");
			boolean prime= isPrime(i);
			if(prime)
			{
				System.out.print(i);
				
			}
			
			
		}
		
		
		
		
	}

	private static boolean isPrime(int number) {
		
		for(int j=2; j< number; j++)//for number = 2 ..this loop will not run
		{
		if(number%j==0)
		{
			
			return false;
		}
		
	}
		
	return true;
	}
	
	

}
