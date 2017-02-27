public class Select{
	public static void sort(comparable[] a) {
		int N = a.length;
		int min;
		for(int i = 0; i < N; i++) {
			min = i;
			for(int j = i + 1; j < a.length; j++){
				if(less(a[j] < a[min]))
					min = j;
			}
			exchange(a, i, min);
		}
	}
}


public class Insertion{
	public static void sort(comparable[] a){
		int N = a.length;
		comparable key;
		for(int i = 0; i < N; i++){
			key = a[i];
			for(int j = i; j>0&& less(a[j-1], key); j--){
				a[j] = a[j-1];
			}
			a[j] = key;
		}
	}
}




public class Shell{
	public static void sort(comparable[] a){
		int N = a.length;
		int h = 1;
		while(h < N/3)
			h=h*3+1
		while(h>=1){
			for(int i = 0; i < N; i++) {
				for(int j = i; j>=h&&less(a[j], a[j-h]); j++) {
					exchange(a, j j-h)
				}
			}
		}
	}
}


public calss Merge{
	private static Comparable[] aux;
	public static void sort(Comparable[] a){
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	private static void sort(Comparable[] a, int lo, int hi){
		if(hi<= lo) return ;
		int mid = lo+(hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	public static void merge(Comparable[] a, int lo,int mid, int hi){
		int i = lo, j = mid+1;
		for(int k = lo, k <=hi; k++) {
			aux[k] = a[k];
		}
		for(int k = lo; k <= hi; k++) {
			if(i > mid) a[k] = aux[j++];
			else if(j > hi) a[k] = aux[i++];
			else if(less(aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = a[i++];
		}
	}
}




public class Quick{
	public static void sort(Comparable[] a){
		StdRandom.shuffle(a);
		sort(a, 0, a.length-1);
	}
	private static void sort(Comparable[] a, int lo, int hi){
		if(hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	private static int partition(Comparable[] a, int lo, int hi){
		int i = lo, j = hi+1;
		Comparable v = a[lo];
		while(true){
			while(less(a[++i], v)) if(i == hi) break;
			while(less(v, a[--j])) if(j == lo) break;
			if(i >= j) break;
			exchange(a, i, j);
		}
		exchange(a, lo, j)
	}
}



 public class MaxPQ<key extends Comparable<key>{
 	private key[] pq;
 	private int N = 0;
 	public MaxPQ(int maxN) {
 		pq = (key[]) new Comparable[maxN+1];
 	}
 	public boolean isEmpty() {
 		return N == 0;
 	}
 	public int size() {
 		return N;
 	}
 	private boolean less(int i, int j) {
 		return pq[i].compareTo(pq[j]) < 0;
 	}
 	private static void exchange(int i, int j){
 		key t = pq[i];
 		pq[i] = pq[j];
 		pq[j] = t;
 	}
 	private void swim(int k) {
 		while(k >1 && less(k/2, k)) {
 			exchange(k/2, k);
 			k = k/2;
 		}
 	}
 	private void sink(int k) {
 		while(2*k <= N ) {
 			int j = 2*k;
 			if(j<N && less(j, j+1)) j++;
 			if(!less(k, j)) break;
 			exchange(k, j);
 			k = j;
 		}
 	}
 	public static void sort(Comparable[] a) {
 		int N = a.length;
 		for(int k = N/2; k>1; k--) {
 			sink(a, k, N);
 		}
 		while (N > 1){
 			exchange(a, 1, N--);
 			sink(a, 1, N)
 		} 
 	}
 }

