
import java.util.Arrays;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Draw {
	public static void firstTest(){
    	int N = 100;
    	StdDraw.setXscale(0,N);
    	StdDraw.setYscale(0,N*N);
    	StdDraw.setPenRadius(.01);
    	for(int i = 1; i < N; i++){
    		StdDraw.point(i,i);
    		StdDraw.point(i, i*i);
    		StdDraw.point(i, i*Math.log(i));
    	}
	}
	
    public static void secondTest(){
        int N = 50;
        double [] a = new double[N];
        for (int i = 0; i < N; i++){
        	a[i] = StdRandom.uniform();
        }
        for (int i = 0; i < N; i++){
        	double x = 1.0*i/N;
        	double y = a[i]/2.0;
        	double halfWidth = 0.5/N;
        	double halfHeight = a[i]/2.0;
        	StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
        }
    }
    public static void thirdTest(){
        int N = 10;
        //right way to declare double[] a
        double[] a = new double[N];
        for (int i = 0;i < N; i++){
            a[i] = StdRandom.uniform();
//            StdOut.print(a[i] + " ");
        }
        
        Arrays.sort(a);
        for ( int i = 0; i < N; i++){
        	double x = 1.0*i/N;
        	double y = a[i]/2.0;
        	double halfWidth = 0.5/N;
        	double halfHeight = a[i]/2.0;
        	StdDraw.filledRectangle( x, y, halfWidth, halfHeight);
        }
    }
	public static void main (String[] args){
		thirdTest();

		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		thirdTest();
    }
    	
  
}
