
public class Example {
     private static boolean less (Comparable<Comparable<?>> v, Comparable<?> w){
    	return v.compareTo(w) < 0;
     }
     
     public static boolean isSorted ( @SuppressWarnings("rawtypes") Comparable[] a){
    	 int N = a.length;
    	 for (int i = 1; i < N; i++){
    		 if (less(a[i],a[i-1])) return false;
    	 }
    	 return true;
     }
}
