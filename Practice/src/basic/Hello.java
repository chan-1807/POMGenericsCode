package basic;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		int i,total=0;
//		for(i=1;i<=30;i++) {
//			total+=i*2;
//		}
//	System.out.println("Total is "+ total);
	//	System.out.println(" Pairs" );
		int j,mul;
		for(j=1;j<10000
				;j++) {
			mul=j*7;
	
				if(mul%2==1 && mul%3==1 &&mul%4==1 &&mul%5==1 &&mul%6==1) {
					System.out.println(mul +"\t  "+ j );
				}
				
			
			
		}
	}

}
