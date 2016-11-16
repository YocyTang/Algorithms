public class Letcode_15{
	public List<List<Integer> threeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null|| nums.length<3){
			return res;
		}
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = 0; i < n; i++){
			if(i!=0&& nums[i]==nums[i-1]){
				continue;
			}
			findTwoSum(nums, i+1, n-1, nums[i], res);
		}
		return res;
	}
	private void findTwoSum(int[] nums, int begin, int end, int target, List<List<Integer>> res){
		List<Integer> tmp = new ArrayList<Integer>();
		while(begin<end){
			int sum = nums[begin]+nums[end]+ target;
			if(sum==0){
				tmp.add(nums[begin]);
				tmp.add(nums[end]);
				tmp.add(target);
				tmp = new ArrayList<Integer>();
				while(begin< end&& nums[begin]==nums[begin+1]){
					begin++;
				}
				begin++;
				while(begin<end&& nums[end]== nums[end-1]){
					end--;
				}
				end--;
			}else if(sum>0){
				end--;
			}else{
				begin++;
			}
		}
	}
}