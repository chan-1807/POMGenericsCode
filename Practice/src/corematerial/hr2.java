package corematerial;

import java.util.Scanner;

public class hr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.println("================================");
		for (int i=0;i<3;i++) {
			String st=s.next();
			int x=s.nextInt();
			System.out.printf("%-15s%03d%n",st,x);
		}
		System.out.println("================================");

	}

}
