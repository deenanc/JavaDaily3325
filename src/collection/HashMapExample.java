package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company;
		int CTC;
		
		Scanner sc=new Scanner(System.in);
		
		Map<String,Integer> map=new HashMap<>();
		
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Company");
			company=sc.next();
			
			System.out.println("Enter CTC");
			CTC=sc.nextInt();
			
			map.put(company, CTC);
		}
		
		System.out.println(map);
		
		sc.close();

	}

}
