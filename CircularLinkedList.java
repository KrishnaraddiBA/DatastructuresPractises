package DSA;

import java.util.Scanner;

public class CircularLinkedList {
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
	Node tail=null;
	public void addElements() {
		int n,data;
		do {
			System.out.println("enter the data need to be inserted");
			data=scan.nextInt();
			Node new_node=new Node(data);
			if (head==null) {
				head=new_node;
				tail=new_node;
				tail.next=head;
			}
			else {
				System.out.println("press 1 to add elements from the first");
				System.out.println("press 2 to add elements from the end");
				System.out.println("press 3 to add elements from the specified index");
				int key=scan.nextInt();
				switch (key) {
				case 1:
					new_node.next=head;
					head=new_node;
					tail.next=head;
					break;
				case 2:
					tail.next=new_node;
					tail=tail.next;
					tail.next=head;
					break;
				case 3:
					
					System.out.println("enter the specified index u want to enter the data");
					int index=scan.nextInt();
					Node temp=head;
					Node ptr=temp.next;

					for (int i = 0; i < index-2; i++) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=new_node;
					new_node.next=ptr;
					break;

				default:
					System.out.println("u have pressed an invalid input");
					break;
				}
			}
			System.out.println("press 1 to add a more elements");
			n=scan.nextInt();
		}
		while(n==1);
	}
	public void deleteElements() {
		int n;
		do {
			if (head==null) {
				System.out.println("there is no elements present in the linked list");
			}
			else {
				System.out.println("press 1 to delete elements from the first");
				System.out.println("press 2 to delete elements from the last");
				System.out.println("press 3 to delete elements from the specified index");
				int key=scan.nextInt();
				switch (key) {
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp;
					tail.next=head;
					System.out.println("node deleted suceesffully!!");
					break;
				case 2:
					temp=head;
					Node ptr=temp.next;
					while (ptr.next!=head) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=head;
					System.out.println("node deleted successfully!!");
					break;
				case 3:
					System.out.println("enter the specified index u want to delete");
					int index=scan.nextInt();
					temp=head;
					ptr=temp.next;
					for (int i = 0; i < index-2; i++) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=ptr.next;
					System.out.println("item deleted sucessfully!!");
					break;

				default:
					System.out.println("please try again");
					break;
				}
				
			}
			System.out.println("press 1 to delete more elements");
			n=scan.nextInt();
		}
		while(n==1);		
		
	}
	public void displayElements() {
		
		if (head==null) {
			System.out.println("there is no elements present in the linked list");
		}
		else {
			Node temp=head;
			do {
				System.out.println(temp.data);
				temp=temp.next;
			}
			while(temp!=head);
		}
	}
	
	public static void main(String[] args) {
		
		boolean flag=true;
		CircularLinkedList cl=new CircularLinkedList();
		while (flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				cl.addElements();
				break;
			case 2:
				cl.deleteElements();
				break;
			case 3:
				cl.displayElements();
				break;

			default:
				System.out.println("u have pressed invalid input");
				flag=false;
				break;
			}
		}
		
	}
}
