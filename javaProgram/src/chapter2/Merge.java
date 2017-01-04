package chapter2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Merge {

	/*
	 * auxiliary array for merges,so only one the array was divide
	 * recursively,so it is in place sort,and subarrays will never has key
	 * intersetion, so it is safe to restore all temporary value into just one
	 * big enough array aux,to declare it as static property can avoid
	 * reconstruct of temporay array and can be used any where
	 */
	private static Comparable[] aux;

	/**
	 * 
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 *            merge two sorted subarrays into a ordered sorted array, called
	 *            recursively,does not limit to 0 - N-1
	 */
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		/*
		 * This method merges by first copying into the auxiliary array aux[]
		 * then merging back to a[] . Comparable[] aux
		 */
		for (int k = 0; k <= hi; k++) {
			aux[k] = a[k];
		}
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			/*
			 * check if i and j hit the botton ,the is import before compare, if
			 * one of them doesn't exist, how can you compare the two value
			 * so,bundary check is prerequisite of compare
			 */
			if (j > hi) {
				a[k] = aux[i++];
			} else if (i > mid) {
				a[k] = aux[j++];
			} else if (less(a[i], a[j])) {
				a[k] = aux[i++];
			} else {
				a[k] = aux[j++];
			}
		}
	}

	/**
	 * 
	 * @param a
	 * start to  sort 
	 */
	public static void sort(Comparable[] a) {
		int N = a.length;
		// Allocate space just once.
		aux = new Comparable[N];
		sort(a, 0, N - 1);
	}

	/**
	 * 
	 * @param a
	 * @param lo
	 * @param hi
	 *            arrange order to sort recursively
	 * 
	 */
	public static void sort(Comparable[] a, int lo, int hi) {
		// should clear understand when to stop recursive ,fixed this bug on
		// 2016年 12月 27日 星期二 22:32:06 CST
		if (lo >= hi)
			return;
		/*
		 * this is the right way to caculate mid,fixed at 2016年 12月 27日 星期二
		 * 22:46:53 CST
		 */
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid); // Sort left half.
		/*
		 * sort right part(the second subarray start form a[mid+1], fatal error
		 * made)
		 */
		sort(a, mid + 1, hi); 
		/*
		 * merge two subarrays (this is the correct way to call merge())
		 */
		merge(a, lo, mid, hi);

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
//		String[] a = StdIn.readAllStrings();
		String[] a = { "M", "E", "R", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E" };
		sort(a);
		assert isSorted(a);
		show(a);
	}

	public static void main(String[] args) {
		stringArrayTest();
		// integerArrayTest();
	}

}
