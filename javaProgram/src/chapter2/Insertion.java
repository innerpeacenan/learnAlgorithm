package chapter2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Insertion {
	/**
	 * 
	 * @param a
	 *            array to sort
	 *            <p>
	 * 
	 *            <pre>
	 * for i<-1 to n-1
	 * # insert a[i] into list a[i-1],a[i-2],...,a[0]
	 * # if compare from j<-0 to i-1,then once less(a[i],a[j]),a show be inserted before a[j], that means all
	 * # elements behind, that is ,a[j],a[j+1],...,a[i-1] should be move to new position, is it not so convenient and effective to excute
	 * # so its better to compare from j=i to j=1, then once less(a[j],a[j-1]) then exchage a[j] and a[j-1]
	 *     for j<-i to j=1
	 *           if less(a[j],a[j-1])
	 *               do a[j <-> a[j-1]
	 *           #end if
	 *     # end for
	 * # end for
	 *            </pre>
	 *            </p>
	 *            <p>
	 *            latest change:
	 *            <ul>
	 *            <li>fixed java.lang.ArrayIndexOutOfBoundsException by </li>
	 *            <li></li>
	 *            </ul>
	 *            </p>
	 */
	public static void sort(Comparable [] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {//@key make a mistick as j++
				exch(a, j, j - 1);
			}
		}
	}

	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void show(Comparable[] a) {
		// print an array in line
		int N = a.length;
		for (int i = 0; i < N; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}

	public static boolean isSorted(Comparable[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}

	public static void integerArrayTest() {
		// accept the user input and convert to Integer array
		String[] t = StdIn.readAllStrings();
		int n = t.length;
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(t[i]);
		}
		sort(a);
		assert isSorted(a);
		show(a);
	}

	public static void stringArrayTest() {
		String[] a = StdIn.readAllStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}

	public static void main(String[] args) {
		// stringArrayTest();
		integerArrayTest();
	}
}
