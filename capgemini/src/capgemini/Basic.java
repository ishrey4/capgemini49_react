package capgemini;

import java.util.Scanner;

//ctrl+shift+f for allignment
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome to java Training");
		Scanner s=new Scanner(System.in);
		
		 int a=s.nextInt();
         int b=s.nextInt();
         
         Basic obj=new Basic();
         obj.display(a, b);
         //System.out.println("a:" +a+ "b:" +b);
	}
	
     int display(int a,int b) {
       //System.out.println(a+b);
    	 return a + b;
     }
}
