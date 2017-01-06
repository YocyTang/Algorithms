//数组循环右移k位
public void RightShift(int[] a, int k){
	if(k<0){
		throw new RuntimeException();
	}
	if(a == null|| a.length == 0){
		return;
	}

	int n = a.length;
	k = k%n;
	if(k == 0){
		return;
	}
	reverse(a, n-k, n-1);
	reverse(a, 0, n-k-1);
	reverse(a, 0, n-1);
}
private void reverse(int[] a, int lo, int hi){
	int mid = lo+(hi-lo)/2;
	for(int i =lo; i<=mid; i++){
		swap(a, i, hi-i+lo);
	}
}
private void swap(int[] a, int i, int j){
	int tmp = a[i];
	a[i] = a[j];
	a[j] = tmp;
}