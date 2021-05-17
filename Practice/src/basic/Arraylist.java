package basic;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//System.out.println(list.get(2));
		list.remove(2);
		//System.out.println(list.get(2));
		//list.remove("10");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		for(Integer i: list) {
			System.out.println((i));
		}
	}

}
