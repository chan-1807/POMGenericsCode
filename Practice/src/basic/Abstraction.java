package basic;
abstract class ab{
	abstract void printer();
	public void hello() {
		System.out.println("Hello World");
	}
}

 class child extends ab{
	public void printer() {
		System.out.println("Printer Method");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		child ch=new child();
		ch.printer();
		ch.hello();
	}
}
