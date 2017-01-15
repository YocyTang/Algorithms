public int duplicateNumber(int[] nums){
	if(nums == null||nums.length == 0){
		return -1;
	}
	int n = nums.length;
	int res;
	for(int i = 0; i< n; i++){
		while(nums[i] != i){
			if(nums[i] == nums[nums[i]]){
				res = nums[i];
				return res;
			}
			swap(nums, i, nums[i]);
		}
	}
}
private void swap(int[] nums, int i, int j){
	int tmp = nums[i];
	nums[i] = nums[j];
	nums[j] = tmp;
}