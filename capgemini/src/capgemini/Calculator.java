package capgemini;

import java.util.Scanner;

public class Calculator {
	Scanner s=new Scanner(System.in);
	void add() {
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result=a+b;
		System.out.println(result);
	}
	void sub(int a,int b) {
		int result=a-b; 
		System.out.println(result);
		
	}

	
	int multiplication() {
		int a=s.nextInt();
		int b=s.nextInt();
		int result=a*b;
		return result;
		
	}
	int division(int a,int b) {
		int result=a/b;
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Calculator ob=new Calculator();
	   ob.add();
	   ob.sub(3, 7);
	   ob.multiplication();
	   ob.division(21, 7);

	}

}
