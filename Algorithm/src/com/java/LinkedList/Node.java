package com.java.LinkedList;

public  class Node {
	
	Node next;//This will store reference to next node
	private String data;//This is the data for the node
	
	Node(String data){
		
		this.data=data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

	
	
	

}
