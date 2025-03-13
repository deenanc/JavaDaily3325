package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Set<String> set=new HashSet<>();
		
		System.out.println("Enter the size");
		
		int size=sc.nextInt();
		
		System.out.println("Enter elements");
		
		for(int i=0;i<size;i++) {
			set.add(sc.next());
		}
		
		System.out.println(set);
		
		sc.close();

	}

}
