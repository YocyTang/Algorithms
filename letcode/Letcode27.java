public int removeElement(int nums[], int target){
	int n = nums.length;
	int count=0;
	for(int i = 0; i< n; i++){
		nums[count++] = nums[i];
	}
	return count;
}