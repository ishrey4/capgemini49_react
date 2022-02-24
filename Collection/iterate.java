package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("black");
		list.add("yellow");
		list.add("blue");
		list.add("red");
		list.add("purple");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());

	}

}
}
