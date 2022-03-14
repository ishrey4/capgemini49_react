package Stringstudy;

public class tostring {
	String sname;
	int sno;
	String branch;
	
	tostring(String sname,int sno,String branch) {
		this.sname=sname;
		this.sno=sno;
		this.branch=branch;
		
	}
	
	public String toString() {
		return sname+" "+sno+" "+branch;
		
		
	}
	public static void main(String[]args) {
		tostring s=new tostring("shtreya",   1,  "cse");
		tostring s1=new tostring("sindhu",   2,   "ist");
		System.out.println(s);
		System.out.println(s1);
	}
	
	
	

}
