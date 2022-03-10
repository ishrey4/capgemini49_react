package presidency;

public class scalculate {
	
	public esalary calculateTaxamount(ecalculateinfo info) {
	 long taxamount=(long)((info.getBasicpay()*info.getHolidays())+(info.getSalary()*info.getHolidays())*info.getTax()/100);
	 esalary salaryinfo=new esalary();
	 salaryinfo.setEmpid(info.getEmpid());
	 salaryinfo.setEmpname(info.getEmpname());
	 salaryinfo.setTaxamount(taxamount);
	 return salaryinfo;
	}
	
 
	 
	 
	 }


	
	


