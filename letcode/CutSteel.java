//动态规划之切钢条
//求最大收益
public int cut(int[] price, int n){
	int[] dp = new int[n+1];
	dp[0] = 0;
	for(int i = 1; i< n; i++){
		int tmp = -1;
		for(int j = 1; j<i; j++){
			tmp = Math.max(q, dp[i-j]+p[i]);
		}
		dp[i] = tmp;
	}
	return dp[n];
}