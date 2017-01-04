package chapter2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class shell {

	/**
	 * 
	 * @param a
	 *            construct a sequence as step,eg: 1/2(3^k) + 1
	 * 
	 */
	public static void sort(Comparable[] a) {
		// h = 1 ; h = h * 3 + 1; utill h < N/3, can avoid array out of bound
		// exception
		int N = a.length;
		// construct a sequence as step,eg: 1/2(3^k) + 1
		int h = 1;
		while (h < N / 3) {
			h = h * 3 + 1;
		}

		while (h >= 1) {
			/*
			 * for each step length ,denote h, i = h <- N-1 # insert a[i] into
			 * a[i-h],a[i-2h],...a[h]
			 */
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
					/*
					 * use && to join logical and conditon j must >=h ,if not ,j
					 * = j -h will thorw array out of bound exception
					 * 
					 */
					exch(a, j, j - h);
				}
			}
			// adjust the step lenght by progressively decrease utill it reach 1
			h = h / 3;// made a mistick here at 2016年 12月 26日 星期一 21:43:07
						// CST,should put it inside while (h >=1)
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
		stringArrayTest();
		// integerArrayTest();
	}
}
