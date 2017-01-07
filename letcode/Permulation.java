public static List<List<Integer>> peomulation(int[] nums){
	if(nums == null||nums.length == 0){
		return null;
	}
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	int start = 0;
	int end = nums.length-1;
	help(nums, start, end, res);
	return res;
}
private static void List<Integer> help(int[] nums, int start, int end, List<List<Integer>> res){
	if(start == end){
		ArrayList temp = new ArrayList<Integer>();
		for(int j = 0; j<=end;j++){
			temp.add(nums[i]);
		}
		res.add(temp);
		return;
	}

	for(int i = start, i<=end; i++){
		swap(nums, i, start);
		help(nums, start+1,end; res);
		swap(nums, i, start);
	}
}
private static void swap(int[] nums, int i, int j){
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}