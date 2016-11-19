public class Letcode22{
	public int removerDuplicates(int[] nums){
		int n = nums.length();
		int prev = 0;
		int follow = 1;
		while(prev< follow){
			if(nums[prev] == nums[follow]){
				prev++;
			}else{
				follow++;
				nums[follow] = nums[prev];
				prev++;
			}

		}
		return follow+1;
	}
}