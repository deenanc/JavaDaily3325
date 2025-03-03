package marks10;

import java.util.Scanner;

public class PasswordValidation {
	
	public static void validatePW(String password) {
		
		if(password.matches(".*[0-9]{1,}.*")&&password.matches(".*[@#$].*")&&password.length()>6&&password.length()<20){
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password");
		String password=sc.next();
		validatePW(password);
		sc.close();

	}

}
