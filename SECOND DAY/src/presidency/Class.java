package presidency;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ecalculateinfo ob=new ecalculateinfo();
		ob.setBasicpay(200);
		ob.setEmpid(50);
		ob.setDays(20);
		ob.setEmpname("Tom");
		ob.setHolidays(1);
		ob.setSallowance(500);
		ob.setTax(6);
		scalculate s=new scalculate();
		esalary info=s.calculateTaxamount(ob);
		System.out.println("salary calculated="+info.getTAxamount());

	}


}
