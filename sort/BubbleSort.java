public static void sort(int[] a){
	if(a == null){
		return ;
	}
	for(int i = 0; i< a.length; i++){
		for(int j = 0;j< a.length-1-i; j++){
			if(a[j]>a[j+1]){
				swap(a, j+1, j);
			}
		}
	}
}
static void swap(int[] a, int lo, int hi){
	int temp = a[lo];
	a[lo] = a[hi];
	a[hi] = temp;
}