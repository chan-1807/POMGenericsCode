package corematerial;

public class string {
	public static void main(String[] args) {
		String s1 = "vengat";
		String s2 = "prabu"; 
		String s3="vengat";
		System.out.println("Immutable string");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		String r = s1.concat(s2);
		System.out.println(r);
		System.out.println(System.identityHashCode(r));
		StringBuffer x1=new StringBuffer("vengat");
		StringBuffer x2=new StringBuffer("prabu");
		StringBuffer x3=new StringBuffer("prabu");
		System.out.println("mutable string");
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		System.out.println(System.identityHashCode(x3));
		x1.append(x2);
		System.out.println(x1);
		System.out.println(System.identityHashCode(x1));
	}
}



//Immutable--> duplicate same memory , CONCAT .. new mem
//Literal--> duplicate same mem
//Non Literal--> duplicate new mem NEW
//Mutable --> duplicates different memory , WHERE CONCARTINATION same memort  	-->NEW KEYWORD