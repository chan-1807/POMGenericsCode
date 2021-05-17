package basic;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> id=new HashMap();
		id.put(1, "CHan");
		id.put(2, "Teja");
		id.put(3, "Selva");
		System.out.println(id);
		System.out.println(id.get(2));
		for(Integer i:id.keySet()) {
			System.out.println(id.get(i));
		}
		for(String i:id.values()) {
			System.out.println(i);
		}
	}

}
