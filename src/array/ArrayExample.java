package array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int length=sc.nextInt();
		
		int a1[]=new int[length];
		
		System.out.println("Enter elements ");
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Elements are ");
		for(int ele:a1) {
			System.out.println(ele);
		}
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		
		sc.close();

	}

}
