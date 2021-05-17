package corematerial;

public class literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="CHAN";
String b="HELLO";   // LTERAL
String c="CHAN";
System.out.println(System.identityHashCode(a));
System.out.println(System.identityHashCode(b));
System.out.println(System.identityHashCode(c));

String x1=new String("HELLO"); //NON LITERAL
String x2=new String("CHNA");
String x3=new String("HELLO");
System.out.println(System.identityHashCode(x1));
System.out.println(System.identityHashCode(x2));
System.out.println(System.identityHashCode(x3));
	}

}
