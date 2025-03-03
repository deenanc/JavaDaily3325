package marks10;

import java.util.Scanner;

public class FormNewWord {
	
	public static String newWord(String input, int num) {
		
		StringBuffer sb=new StringBuffer();
		sb.append(input.substring(0, num));
		sb.append(input.substring(num));
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.next();
		int num=sc.nextInt();
		
		System.out.println(newWord(input, num));
		
		sc.close();

	}

}
