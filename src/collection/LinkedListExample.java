package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList<String> list=new LinkedList<>();
		
		System.out.println("Enter the size of the list");
		
		int size=sc.nextInt();
		
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			list.add(sc.next());
		}
		
		System.out.println(list);
		
		sc.close();

	}

}
