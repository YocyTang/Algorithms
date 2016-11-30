public class Probability {
	public static double[] prob(int nums){
		int maxSum = nums*6;
		int[] prob = new int[maxSum-nums+1];
		double[] res = new double[maxSum-nums+1];
		prob( nums, prob);
		double total = Math.pow(6.0, nums);
		for(int i = nums; i<=maxSum; i++){
			res[i-nums] = ((double)prob[i-nums]) / total;
		}
		return res;
	}
	private static void prob(int nums, int[] prob){
		for(int i = 1; i<=6; i++){
			prob(nums, nums, i, prob);
		}
	}
	private static void prob(int original, int current, int sum, int[] prob){
		if(current == 1){
			prob[sum-original]++;
		}else{
			for(int i = 1; i<=6; i++){
				prob(original, current-1, i+sum, prob);
			}
		}
	}
	public static void main(String[] args){
		double[] res = prob(12);
		System.out.println(res[2]);
	}
}
