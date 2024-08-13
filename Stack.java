package DSA;

import java.util.Scanner;

public class Stack {
	static Scanner scan=new Scanner(System.in);
	
	int top=-1;
	
	public void pushElements(int[]a) {
		if (top==a.length-1) {
			System.out.println("it falls under a overflow condition");
		}
		else {
			System.out.println("enter the data needs to be entered");
			int data=scan.nextInt();
			top=top+1;
			a[top]=data;
			System.out.println("data inserted successfully!!");
		}
	}
	public void popElements(int []a) {
		if (top==-1) {
			System.out.println("it falls under a underflow condition");
		}
		else {
			top=top-1;
			System.out.println("item deleted successfully");
		}
	}
	public void displayElements(int []a) {
	
		for (int i = top; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		boolean flag=true;
		Stack stack=new Stack();
		System.out.println("enter the size of an arrray");
		int size=scan.nextInt();
		int []a=new int[size];
		while (flag) {
			System.out.println("press 1 to insert elements");
			System.out.println("press 2 to delete elements");
			System.out.println("press 3 to display elements");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				stack.pushElements(a);
				break;
			case 2:
				stack.popElements(a);
				break;
			case 3:
				stack.displayElements(a);
				break;

			default:
				System.out.println("u have pressed an invalid input");
				flag=false;
				break;
			}
		}
		
	}

}
