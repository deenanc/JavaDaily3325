package marks10;

import java.util.Scanner;

public class MatchFix {
	
	public static String scoreCardTitle(String team1, String team2) {
		
		StringBuffer sb=new StringBuffer();
		sb.append(team1.substring(0, 3));
		sb.append(" vs ");
		sb.append(team2.substring(0, 3));
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first team");
		String team1=sc.next();
		System.out.println("Enter second team");
		String team2=sc.next();
		System.out.println(scoreCardTitle(team1, team2));
		sc.close();

	}

}
