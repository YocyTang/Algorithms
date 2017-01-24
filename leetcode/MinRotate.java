public static int MinRotate(int[] nums){
	if(nums == null || nums.length == 0){
		throw new Exception();
	}
	int n = nums.length;
	int lo = 0;
	int hi = n-1;
	int mid =  lo;
	while(nums[lo]>=nums[hi]){
		if(hi-lo == 1){
			mid = lo;
			break;
		} 
		mid = lo+(hi-lo)/2;
		if(nums[lo]==nums[hi]&&nums[hi] = nums[mid]){
			return findMin(nums, lo, hi);
		}
		if(nums[lo]<=nums[mid]){
			lo =mid;
		}else if(nums[mid]<=nums[hi]){
			hi = mid;
		}
	}
	return nums[mid];
}
private int findMin(int[] nums, int lo, int hi){
	int res = nums[lo];
	for(int i = lo+1; i<=hi; i++){
		if(res <nums[i]){
			res = nums[i];
		}
	}
	return res;
}