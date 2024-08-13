package DSA;

import java.util.Scanner;

public class StackByLL {

	static Scanner scan=new Scanner(System.in);
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void push() {
	int n,data;
		do {
			System.out.println("enter the data need to be inserted");
			data=scan.nextInt();
			Node new_node=new Node(data);
			if (head==null) {
				head=new_node;
				new_node.next=null;
			}
			else {
				new_node.next=head;
				head=new_node;
				System.out.println("data inserted successfully!!");
			}
		System.out.println("press 1 to push elements");
		n=scan.nextInt();
	}
		//overflow conditions does not holds good in the Linked list
		while(n==1);
	}
	public void pop() {
		int n;
		do {
			if (head==null) {
				System.out.println("it falls under a underflow condition");
			}
			else {
				Node temp=head;
				temp=temp.next;
				head=temp;
				System.out.println("item deleted successfully!!");
			}
			System.out.println("press 1 to delete more elements");
			n=scan.nextInt();
		}
		while(n==1);
		
	}
	public void displayElements() {
		
		if (head==null) {
			System.out.println("there is no elements present in the stack");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
	
	public static void main(String[] args) {
		boolean flag=true;
		StackByLL stack=new StackByLL();
		while(flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				stack.push();
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.displayElements();
				break;

			default:
				System.out.println("u have pressed an invalid input");
				flag=false;
				break;
			}
		}
		
	}
}
