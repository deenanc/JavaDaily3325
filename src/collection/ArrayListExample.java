package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		List<String> list=new ArrayList<>();
		
		System.out.println("Enter the number of elements");
		
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<size;i++) {
			list.add(sc.next());
		}
		
		System.out.println(list);
		
		sc.close();
		
		

	}

}
