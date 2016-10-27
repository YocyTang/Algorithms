public class Solution{
	public boolean canJump(int[] nums){
		int n = nums.length;
		if(n <=1){
			return true;
		}
		int max = 0;
		int step = 1;
		for(int i = 0 ; i< n; i++){
			step--;
			if(nums[i]+i >max){
				max = i+nums[i];
				step = nums[i];
			}
			if(step == 0 && i < n-1){
				return false;
			}
		}
		return true;
	}
}