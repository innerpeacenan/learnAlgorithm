
import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MyMathTest {
	/*
	 * greatest common divisor

	 * 
	 */

    
   public static double average (double[] a){
	   int N = a.length;
	   double sum = 0.0;
	   for(int i=0; i < N; i++){
		   sum += a[i];
	   }
	   double average = sum / N;
	   return average;
   }
   
   public static void averageTest(){
	   double[] a = {10,9,6,56,23};
	   System.out.print(average(a));
	   //test to be right 
   }
   
   /*
    */
   public static double[] reverseArray(double[] a){
	  int N = a.length;
	  for(int i =0; i < N/2 ; i++){
		  double tmp = a[i];
		  a[i] = a[N-1-i];
		  a[N-1-i] = tmp;
	  }
	  return a;
   }
   
   public static void reverseArrayTest(){
	   double[] a = {10,9,6,56,23};
	   //reverse the array
	   double[] ra = reverseArray(a);
	   System.out.print(Arrays.toString(ra));
   }
/*
 */
   public static double[][] matrixTimes(double[][] a, double[][] b){
	   int N = a.length;
	   double[][] c = new double[N][N];
	   for(int i = 0; i < N; i++){
		   for(int j = 0; j<N; j++){
			   for(int k = 0; k < N; k++){
				   c[i][j] += a[i][k] * b[k][j];
			   }
		   }
	   }	   
	   return c;
   }
   
   public static void maxtrixTimesTest (){
	   double[][] a = {{10,9,6},{10,9,6},{10,9,6}};
	   double[][] b = {{10,9,6},{10,9,6},{10,9,6}};
	   int N = a.length;
	   double[][] c = new double[N][N];
	   c = matrixTimes(a,b);
	   printMatrix(c);
   }
 
/*
 */
   
   public static void printMatrix (double[][] a){
	   int N = a.length;
	   int M = a[0].length;
	   for(int i = 0; i <N; i++){
		   for (int j = 0; j <M; j++) {
			   System.out.print(a[i][j]);
			   System.out.print(" ");
		   }
		System.out.print("\n");   
	   }
   }
 
/*
 */
   public static double sqrt (double c){
	  if(c < 0) return Double.NaN;
	  double t  = c;
	  double err = 1e-15;
	  while (Math.abs(t - c/t) > err*t){
		  t = (c/t + t)/2;
	  }
	  return t;
   }

   
   
   public static void sqrtTest (){
	   double c = 56.73;
	   System.out.print(sqrt(c));
   }

   public static void StdInTest (){
	   double sum = 0.0;
	   int cnt = 0;
	   while (!StdIn.isEmpty()){
		   sum += StdIn.readDouble();
		   cnt++;
	   }
	   double avg = sum /cnt;
	   StdOut.printf("Average is %.5f\n", avg);
   }
    
   public static void main (String[] args){

//	   binarySearchRTest();
//	   sqrtTest();
//	   maxtrixTimesTest();
//	   reverseArrayTest();
//	   averageTest();
//	   maxTest();
	   
	   //@TODO  2016-10-28
   }
   

}

