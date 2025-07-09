package sjb.TimeComplexity;


public class App 
{
    public static void main( String[] args )
    {
    	Lsearch l=new Lsearch();
    	int[]arr= {10,20,30,40};
    	int res=l.linearSearch(arr,20);
    	if(res==-1) {
    		System.out.println("elem not found");
    	}else {
    		System.out.println("elem found");
    	}
    	System.out.println(l.linearSearch(arr,20));
}
}
