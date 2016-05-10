public class InsertionSort_2{
	public static void sort(Comparable[] a) {
		int N = a.length;
		for(int i = 1; i < N; i++) {
			Comparable key = a[i];
			for(int j = i;j > 0 && less(key, a[j-1]); j--) {
				a[j] = a[j-1];
			}
			a[j] = key;
		}
	}
}