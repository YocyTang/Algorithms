public static int lcs(char[] x, char[] y){
	int m = x.length;
	int n = y.length;
	int[][] dp  = new int[m+1][n+1];
	for(int i = 1; i <= m; i++){
		for(int j = 1; j<= n; j++){
			if(x[i-1] == y[j-1]){
				dp[i][j] = dp[i-1][j-1]+1;
			}else{
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}			
		}
	}
	return dp[m][n];
}