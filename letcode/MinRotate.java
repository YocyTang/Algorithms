public int MinRotate(int[] nums){
	if(nums == null||nums.length ==0){
		throw Exception;
	}
	int n = nums.length;
	int index1 =0;
	int index2 = n-1;
	int mid = 0;
	while(nums[index1]>=nums[index2]){
		if(index2-index1 ==1) {
			mid = index2;
			break;
		}
		mid = (index1+index2)/2;

		if(nums[index1] == nums[index2]&& nums[mmid] == nums[index1]){
			return MinOrder(nums, index1, index2);
		}
		if(nums[mid]>=nums[index1]){
			index1 = mid;
		}else{
			index2 = mid;
		}
		return nums[mid];
	}
	private int MinOrder(int nums, int start, int end){
		int res = nums[index1];
		for(int i = index1+1; i<=index2; i++){
			if(res>nums[i])
				res = nums[i];
		}
		return res;
	}
}