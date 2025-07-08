package sjb.dsa;

public class Stack {
	private int[] array;
	private int size;
	private int top;
	public Stack(int size) {
		super();
		this.size = size;
		array=new int[size];
		top=-1;
	}
	
public boolean isFull() {
	return(top==size-1);
}
public boolean isEmpty() {
	return(top==-1);
	
}
public int peek() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
	}
	return array[top];
		
	}

public void push(int item) {
	if(isFull()) {
		System.out.println("stack is full");
		return;
	}
	array[++top]=item;
	
}
public int pop() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
		
	}
	int item=array[top--];
	return item;
}
public void display() {
	System.out.println("stack elements are:");
	for(int i=top;i>=0;i--) {
		System.out.println(array[i]);
	}
}
}

