package capgemini;

public class TaxEngine extends IncomeTaxCalculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IncomeTaxCalculator ob=new IncomeTaxCalculator();
		ob.basicpay=10000;
		ob.calculateIncomeTax();
		ob.applyTax();
		ob.validatePay();
		

	}

}
