package com.vivek.practise.ds.linkedList;

public class Node {
	int data;
	Node next = null;
	public Node (int data){
		this.data=data;
	}

	public void add(int data){
		Node node= new Node(data);
		Node current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = node;
	}
	public void delete(int data){
		Node current = this;
		while(current.next != null){
			if(current.next.data == data){
				current.next=current.next.next;
			}
			current=current.next;
				
			
						
		}
	}
}
