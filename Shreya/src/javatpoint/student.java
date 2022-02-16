package javatpoint;

public class student {
	
	int sid;
	String sname;
	int age;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.setSid(100);
		s.setSname("tom");
		s.setAge(20);
		
		 System.out.println(s.getSid());
		 System.out.println(s.getSname());
		 System.out.println(s.getAge());

	}

}
