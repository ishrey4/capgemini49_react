package github;

public class mobile {
	String owner;
	String name;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile m=new mobile();
		m.setName("redmi");
		m.setOwner("shreya");
		
		System.out.println(m.getName());
		System.out.println(m.getOwner());
		

	}

}
