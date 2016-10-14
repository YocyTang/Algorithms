public class Solution{
	public int countWays(int[] penny, int target){
		int N = penny.length();
		int[][] pd = new int[N][target+1];
		for(int i =0; i< N; i++){
			pd[i][0] = 1;
		}
		for(int i = 1; penny[0]*i<= target; i++){
			pd[0][penny[0]*i] =1;
		}
		for(int i = 1;i < N; i++){
			for(int j = 0;j<=target;j++){
				if(j >= penny[i]){
					pd[i][j] = pd[i-1][j]+pd[i][j-penny[i]];
				} else{
					pd[i][j] = pd[i-1][j]
				}
			}
		}
		return pd[n-1][target]
	}
}

//找零钱：这么看待问题，用一种币和不用这种币分开动态规划，为什么不用这种币呢，因为penny小于要换的币
