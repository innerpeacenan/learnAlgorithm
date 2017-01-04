import edu.princeton.cs.algs4.StdOut;
/**
 * 
 * @author root
 * <p>write a program to find when merge sort will be faster than insertion sort whih the growth of array length</p>
 *
 */
public class logarithm {
	public static void main(String[] args) {
		int n = 2;// n must not equal to 1 for logarithm
		double lgn = Math.log(n) / Math.log(2);
		/*
		 * 8*n*n insertion srot time cost 64*n*lgn merge sort time cost
		 */
		while (8 * n * n < 64 * n * lgn) {
			n++;
		}
		StdOut.println(n);// the result is 8,which means while array lenght >=8,
							// merge sort is more quick
	}
}
