package Collection;

import java.util.ArrayList;

public class retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("black");
		list.add("yellow");
		list.add("blue");
		list.add("red");
		list.add("purple");
		
		list.remove(1);
		System.out.println(list);

	}

}
