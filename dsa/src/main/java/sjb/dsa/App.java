package sjb.dsa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Stack s=new Stack(5);
      s.push(10);
      s.push(20);
      s.display();  
      System.out.println("top element is:"+s.peek());
      		
      
      System.out.println("popped element is:"+s.pop());
      s.display();
      
}
}
