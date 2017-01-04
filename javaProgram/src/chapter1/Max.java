package chapter1;

public class Max {
	/**
	 * 
	 * @param a
	 *            array
	 * @return the max value in array
	 */
	public static int max(int[] a) {
		int max = a[0];
		int N = a.length;
		for (int i = 1; i < N; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	/**
	 * 
	 * @param a
	 *            array
	 * @return the max value in array
	 */
	public static double max(double[] a) {
		int N = a.length;
		double max = a[0];
		for (int i = 0; i < N; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void maxTest() {
		int[] a = { 10, 9, 6, 56, 23 };
		double[] b = { 4.0, 9.9, 6.7, 5.66, 2.3 };
		System.out.println(max(a));
		System.out.println(max(b));
	}

	public static void main(String[] args) {
		maxTest();
	}
}
