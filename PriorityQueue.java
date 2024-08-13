package DSA;

import java.util.Scanner;

public class PriorityQueue {

	static Scanner scan=new Scanner(System.in);
	
	static class Node{
		int data;
		int priority;
		Node next;
		Node(int data,int priority){
			this.data=data;
			this.priority=priority;
			this.next=null;
		}
	}
	Node head=null;
	public void insertElements() {
		int n,data,priority;
		
		do {
			System.out.println("enter the data too be inserted");
			data=scan.nextInt();
			System.out.println("enter the priority");
			priority=scan.nextInt();
			Node new_node=new Node(data,priority);
			if (head==null) {
				head=new_node;
				new_node.next=null;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=new_node;
				new_node.next=null;
			}
			System.out.println("hit 1 to add more elements");
			n=scan.nextInt();
		}
		while(n==1);
	}
	public void deleteElements() {
		int n;
		do {
			if (head==null) {
				System.out.println("there is no elements in the circular queue");
			}
			else {
				Node temp=head;
				Node ptr=temp.next;
				System.out.println("enter the priority u want to delete");
				int prio=scan.nextInt();
				while(ptr.priority!=prio) {
					temp=ptr;
					ptr=ptr.next;
				}
				temp.next=ptr.next;
				System.out.println("item deleted sucessfully!!");
			}
			System.out.println("press 1 to delete more elements");
			n=scan.nextInt();
		}
		while(n==1);
	}
	public void displayElements() {
		if (head==null) {
			System.out.println("there is no elements to display elements");
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
		PriorityQueue pq=new PriorityQueue();
		boolean flag=true;
		while(flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				pq.insertElements();
				break;
			case 2:
				pq.deleteElements();
				break;
			case 3:
				pq.displayElements();
				break;

			default:
				System.out.println("u have entered an invalid input!!");
				flag=false;
				break;
			}
		}
	}
}
