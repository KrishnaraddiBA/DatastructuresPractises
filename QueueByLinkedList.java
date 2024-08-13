package DSA;

import java.util.Scanner;

public class QueueByLinkedList {

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
	public void addElements() {
		int n,data;
	do {
		//in Queue by linked list also does not form an over flow condition
		System.out.println("enter the data need to be inserted");
		data=scan.nextInt();
		Node new_node=new Node(data);
		if (head==null) {
			head=new_node;
			new_node.next=null;
		}
		else {
			
//			new_node.next=head;
//			head=new_node;
//			System.out.println("item inserted sucesfully!!");
			
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_node;
			new_node.next=null;
		}
		System.out.println("press 1 to insert more elements");
		n=scan.nextInt();
	}
	while(n==1);
	}
	public void deleteElements() {
		int n;
		do {
			if (head==null) {
				System.out.println("it falls under a scenario of underflow condition");
			}
			else {
				Node temp=head;
				temp=temp.next;
				head=temp;
				System.out.println("item deleted successfully!!!");
			}
			System.out.println("press 1 to delete more elements");
			n=scan.nextInt();
		}
		while(n==1);
	}
	public void displayElements() {
		
		if (head==null) {
			System.out.println("there is no elements that are present in the stack");
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
		QueueByLinkedList ql=new QueueByLinkedList();
		while(flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				ql.addElements();
				break;
			case 2:
				ql.deleteElements();
				break;
			case 3:
				ql.displayElements();
				break;

			default:
				System.out.println("u have pressed an invalid input");
				flag=false;
				break;
			}
		}
	}
	
	
}
