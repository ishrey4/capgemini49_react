package Collection;

import java.util.ArrayList;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("black");
		list.add("yellow");
		list.add("blue");
		list.add("red");
		list.add("purple");
		
		list.set(3,"silver");
		System.out.println(list);

	}

}
