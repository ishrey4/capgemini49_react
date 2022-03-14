package capgemini;

public class scholarship {
	int marks;
	String city;
	int scholarship;
	int sclass;
	
	void calculatescholarship() {

	if(sclass==10) {
		if(marks<60&&marks>30) {
			scholarship=30*15000/100;
		}
		if(city=Chennai) {
			scholarship=scholarship-1000;
		}
		else {
			scholarship=scholarship-3000;
		}
	else if(marks<90&&marks>60){
		scholarship=50*15000/100;
	}
	else(marks>90){
		scholarship=70*15000/100;
	}
	else if(sclass==11){
		if(marks<60&&marks>30) {
			scholarship=30*25000/100;
		}
		else if(city=Chennai) {
			scholarship=scholarship-1000;
		}
		else {
			scholarship=scholarship-3000;
		}
		}
		else if(marks<90&&marks>60){
		scholarship=50*25000/100;
	}
	else(marks>90){
		scholarship=70*25000/100;
	}
	}
	}
	
			
		
		
	
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scholarship ob=new scholarship();
		ob.calculatescholarship();

	}

}
