package com.java.LinkedList;

public class FindMiddleElement {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtTail(new Node("1"));
		linkedList.insertAtTail(new Node("2"));
		linkedList.insertAtTail(new Node("3"));
		linkedList.insertAtTail(new Node("4"));
		linkedList.insertAtTail(new Node("5"));
		
	    linkedList.showLinkedList();
	    
	    Node current= linkedList.head();
	    Node middle_even = linkedList.head();
	    Node middle_odd = linkedList.head();
	    
	    
	    int length =1;//For head as we already have that
	    while(current.getNext() != null){
	         
	          if(length%2 ==0){
	        	  middle_even = middle_even.getNext();//This will run only half the times while loop is run
	          }
	  	    
	  	    if(length%2 == 1){
	  	    	middle_odd = middle_odd.getNext();//This will run only half the times while loop is run
	  	      }

	  	  length++;
	  	  

	          current = current.getNext();
	      }
	    
	    
	    if(length%2 ==0){
		    System.out.println(middle_even.getData());
        }
	    
	    if(length%2 == 1){
		    System.out.println(middle_odd.getData());
	      }
	   
	 /* Alternative way to find middle point just by adding +1 to even middle point for odd length
	    while(current.next() != null){
	          length++;
	          if(length%2 ==0){
	              middle = middle.next();
	          }
	          current = current.next();
	      }
	    
	      if(length%2 == 1){
	          middle = middle.next();
	      }
	   */ 
	}

}
