package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class exercise1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("shreya");
		list.add("sindhu");
		list.add("bunny");
		list.add("bittu");
		Iterator itr=list.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
		

	}

}
