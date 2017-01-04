package chapter1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

/*
 * @author xiaoning nan
 * last modified on 2016-12-03
 */
public class BinarySearch {
	/**
	 * this method can not find
	 * 
	 * @param key
	 *            the value need to search
	 * @param a
	 *            a must be a sorted array
	 */
	public static int binarySearch(int hay, int[] stack) {
		
		int low = 0;
		int high = stack.length - 1;
		// if set only low < high, then the first and the last element in the
		// sorted array can not be found
		// @key part
		while (low <= high) {
			// note that mid was set only when low lower or equal to high
			// @key part
			int middle = low + (high - low) / 2;
			if (hay < stack[middle]) {
				high = middle - 1;
			} else if (hay > stack[middle]) {
				low = middle + 1;
			} else {
				return middle;// return the index where the key is in the array
			}
		}
		return -1;
	}

	public static void binarySearchTest() {
		int[] whitelist = { 10, 9, 6, 56, 23 };
		Arrays.sort(whitelist);
		System.out.println("after sorted, the whilte list is:\n" + Arrays.toString(whitelist));
		int key = 9;
		// if the key can not be find by binary search, then print it out
		int position = binarySearch(key, whitelist);
		if (position == -1) {
			System.out.println(key);
		} else {
			System.out.println("the index the key in the array is:\n " + position);
		}
	}

	/**
	 * 
	 * @param key
	 *            the value need to search
	 * @param haystack
	 *            the array to search in
	 * @return
	 */
	public static int binarySearchR(int key, int[] haystacck) {
		int depth = 0;
		return binarySearchR(key, haystacck, 0, haystacck.length - 1, depth+1);
	}

	/**
	 * @param key
	 *            the value need to search
	 * @param haystack
	 *            the array to search in
	 * @param lo
	 *            the began position to of search range
	 * @param hi
	 *            the end position to of search range
	 * @return Returns the position of where the key exists relative to the
	 *         beginning of the haystack array
	 *         <p>
	 *         <b>limit interval varible mid to 0 to haystack.length-1 to avoid
	 *         java.lang.ArrayIndexOutOfBoundsException</b>
	 *         </p>
	 */
	public static int binarySearchR(int key, int[] haystack, int lo, int hi,int depth) {
		for (int counter=0; counter < depth; counter++){
			StdOut.print(" ");
		}
		StdOut.print("depth:" + depth + ",low:" + lo +" ,high" + hi +" ;\n");
		
		int mid = lo + (hi - lo) / 2;
		if (mid >= 0 && mid < haystack.length) {//there is some proplem,I am a little confused, and decide to fixed it latter
			if (key < haystack[mid]) {
				return binarySearchR(key, haystack, lo, mid - 1,depth+1);
			} else if (key > haystack[mid]) {
				return binarySearchR(key, haystack, mid + 1, hi,depth+1);
			} else {
				return mid;
			}
		} else {
			return -1;// when value could not be found in the array
		}
	}

	public static void binarySearchRTest() {
		int[] whitelist = { 10, 9, 6, 56, 23 , 56 , 37 , 22 , 333 };
		Arrays.sort(whitelist);
		System.out.println("the sorted array is: " + Arrays.toString(whitelist));
		int key = 57;
		int position = binarySearchR(key, whitelist);
		if (position != -1) {
			System.out.println("the index the " + key + " in the array is:\n " + position);
		} else {
			System.out.println("the value could not be found the the given array");
		}

	}

	/**
	 * Main method not found in class chapter1.BinarySearch, please define the
	 * main method as: public static void main(String[] args) so String[] args
	 * is very important,without it ,there will be nothing export
	 */
	public static void main(String args[]) {
		// binarySearchTest();
		binarySearchRTest();
	}

}
