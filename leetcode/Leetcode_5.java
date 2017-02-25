public class Letcode_5{
	public String longestPali(String s){
		if(s == null || s.length() == 0){
			return null;
		}
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		for(int i = 0;i<n;i++){
			for(int j = 0; j<n; j++){
				if(i>=j){
					dp[i][j] = true;
				}
			}
		}
		int max =0;
		int start = 0;
		int end = 0;
		for (int j = 1; j<n; j++ ) {
			for(int i = 0; i<j; i++){
				if(s.charAt(i) == s.charAt(j)&& dp[i+1][j-1]){
					dp[i][j] = true;
					if(max<j-i+1){
						max = j-i+1;
						start = i;
						end = j+1;
					}
				}

			}
		}
		return s.substring(start, end);
	}
}