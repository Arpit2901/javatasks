package com.stack.list;

import java.util.Scanner;

import com.linked.list.Node;

public class Stack {
	private Node head;
	private Node last;
	private Node top;
	
	public Stack() {
		head=null;
		last=null;
		top=null;
	}
	Scanner sc=new Scanner(System.in);
	public void push() {
		do {
			System.out.println("Enter the data");
			int data=sc.nextInt();
			Node node=Node.getNode(data);
			if(head==null) {
				head=node;
				last=node;
				top =node;
			}else {
				top=node;
				top.setNext(last);
//				last.setNext(node);
				last=node;
			}
			System.out.println("pushed successfully");
		
		}while(false);
	}
		public void pop() {
			  if (top == null) {
		            System.out.print("\nStack Underflow");
		            return;
		        }
			  System.out.println("popped successful ="+top.getData()); 
		        last=top.getNext();
		        top.setNext(null);
		        top=last;
		}
	
	    public void display() {      
	        Node current = top;  
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {
	            System.out.print(current.getData() + "--> ");    
	            current = current.getNext();    
	        }    
	        System.out.println();    
	    
		}

}
