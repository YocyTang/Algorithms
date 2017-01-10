public class Letcode53{
	public int maxSubArray(int[] nums){
		int max = nums[0];
		int n = nums.length;
		int[] sum = new int[n];
		sum[0] = nums[0];
		for(int i = 1; i<n;i++){
			sum[i] = Math.max(nums[i], sum[i-1]+nums[i]);
			max = Math.max(max, sum[i]);
		}
	}
}