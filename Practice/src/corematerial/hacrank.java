package corematerial;

import java.util.Scanner;

public class hacrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int x=a.nextInt();
		
		if (x%2==1) {
			System.out.println("Weird");
		}
		else if ((x>=2 && x<=5)||x>20 ) {
			System.out.println("Not Weird");
		}
		else if(x>=6 && x<=20) {
			System.out.println("Weird");
		}
//		else {
//			System.out.println("Not Weird");
//		}
	}

}
