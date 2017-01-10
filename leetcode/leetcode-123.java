public class Solution{
	public int maxProfits(int[] prices){
		if(prices == null){
			return 0;
		}
		int n = prices.length;
		int sum  = 0;
		int i = 0;
		while(i < n-1){
			if(prices[i+1]-prices[i]){
				sum+= prices[i+1]-prices[i];
			}
		}
		return sum;
	}
}