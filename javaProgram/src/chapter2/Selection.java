package chapter2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Selection {
	/**
	 * 
	 * @param a array need to sort
	 */
    public static void sort (Comparable[] a){
   	 int N = a.length;
   	 for(int i = 0 ; i < N; i++){
   		 int min = i;
   		 for (int j = i+1; j < N; j++){
   			 if(less(a[j],a[min])) {//@key compare a[j] and a[min], not j and min
   				 min = j;//@key need to  know where the min element is
   			 }
   		 }
   		 exch(a,i,min); //@key ,find the min element, and exchange with a[i]
   	 }
    }
     
     public static boolean less (Comparable v,Comparable  w){
    	 return v.compareTo(w) < 0;
     }
     
     public static void exch(Comparable[] a, int i, int j){
    	 Comparable t = a[i];
    	 a[i] = a[j];
    	 a[j] = t;
     }
     
     public static void show (Comparable[] a){
    	 //print an array in line
    	 int N = a.length;
    	 for(int i=0; i < N; i++){
    		 StdOut.print(a[i] + " ");
    	 }
    	 StdOut.println();
     }
     
	 public static boolean isSorted (Comparable[] a){
    	 int N = a.length;
    	 for(int i = 1; i < N; i++){
    		 if(less(a[i],a[i-1])){
    			 return false;
    		 }
    	 }
    	 return true;
     }
     
	 public static void integerArrayTest  (){
		 //accept the user input and convert to Integer array
    	 String [] t = StdIn.readAllStrings();
    	 int n = t.length;
         Integer [] a = new Integer [n];
         for ( int i = 0; i < n; i++ ){
        	 a[i] = Integer.parseInt(t[i]);
         }
    	 sort(a);
    	 assert isSorted(a);
    	 show(a);
	 }
	 
	 public static void stringArrayTest (){
		 String [] a = StdIn.readAllStrings();
    	 sort(a);
    	 assert isSorted(a);
    	 show(a);
	 }
	 
     public static void main (String[] args){
//    	 stringArrayTest();
    	 integerArrayTest ();
     }
}
