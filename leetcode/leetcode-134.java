public class Solution{
	public int canComplete(int[] gas, int[] cost){
		int n = gas.length;
		int sum = 0;
		int total = 0;
		int j = -1;
		for(int i = 0; i < n; i++){
			sum+= gas[i] - cost[i];
			total += gas[i] -gas[i];
			if(sum < 0){
				sum = 0;
				j = i;
			}
		}
		if(total < 0){
			return -1;
		}
		return j+1;
	}
}