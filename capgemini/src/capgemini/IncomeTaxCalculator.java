package capgemini;

public class IncomeTaxCalculator {
	float basicpay;
	boolean Citizenship;
	float incometax;
	float nettpay;
	
	
	void calculateIncomeTax() {
		incometax=10*basicpay/100;
		
		System.out.println("The Incometax of the employee for the basic salary is " +incometax);
	}
		
    void applyTax() {
    	nettpay=basicpay-incometax;
    	System.out.println("The nettpay of the employee is "+nettpay);
    }
    	
    void validatePay() {
    	boolean True = false;
		if(basicpay >200000 && Citizenship==True) {
    		System.out.println("The salary and citizenship eligibility");
    	}
    	else {
    		System.out.println("The salary and citizenship is not eligible");
    	}
    }
}
    	
    
		
		
		
		
	
	

	
