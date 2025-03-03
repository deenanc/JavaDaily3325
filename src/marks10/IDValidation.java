package marks10;

import java.util.Scanner;

public class IDValidation {
	
	public static int validateID(String input) {
		
		if(input.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")) {
			return 1;
		}
		else {
			return 2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String input=sc.next();
		
		if(validateID(input)==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		sc.close();

	}

}
