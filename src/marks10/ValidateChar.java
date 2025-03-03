package marks10;

import java.util.Scanner;

public class ValidateChar {
	
	public static void validateCh(String input) {
		
		if(input.charAt(0)==input.charAt(input.length()-1)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String input=sc.nextLine();
		validateCh(input);
		sc.close();

	}

}
