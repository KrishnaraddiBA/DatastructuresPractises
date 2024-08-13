package DSA;

import java.util.Scanner;

public class CircularQueue {
static Scanner scan=new Scanner(System.in);

int f=-1,r=-1;
public void enqueElements(int[]a) {
	int n,data;
	
	do {
		System.out.println("enter the data needs to be inserted");
		data=scan.nextInt();
		if (r==(r+1)%a.length) {
			System.out.println("it falls under overflow condition");
		}
		else {
			if (f==-1&&r==-1) {
				f=0;
				r=0;
				a[r]=data;
				System.out.println("data inserted sucessfully!!");
			}
			else {
				r=(r+1)%a.length;
				a[r]=data;
				System.out.println("data inserted succesfully!!");
			}
		}
		System.out.println("press 1 to add more elements");
		n=scan.nextInt();
	}
	while(n==1);
}
public void dequeElements(int []a) {
	
	int n;
	do {
		if (r==-1) {
			System.out.println("it falls under a underflow condition");
		}
		else {
			f=f+1;
			System.out.println("item has deleted successfully!!");
		}
		System.out.println("press 1 to delete more elements");
		n=scan.nextInt();
	}
	while(n==1);
	
}
public void displayElements(int []a) {
	
	for (int i = f; i <=r; i++) {
		System.out.println(a[i]);
	}
}

public static void main(String[] args) {
	boolean flag=true;
	CircularQueue cq=new CircularQueue();
	System.out.println("enter the size of an array");
	int size=scan.nextInt();
	int[]a=new int[size];
	while(flag) {
		System.out.println("press 1 to insert an element");
		System.out.println("press 2 to delete an element");
		System.out.println("press 3 to display Elements");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			cq.enqueElements(a);
			break;
		case 2:
			cq.dequeElements(a);
			break;
		case 3:
			cq.displayElements(a);
			break;

		default:
			System.out.println("u have pressed an invalid input");
			flag=false;
			break;
		}
	}
}
}
