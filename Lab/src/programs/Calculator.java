package programs;

public class Calculator {
	int a=20;
	int b=10;
	
	
	public int add( int a, int b) {
		return a+b;
		
	}
	public int sub( int a, int b) {
		return a-b;
		
	}
	
	public int multi( int a, int b) {
		return a*b;
		
	}
	
	public int div( int a, int b) {
		return a/b;
		
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.add(20,10));
		System.out.println(cal.sub(20,10));
		System.out.println(cal.multi(20,10));
		System.out.println(cal.div(20,10));

		// TODO Auto-generated method stub

	}

}
