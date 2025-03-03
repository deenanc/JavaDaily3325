package marks10;

import java.util.Scanner;

public class SumofOddandEven {
	
	public static void sumOddEven(int input) {

		int last,even_sum=0,odd_sum=0;
		
		while(input>0) {
			
			last=input%10;
			if(last%2==0) {
				even_sum=even_sum+last;
			}
			else {
				odd_sum=odd_sum+last;
			}
			
			input=input/10;
		}
		System.out.println("Even digits sum is "+even_sum+" odd digits sum is "+odd_sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		sumOddEven(input);
		sc.close();

	}

}
