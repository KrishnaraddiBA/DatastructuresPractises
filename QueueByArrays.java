package DSA;

import java.util.Scanner;

public class QueueByArrays {

	static Scanner scan=new Scanner(System.in);
	
	int f=-1;
	int r=-1;
	public void insertElements(int []a) {
		int n,data;
		do {
			System.out.println("enter the data needs to be inserted!!");
			data=scan.nextInt();
			if (r==a.length-1) {
				System.out.println("it falls under overflow condition");
			}
			else {
				if (f==-1&&r==-1) {
					f=0;
					r=0;
					a[r]=data;
					System.out.println("data inserted successfully!!");
				}
				else {
					
					r=r+1;
					a[r]=data;
					System.out.println("data inserted succesfully!!");
				}
			}
		
		System.out.println("press 1 to insert more elements");
		n=scan.nextInt();}while(n==1);
	}
	public void deleteElements(int[]a) {
		int n;
		do {
			if (r==-1&&f==-1) {
				System.out.println("it falls under a underflow condition");
			}
			else {
				f=f+1;
				System.out.println("item deleted successfully!!");
			}
			System.out.println("press 1 to delete more elements");
			n=scan.nextInt();
		}
		while(n==1);
	}
	public void displayElements(int[]a) {
		for (int i = f; i <=r; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		boolean flag=true;
		QueueByArrays qr=new QueueByArrays();
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []a=new int[size];
		while(flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				qr.insertElements(a);
				break;
			case 2:
				qr.deleteElements(a);
				break;
			case 3:
				qr.displayElements(a);
				break;
			default:
				System.out.println("u have pressed an invalid input!!");
				flag=false;
				break;
			}
		}
		
	}
}
