package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;
public class Reverse {
    public static void main (String[] args){
    	Stack<Double> s = new Stack<Double> ();
    	while (! StdIn.isEmpty()){
    		//java General type need Item to be reference type, not raw type.so <item> should be <Double> ,not <double>
    		s.push(StdIn.readDouble());
    	}
    	for ( double i : s){
    		StdOut.println(i);
    	}
    }
}
