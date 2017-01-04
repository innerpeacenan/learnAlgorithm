package chapter1;

public class prime {
	/**
	 * 
	 * @param n
	 *            int
	 * @return return true if n is prime and fale if not
	 */
	public static boolean isPrime(int n) {
		/*
		 * if n >1 && is_integer(n) && n can be divor only by 1 and n, then n is
		 * a prime to opmise , for i=2 -> sqrt(n) if(n % 2 != 0) return true;
		 * end for
		 */
		if (n < 2)
			return false;
		// @key <=n,if set i** < n ,the numbers like 4,9,16 will be judged as
		// prime
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void isPrimeTest() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ": " + isPrime(i));
		}
	}

	/**
	 * 
	 * @param p
	 *            int
	 * @param q
	 *            int
	 * @return
	 * 
	 *         <p>
	 *         according to euclidean algorithm,
	 *         greatestCommonDividor(p,q) == greatestCommonDividor(q%r);
	 *         </p>
	 * 
	 *         <pre>
	 * #gcd(p,q) the greatest common dividor of p and q       
	 * for two integer p,q,
	 *  if q equal 0;
	 *      return q;
	 *  r=p%q;
	 *  return gcd(q,r);
	 *         </pre>
	 */
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}
    
	
	public static void main(String[] args) {
//		isPrimeTest();
		
	}

}
