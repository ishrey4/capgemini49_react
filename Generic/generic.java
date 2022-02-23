package Generic;

public class generic<T> {
	private T t;
	
	public void add(T t) {
		this.t=t;
	}
	public T get() {return t;}
	public void getArea() {}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generic<Integer>rectangle=new generic<Integer>();
		generic<Double>circle=new generic<Double>();
		rectangle.add(20);
		circle.add(5.6);
		System.out.println(rectangle.get());
		System.out.println(circle.get());
		

	}

}
