public class ShellSort{
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h =1;
		while(h < N/3) h = h*3 + 1;
		while(h >= 1) {
			for(int i = 1; i < N; i++) {
				for(int j = i; j >= h && less(a[j], a[j-h]); j -= h)
					exch(a, j, j-h);
			}
			h = h/3;
		}
	}
}