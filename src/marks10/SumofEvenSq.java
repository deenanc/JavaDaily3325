package marks10;

import java.util.Scanner;

public class SumofEvenSq {
	
	public static int sumEvenSQ(int input) {
		
		int last,evenSqSum=0;
		
		while(input>0) {
			last=input%10;
			if(last%2==0) {
				evenSqSum=evenSqSum+last*last;
			}
			input=input/10;
		}
		return evenSqSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		System.out.println(sumEvenSQ(input));
		sc.close();

	}

}
