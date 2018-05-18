package com.java.LinkedList;


/*
Each element of the list is referred to as a node.
Each node contains an Object that represents the data stored in the node 
and a reference to the next node in the list.
The last node in the list refers to null.
The first node in the list is referred to by a reference head. 
The last node in the list is optionally referred to by a reference tail.
*/
public class LinkedList {

	private Node head;//Starting the linked list from head

	public Node head()
	{
		return head;
	}
	//Insert in Linked List will happen at begining
	public void insertAtTail(Node node)
	{
		if(head==null)//if head is null then make the node we are inserting as head
		{
			head= node;
			node.next = null;
		}
		else
		{
			Node n = head;//If head is not null then we will start traversing from Head and find out where the n.next is null means tail
			while(n.next!=null)
			{
				n=n.getNext();
			}
			
			n.next=node;//Once we will find the tail, we will point current tail to node being inserted and will make new tail
			node.next=null;//created new tail
		}
	}
	
	public void showLinkedList()
	{
		Node n = head;//Lets start at head
		
		while(n.next!=null)
		{
		
				System.out.println(n.getData());
				n = n.getNext();
		}
	
		System.out.println(n.getData());
	
	}
}
