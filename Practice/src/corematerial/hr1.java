package corematerial;

import java.util.Scanner;

public class hr1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		
		int i = a.nextInt();
        double d=a.nextDouble();
       a.nextLine();
        String s=a.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}