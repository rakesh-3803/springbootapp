package programs;

public class Construct {
	
	private String name;
	public Construct(String name) {
		this.name=name;
		System.out.println("Contrsuctor called");
	}
	public void display() {
		System.out.println("Hello,my name is "+name);
	}
	public void cleanup() {
		System.out.println("Destructor called");
	}

	public static void main(String[] args) {
		Construct obj=new Construct("rakesh");
		obj.display();
		obj.cleanup();
	}

}