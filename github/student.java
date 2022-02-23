package github;

public class student {
	String sname;
	int age;
	String branch;
	

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


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.setSname("tom");
        s.setAge(20);
        s.setBranch("cse");
        System.out.println(s.getSname());
        System.out.println(s.getAge());
        System.out.println(s.getBranch());
	}
	

}
