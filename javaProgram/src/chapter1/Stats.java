package chapter1;


import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stats {
    public static void main (String[] args){
    	Bag<Double> numbers = new Bag<Double>();
    	while (!StdIn.isEmpty()){
    		numbers.add(StdIn.readDouble());
    	}
    	
    	int N = numbers.size();
    	double sum = 0.0;
    	for( double x : numbers){//this is the for each statement of java
    		sum += x;
    	}
    	double mean = sum / N;
    	for (double x : numbers){
    		sum += (x-mean)*(x-mean);
    	}
    	double stdev = Math.sqrt(sum /(N-1));
    	StdOut.printf("mean:%.2f\n", mean);
    	StdOut.printf("std divation:%.2f\n", stdev);
    }
}
