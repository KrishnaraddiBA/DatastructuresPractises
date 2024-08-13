package DSA;

import java.util.Scanner;

public class Arrays {
	int size=5;
	int []a=new int[] {1,2,3,4,5};
static Scanner scan=new Scanner(System.in);
	
	public void insertElements() {
	
		//to insert elements in an array as array does not increses its size
		int []b=new int[size+1];
		System.out.println("enter the specifiedindex u want to insert an elements");
		int index=scan.nextInt();
		System.out.println("enter the data u want to insert in the specified index");
		int data=scan.nextInt();
		for (int i = 0; i < b.length; i++) {
			
			if (i<index) {
				b[i]=a[i];
			}
			else if (i==index) {
				b[i]=data;
			}
			else {
				b[i]=a[i-1];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public void deleteElements() {
		int[]c=new int[size-1];
		System.out.println("enter the specified index u want to delete an id");
		int index=scan.nextInt();
		
		for (int i = 0; i < c.length; i++) {
		if (i<index) {
			c[i]=a[i];
		}	
		else if (i==index) {
			continue;
		}
		else {
			c[i]=a[i+1];
		}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		Arrays arrays=new Arrays();
		while (flag) {
			System.out.println("press 1 to insert an element in an array");
			System.out.println("press 2 to delete an element in an array");
			System.out.println("press 3 to display an elements of an array");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				arrays.insertElements();
				break;
			case 2:
				arrays.deleteElements();
				break;

			default:
				break;
			}
		}
	}
}
