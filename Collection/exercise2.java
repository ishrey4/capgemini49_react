package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d=new ArrayDeque<String>();
		d.add("shreya");
		d.add("aadi");
		d.add("sindhu");
		d.add("niyathi");
		for(String str:d) {
			System.out.println(str);
		}

	}

}
