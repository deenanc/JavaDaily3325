package marks10;

import java.util.Scanner;

public class DateValidation {
	
	public static void validateDate(String date) {
		
		if(date.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date");
		String date=sc.next();
		validateDate(date);
		sc.close();

	}

}
