public class Letcode22{
	public int removerDuplicates(int[] nums){
		int n = nums.length();
		int prev = 1;
		int follow = 0;
		while(prev< n){
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
