package BANK;

public class Account {

	private static final String Checkingaccount =null ;
   private static final String Protected = null;
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected p=new Protected();
		p.deposit(10.00, "7865");
		System.out.println("account status is:"+Protected);
		
		p.deposit(20.00, "7856");
		System.out.println("account status is:"+Protected);
		
		p.withdraw(10.00, "7865");
		System.out.println("account status is:"+Protected);
		
		
		Regularaccount r=new Regularaccount();
		Minimumaccount m=new Minimumaccount();
		Interestaccount i=new Interestaccount();
		CD c=new CD();
		
	Checkingaccount a=new Checkingaccount("tom", "9999", 30.0);
	System.out.println("creating a checking account:");
	
	System.out.println("account status is:"+ Checkingaccount);
	System.out.println("doing a monthly update:");
    
	
	System.out.println("account status is:"+Checkingaccount);

	}
    
}
