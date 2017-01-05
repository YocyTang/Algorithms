//最长连续递增子数组，动态规划


public static int LongestIncreasingSubSequence(int[] a){
	if(a==null|| a.length == 0){
		return 0;
	}
	int n = a.length;
	int[] dp[] = new int[n];
	max = 0;
	for(int i = 0; i < n; i++){
		dp[i] =1;
		for(int j = 0; j< i; j++){
			if(a[i]>a[j]&&dp[j]+1>dp[i]){
				dp[i] = dp[j]+1;

			}
		}
		max = Math.max(max, dp[i]);

	}
	return max;
}