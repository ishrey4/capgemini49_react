package github;

public class car {
	String cname;
	int cid;
	String owner;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.setCid(1);
		c.setCname("Creta");
		c.setOwner("Aadi");
		
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println(c.getOwner());

	}

}
