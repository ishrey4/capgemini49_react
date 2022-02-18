package github;

public class pen {
	String color;
	int num;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen p=new pen();
		p.setColor("black");
		p.setNum(23);
		
		System.out.println(p.getColor());
		System.out.println(p.getNum());

	}

}
