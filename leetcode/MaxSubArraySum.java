//利用动态规划求解连续子数组的最大和，此处为最佳解，空间复杂度1，时间复杂度n
public static int maxSuArraySum(int[] a){
	if(a == null || a.length == 0){
		return 0;
	}
	int n  = a.length;
	int max = a[0];
	int sum = a[0];
	for(int i = 1; i< n ; i++){
		sum = Math.max(sum+a[i], a[i]);
		max = Math.max(max, sum[i]);
	}
	return max;
}