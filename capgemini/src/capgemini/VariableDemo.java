package capgemini;

public class VariableDemo {
	int count=20;//instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//local variable
		
		VariableDemo demo=new VariableDemo();
		demo.count=1;
		System.out.println(demo.count);
		
		VariableDemo demo1=new VariableDemo();
		System.out.println(demo1.count);

	}
	void display() {
		System.out.println();
	}

}
