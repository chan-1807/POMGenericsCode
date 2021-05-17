package basic.poly;

public class Sub extends Super {
	public  void girlname() {
		System.out.println("SUb girl");
	}
	public static void main(String[] args) {
		//girlname();
		// TODO Auto-generated method stub
		Sub obj=new Sub();
		obj.girlname();
		Super ob =new Super();
		ob.girlname();
		Super o=new Sub();
		o.girlname();
	}

}
