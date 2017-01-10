public class Solution{
	public int[] twoSum(int[] nums, target){
		int n = nums.length;
		int[] res = new int[2];
		for(int i = 0; i< n-1; i++){
			for(int j = i+1; j<n;j++){
				if(nums[i]+nums[j] == target){
					res[0] = i;
					res[1] =j;
					return res;
				}
			}
		}
		return res;
	}
	public int[] twoSum2(int[] nums, target){
		int n = nums.length;
		int res[] = new int[2];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i = 0; i< n; i++){
			if(map.containsKey(nums[i])){
				int index = map.get(nums[i]);
				res[0] = index;
				res[1] = i;
				return res;
			}else{
				map.put(target-nums[i], i);
			}
		}
		return res;
	}
}