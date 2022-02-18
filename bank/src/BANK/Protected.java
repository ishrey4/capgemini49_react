package BANK;

public class Protected extends baseaccount {
	String pin;
	
	
	void deposit(double balance,String pin) {
		this.balance=balance;
		this.pin=pin;
		System.out.println("the deposit amoiunt is high");
		
	}
	void withdraw(double balance,String pin) {
		this.balance=balance;
		this.pin=pin;
		System.out.println("the withdraw amount is same:");	}
	


public static void main(String[]args) {
	
	
}
}