package collection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Set<String> set=new TreeSet<>();
		
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
