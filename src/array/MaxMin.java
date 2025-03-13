package array;

import java.util.Scanner;

public class MaxMin {
	
	public static int findMax(int input[]) {
		int max=input[0];
		
		for(int i=1;i<input.length;i++) {
			if(max<input[i]) {
				max=input[i];
			}
		}
		return max;
	}
	
	public static int findMin(int input[]) {
		int min=input[0];
		
		for(int i=1;i<input.length;i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int length=sc.nextInt();
		
		int input[]=new int[length];
		
		System.out.println("Enter elements");
		for(int i=0;i<length;i++) {
			input[i]=sc.nextInt();
		}
		
		System.out.println("Max is "+findMax(input));
		
		System.out.println("Min is "+findMin(input));
		
		sc.close();

	}

}
