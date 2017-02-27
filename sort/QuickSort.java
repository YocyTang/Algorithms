public class QuickSort{
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length-1);
	}
	private static void sort(Comparable[] a, int lo, int hi){
		if(lo>=hi) return ;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	private static void partition(Comparable[] a, int lo, int hi){
		int i = lo, j = hi+1;
		Comparable key = a[lo];
		while(true){
			while(less(a[++i], key)) if(i == hi) break;
			while(less(key, a[--j])) if(j == lo) break;
			if(i>=j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	public static Comparable select(Comparable[] a, int k){
		StdRandom.shuffle(a);
		int lo = 0; hi = a.length-1;
		while(hi > lo) {
			int j = partition(a, lo, hi);
			if(j == k) return a[k];
			else if(j > k) hi = j - 1;
			else if(j < k) lo = j + 1;
		}
		return a[k];
	}
}