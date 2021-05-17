package basic;

public class InCHild extends Inheritance {
	private String model="Mustang";

	public static void main(String[] args) {
		InCHild ob = new InCHild();
		ob.honk();
		System.out.println(ob.getBrand());
		ob.setBrand("BMW");
		System.out.println(ob.getBrand());
	}

}
