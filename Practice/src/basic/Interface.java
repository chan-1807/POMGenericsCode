package basic;
interface example{
	public void printer();
	public void hello();
}

class childs implements example{
	public void printer(){
		System.out.println("Printer method");
	}
	public void hello() {
		System.out.println("Hello World");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childs ch=new childs();
		ch.printer();
		ch.hello();

	}

}
