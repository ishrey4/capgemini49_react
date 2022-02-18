package abstraction;

interface Mytest{
	
	public static void calculate() {
	}
		
	}
	


class addition implements Mytest{
	public void calculate(){System.out.println("the add marks are 60"); 
	}
	}

class subtraction implements Mytest{
	public void calculate() {System.out.println("the subtract marks are 20");
	}
	}
	
	
class multiplication implements Mytest{
	public void calculate() {System.out.println("the multiplied marks are 100");
}
}


public class Interface {
	public static void main(String[]args) {
		addition a=new addition();
		a.calculate();
		subtraction s=new subtraction();
		s.calculate();
		multiplication m=new multiplication();
		m.calculate();
	}

}






