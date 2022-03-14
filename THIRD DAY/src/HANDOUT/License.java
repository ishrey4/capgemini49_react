package HANDOUT;

import java.util.Scanner;

public class License {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		System.out.println("enter the state");
		int age=s.nextInt();
		String state=s.next();
		
		License ob=new License();
		boolean b=ob.findlicense(age,state);
	}
		
		

	private boolean findlicense(int age, String state) {
		// TODO Auto-generated method stub
		boolean a=true;
		if((age>18&&age<60)&&(state=="TN"||state=="KA"||state=="KL"))
{
	return true;
}
else if((age>60&&age<18)&&(state=="TN"||state=="KA"||state=="KL")) {
	return false;
}
else {if(age>15) {
	return true;
}
else {
	return false;
	
}
}
		
	}

}
