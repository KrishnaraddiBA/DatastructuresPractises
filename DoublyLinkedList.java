package DSA;

import java.util.Scanner;

public class DoublyLinkedList {

	static Scanner scan=new Scanner(System.in);
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void addElements() {
		int n,data;
		do {
			System.out.println("enter the data needs to be inserted");
			data=scan.nextInt();
			Node new_node=new Node(data);
			if (head==null) {
				head=new_node;
				tail=new_node;
			}
			else {
			System.out.println("press 1 to insert elements from the first");
			System.out.println("press 2 to insert elements from the end");
			System.out.println("press 3 to insert elements from the specified position");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				Node temp=head;
				temp.prev=new_node;
				new_node.next=temp;
				head=new_node;
				break;
			case 2:
				new_node.prev=tail;
				tail.next=new_node;
				tail=tail.next;
				break;
			case 3:
				System.out.println("enter  the specified index u want to enter the data");
				temp=head;
				Node ptr=temp.next;
				int index=scan.nextInt();
				for (int i = 0; i < index-2; i++) {
					temp=ptr;
					ptr=ptr.next;
				}
				new_node.prev=temp;
				temp.next=new_node;
				ptr.prev=new_node;
				new_node.next=ptr;
				break;

			default:
				System.out.println("u have pressed an invalid input");
				break;
			}}
			
			System.out.println("press 1 to insert more elements");
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
					System.out.println("Node deleted successfully");
					break;
				case 2:
					tail=tail.prev;
					tail.next=null;
					System.out.println("Node deleted sucessfully");
					break;
				case 3:
					System.out.println("enter the specified position u want to delete");
					int pos=scan.nextInt();
					temp=head;
					Node ptr=temp.next;
					for (int i = 0; i < pos-2; i++) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=ptr.prev;
					ptr.next.prev=temp;
					break;

				default:
					System.out.println("try again");
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
			System.out.println("there is no elements present in linked list hence there is nothing in the linked list");
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
		DoublyLinkedList dl=new DoublyLinkedList();
		
		while (flag) {
			System.out.println("press 1 to insert elements ");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				dl.addElements();
				break;
			case 2:
				dl.deleteElements();
				break;
			case 3:
				dl.displayElements();
				break;

			default:
				System.out.println("u have entered an invalid input");
				flag=false;
				break;
			}
		}
	}

}
