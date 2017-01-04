
public class HelloWorld {
    public static void main(String []args) {
    	
		boolean test = true && false || true && true;
		double b = 2.0e-6 *100000000.1; 
		if(b > 0) b = 0 ;else b = 1;
       System.out.println(test);
       System.out.println(b);
    }
}