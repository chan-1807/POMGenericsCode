package corematerial;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N = s.nextInt();
        for(int i=1;i<=10;i++){
            int ans=N*i;
            
            System.out.println(N+"x"+i+"=" + ans);
        }
	}

}
