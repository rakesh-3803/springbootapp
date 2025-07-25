package programs;

public class Meth {
	String name;
	

	public Meth(String name) {
		super();
		this.name = name;
	}
	
	void showName() {
		System.out.println(("my name is:"+name));
	}
	
	public static void showMessage() {
		System.out.println("i am static method");
	}


	public static void main(String[] args) {
		Meth.showMessage();
		
		Meth m=new Meth("rakesh");
		m.showName();
		
		// TODO Auto-generated method stub

	}

}
