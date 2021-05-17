package basic;

import basic.Outer.Inner;

class Outer{
	int x=5;
	 static class Inner{
		int y=15;
	}
}

public class Nestedclass {

	public static void main(String[] args) {
		
		Outer out=new Outer();
		System.out.println(out.x);
		Inner in =new Inner();
		System.out.println(in.y);
	}

}
