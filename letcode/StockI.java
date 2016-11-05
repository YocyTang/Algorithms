public class StockI{
	public int solution(int[] prices){
		if(prices == null){
			return  0;
		}
		int n = prices.length;
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i = 0; i< n; i++){
			min = Math.min(prices[i], min);
			max =Math.max(prices[i]-min, max);
		}
		return max;
	}
}