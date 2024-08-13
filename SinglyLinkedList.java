package DSA;

import java.util.Scanner;

public class SinglyLinkedList {
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
	public void insertElements() {
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
				System.out.println("press 1 to insert elements from the first");
				System.out.println("press 2 to insert elements fromt the end");
				System.out.println("press 3 to insert elements fromthe specified index");
				int key=scan.nextInt();
				switch (key) {
				case 1:
					new_node.next=head;
					head=new_node;
					break;
				case 2:
					Node temp=head;
					Node ptr=temp.next;
					while(ptr.next!=null) {
						temp=ptr;
						ptr=ptr.next;
					}
					ptr.next=new_node;
					new_node.next=null;
					break;
				case 3:
					System.out.println("enter the specified index ");
					int index=scan.nextInt();
					
					temp=head;
					ptr=temp.next;
					for (int i = 0; i < index-2; i++) {
						temp=ptr;
						ptr=ptr.next;
					}
					new_node.next=temp.next;
					temp.next=new_node;
					new_node.next=ptr;
					break;
				default:
					System.out.println("u have pressed an invalid input");
					break;
				}
			}
			
			
			
		System.out.println("press 1 to add more elements");
		n=scan.nextInt();
	}
		while(n==1);
	}
	public void deleteElements() {
		
		int n;
		do {
			if (head==null) {
				System.out.println("there is no linked list present to delete");
			}
			else {
				System.out.println("press 1 to delete elementsfrom first ");
				System.out.println("press 2 to delete elements from the end");
				System.out.println("press 3 to delete elements from the specified index");
				int key=scan.nextInt();
				switch (key) {
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp;
					System.out.println("element from linked list deleted sucecssfully");
					break;
				case 2:
					temp=head;
					Node ptr=temp.next;
					while (ptr.next!=null) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=null;
					System.out.println("element from the linked list deleted successfully");
					break;
				case 3:
					System.out.println("enter the index u want to delete an elements");
					int index=scan.nextInt();
					temp=head;
					ptr=temp.next;
					for (int i = 0; i < index-2; i++) {
						temp=ptr;
						ptr=ptr.next;
					}
					temp.next=ptr.next;
					System.out.println("elements from the index deleted sucessfully");
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
			System.out.println("there are no elements that are present in the elements");
		}
		else {
			Node temp=head;
			while (temp!=null) {
			System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public static void main(String[] args) {
		boolean flag=true;
		SinglyLinkedList sl=new SinglyLinkedList();
		while (flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				sl.insertElements();
				break;
			case 2:
				sl.deleteElements();
				break;
			case 3:
				sl.displayElements();
				break;

			default:
				System.out.println("u have pressed an invalid input");
				flag=false;
				break;
			}
		}
	}

}
