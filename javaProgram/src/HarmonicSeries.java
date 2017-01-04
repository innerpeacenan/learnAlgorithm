import edu.princeton.cs.algs4.StdOut;

public class HarmonicSeries {
	public static double sum (int N){
		double sum = 0.0;
//		i start from 1,not 0, made a logical mistick before,
//		the best way to avoid it is to run the code from where it start step by step in you brain 
		for ( int i = 1; i <= N; i++){
			sum += 1.0/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		StdOut.println(sum(5000));
	}
}
