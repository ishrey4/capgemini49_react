package capgemini;

import java.util.Scanner;

public class Student {
	
		Scanner c = new Scanner(System.in);
		int cls = c.nextInt();
		int marks = c.nextInt();
		
		void calculatescholar() {
		
			
		
		if(cls==10) {
			if (marks <60 && marks >30) {
				System.out.println("Scholarship amount is:"+((30*15000)/100));
			}
			else if (marks <90 && marks >60) {
				System.out.println("Scholarship amount is:"+((50*15000)/100));
			}
			else if(marks>90) {
				System.out.println("Scholarship amount is:"+((70*15000)/100));
			}
			else {
				System.out.println("Scholarship amount is:"+0);
			}
		}
		else if(cls==11) {
			if (marks <60 && marks >30) {
				System.out.println("Scholarship amount is:"+((30*25000)/100));
			}
			else if (marks <90 && marks >60) {
				System.out.println("Scholarship amount is:"+((50*25000)/100));
			}
			else if(marks>90) {
				System.out.println("Scholarship amount is:"+((70*25000)/100));
			}
			else {
				System.out.println("Scholarship amount is:"+0);
			}
			
		}
		else if(cls==12) {
			if (marks <60 && marks >30) {
				System.out.println("Scholarship amount is:"+((30*30000)/100));
			}
			else if (marks <90 && marks >60) {
				System.out.println("Scholarship amount is:"+((50*30000)/100));
			}
			else if(marks>90) {
				System.out.println("Scholarship amount is:"+((70*30000)/100));
			}
			else {
				System.out.println("Scholarship amount is:"+0);
			}
		}
		}
	


public static void main(String args[]){
	Student ob=new Student();
	ob.calculatescholar();
	
}
	
}