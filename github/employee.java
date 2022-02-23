package github;

public class employee {
	int eid;
	String ename;
	int ecount;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEcount() {
		return ecount;
	}

	public void setEcount(int ecount) {
		this.ecount = ecount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.setEcount(2);
		e.setEid(1);
		e.setEname("ravan");
		
		System.out.println(e.getEcount());
		System.out.println(e.getEname());
		System.out.println(e.getEid());
		
		

	}

}
