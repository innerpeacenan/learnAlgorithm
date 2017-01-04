package chapter1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise {
	//long max 9223372036854775807    (the max length is 19)
	static long[] storage = new long[100];// declare array and initiate array
	
	/*p35 exercise 1.1.19
	 * from f(40),it works slow
	 * optimize by using static variable
	 */
	public static long fibonacci (int N){
		if(N == 0) return 0;
		if(N == 1) return 1;
		if(storage[N]!= 0) return storage[N];
		storage[N] = fibonacci(N-1)+fibonacci(N-2);
		return storage[N];
	}
	
	public static void fibonacciTest (){
		/*the max of long is 9223372036854775807,which only allow to calculate fibonacci of 92*/
		for (int N = 0; N <=92; N++){
			storage[N] = 0;
		}
		for (int N = 0; N <=92; N++){
			StdOut.println(N +" "+fibonacci(N));
		}
	}
	
	/*p35 exercise 1.1.24*/
    public static int gcd(int p, int q){
    	StdOut.println(p +" "+ q );
    	if(q==0) return p;
    	int r = p % q;
    	return gcd(q,r);
    }
    
    public static void gcdTest (){
    	/*
    	 * to read arguments, a while circulation was need
    	 */
    	while(StdIn.hasNextLine()){
    		int p = StdIn.readInt();
    		int q = StdIn.readInt();
    		StdOut.println("the greatest common divisor of "+p+" and "+q+" is: "+gcd(p,q));
    	}
    }
    
    /*
     * enhance Exercise math ability and good habit
     */
    public static String exR1(int n){
    	if(n <= 0) return "";
    	StdOut.printf("%s,%s\n",n-3,n-2);
    	return exR1(n-3)+n+exR1(n-2)+n;
    }
    
    public static void exR1Test (){
    	StdOut.println(exR1(6));
    }
    
    public static int mystery (int a,int b){
    	if(b == 0) return 0;
    	if(b % 2 == 0) return mystery(2*a,b/2);
    	return mystery(2*a,b/2)+a;
    }
    
    public static void mysteryTest (){
    	StdOut.println(mystery(2,25));
    	StdOut.println(mystery(3,11));
    }
    
	public static void main(String[] args) {
//		fibonacciTest ();
//		gcdTest ();
//		exR1Test();
//		mysteryTest ();
	}
}