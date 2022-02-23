package github;

public class notebook {
	int no;
	String clas;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notebook n=new notebook();
		n.setClas("one");
		n.setNo(30);
		
		System.out.println(n.getClas());
		System.out.println(n.getNo());
		

	}

}
