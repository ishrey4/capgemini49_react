package Collection;

import java.util.HashSet;
import java.util.Iterator;
//HASH SET
//LINKED HASH SET
//TREESET
public class hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hash=new HashSet<String>();//setting the list
		hash.add("shreya");
		hash.add("sindhu");
		hash.add("shreya");
		hash.add("sindhu");
		Iterator itr=hash.iterator();//traversing
		while(itr.hasNext());
		System.out.println(itr.next());//printing the iterator

	}

	
}
