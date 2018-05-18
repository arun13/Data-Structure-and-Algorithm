package com.java.Sort;



public class MergeSort {

  public static void main(String[] args) {
    MergeSort ms = new MergeSort();
    int[] inputArray =  {1, 3, 5, 2, 4, 6};
    int[] sortedArray = ms.divideAndConquer(inputArray);
    for (int i=0; i<sortedArray.length; i++) {
      System.out.println(sortedArray[i]);
    }
  }

  public int[] divideAndConquer(int[] inputArray) {
    int n = inputArray.length;
    if(n == 1) {
      return inputArray;
    }
    int mid = n/2;
    int[] leftArray = new int[mid];
    int[] rightArray = new int[n - mid];
    System.arraycopy(inputArray, 0, leftArray, 0, leftArray.length);//will copy 0th to 0th until left length of array from intarray 
  
    //will copy left length to 0th until right length of array from intarray
    System.arraycopy(inputArray, leftArray.length, rightArray, 0, rightArray.length);
       
    divideAndConquer(leftArray);
    divideAndConquer(rightArray);
   
    
    
    System.out.print("Left"); 
    printArray(leftArray);
    System.out.print("\n");
    System.out.print("Right");
    printArray(rightArray);
    System.out.print("\n");
   
  
  merge(leftArray, rightArray, inputArray);
    return inputArray;
  }
  
  public static void printArray(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
		{
			System.out.print("| " + intArray[i] + " ");
			
		}
		
	}

  public void merge(int[] leftArray,
  int[] rightArray,
  int[] sortedArray) {
	  
	System.out.print("Started");
    int leftArrayLength = leftArray.length;
    int rightArrayLength = rightArray.length;
    int i = 0;
    int j = 0;
    int k = 0;
    while(i < leftArrayLength && j < rightArrayLength) {
      if(leftArray[i] < rightArray[j]) {
        sortedArray[k] = leftArray[i];
        i++;
      } else {
        sortedArray[k] = rightArray[j];
        j++;
      }
      k++;
    }
    while(i < leftArrayLength) {
      sortedArray[k] = leftArray[i];
      i++;
      k++;
    }
    while(j < rightArrayLength) {
      sortedArray[k] = rightArray[j];
      j++;
      k++;
    }
  }

}