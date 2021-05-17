package corematerial;

import java.util.ArrayList;
import java.util.List;

public class listarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj=new ArrayList();
		obj.add(10);
		obj.add("Hello");
		obj.add(10.2f);
		System.out.println(obj.size());
		Object value=obj.get(0);
		System.out.println(value);
		
	}

}
